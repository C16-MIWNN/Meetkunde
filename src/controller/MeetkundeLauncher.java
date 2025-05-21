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

        mijnOppervlak.voegFiguurToe(new Cirkel(9));
        mijnOppervlak.voegFiguurToe(new Rechthoek(25, 10));
        mijnOppervlak.voegFiguurToe(new Rechthoek(3, 1));
        mijnOppervlak.voegFiguurToe(new Rechthoek(5, 10));
        mijnOppervlak.voegFiguurToe(new Rechthoek(35, 15));
        mijnOppervlak.voegFiguurToe(new Cirkel(3));

        System.out.println(mijnOppervlak);
    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
