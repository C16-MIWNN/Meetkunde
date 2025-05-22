package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();

        try {
            Scanner rechthoekCSVScanner = new Scanner(new File("resources/Rechthoek.csv"));

            while (rechthoekCSVScanner.hasNextLine()) {
                String[] regelBrokjes = rechthoekCSVScanner.nextLine().split(",");

                double lengte = Double.parseDouble(regelBrokjes[0]);
                double breedte = Double.parseDouble(regelBrokjes[1]);

                double xCoordinaat = Double.parseDouble(regelBrokjes[2]);
                double yCoordinaat = Double.parseDouble(regelBrokjes[3]);

                String kleur = regelBrokjes[4];

                Punt hoekpuntLinksBoven = new Punt(xCoordinaat, yCoordinaat);
                rechthoeken.add(new Rechthoek(lengte, breedte, hoekpuntLinksBoven, kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Het is niet gelukt om het rechthoeken bestand te openen.");
        }

        for (Rechthoek rechthoek : rechthoeken) {
            toonFiguur(rechthoek);
            System.out.println();
        }
    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
