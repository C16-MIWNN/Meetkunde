package model;

/**
 * @author Vincent Velthuizen
 * Beschrijft de algemene eigenschappen van een meetkundig-figuur
 */
public abstract class Figuur implements Comparable<Figuur>, ToelaatbaarInOppervlak {
    protected static final String DEFAULT_KLEUR = "duck egg";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this.kleur = DEFAULT_KLEUR;
    }

    public abstract double geefOmtrek();

    public abstract double geefOppervlakte();

    public boolean isGroot() {
        return geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR;
    }

    public String vertelOverGrootte() {
        if (isGroot()) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is niet EERLIJK!";
        }
    }

    @Override
    public int compareTo(Figuur anderFiguur) {
//        return -1 * this.kleur.compareTo(anderFiguur.kleur);
        if (this.geefOppervlakte() > anderFiguur.geefOppervlakte()) {
            return 1;
        } else if (this.geefOppervlakte() < anderFiguur.geefOppervlakte()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s\nOmtrek: %.2f\nOppervlakte: %.2f",
                kleur, geefOmtrek(), geefOppervlakte());
    }
}
