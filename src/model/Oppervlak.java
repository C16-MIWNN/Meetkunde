package model;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Een oppervlak waar figuren op geplaats kunnen worden
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuurPastAlsVormInOppervlak(figuur)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur past niet");
        }
    }

    private boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean past = false;

        if (figuur instanceof Rechthoek) {
            past = ((Rechthoek) figuur).getLengte() <= lengte && ((Rechthoek) figuur).getBreedte() <= breedte;
        } else if (figuur instanceof Cirkel) {
            past = ((Cirkel) figuur).getStraal() <= lengte / 2 && ((Cirkel) figuur).getStraal() <= breedte / 2;
        }

        return past;
    }

    @Override
    public String toString() {
        StringBuilder oppervlakString = new StringBuilder("Mijn oppervlak bevat de volgende figuren:");

        for (Figuur figuur : mijnFiguren) {
            oppervlakString.append("\n\n").append(figuur.toString());
        }

        return oppervlakString.toString();
    }
}
