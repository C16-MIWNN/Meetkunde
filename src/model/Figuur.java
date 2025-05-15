package model;

/**
 * @author Vincent Velthuizen
 * Beschrijft de algemene eigenschappen van een meetkundig-figuur
 */
public class Figuur {
    protected static final String DEFAULT_KLEUR = "duck egg";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this.kleur = DEFAULT_KLEUR;
    }

    public double geefOmtrek() {
        return 0.0;
    }

    public double geefOppervlakte() {
        return 0.0;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is niet EERLIJK!";
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s\nOmtrek: %.2f\nOppervlakte: %.2f",
                kleur, geefOmtrek(), geefOppervlakte());
    }
}
