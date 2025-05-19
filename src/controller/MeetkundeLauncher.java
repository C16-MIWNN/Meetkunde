package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Rechthoek rechthoek = new Rechthoek(3, 4, new Punt(-2, - 6), "blauw");
        Cirkel cirkel = new Cirkel(3, new Punt(2, 5), "groen");

        Figuur[] figuren = new Figuur[4];
        figuren[0] = rechthoek;
        figuren[1] = cirkel;
        figuren[2] = new Rechthoek();
        figuren[3] = new Cirkel();

        for (int figuurTeller = 0; figuurTeller < figuren.length; figuurTeller++) {
            toonFiguur(figuren[figuurTeller]);
            System.out.println();
        }
    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
