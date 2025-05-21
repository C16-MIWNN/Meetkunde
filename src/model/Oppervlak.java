package model;

import java.util.ArrayList;
import java.util.Collections;

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
        if (figuur.pastInOppervlak(lengte, breedte)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur past niet");
        }
    }

    @Override
    public String toString() {
        StringBuilder oppervlakString = new StringBuilder("Mijn oppervlak bevat de volgende figuren:");

        Collections.sort(mijnFiguren);

        for (Figuur figuur : mijnFiguren) {
            oppervlakString.append("\n\n").append(figuur.toString());
        }

        return oppervlakString.toString();
    }
}
