package controller;

import model.*;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak mijnOppervlak = new Oppervlak(30, 20);

        mijnOppervlak.voegFiguurToe(new Cirkel(11));
        mijnOppervlak.voegFiguurToe(new Rechthoek(35, 10));

        System.out.println(mijnOppervlak);
    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
