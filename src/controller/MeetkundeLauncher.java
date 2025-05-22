package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Cirkel> cirkels = new ArrayList<>();

        try {
            Scanner stralenBestand = new Scanner(new File("resources/stralen2.txt"));

            while (stralenBestand.hasNext()){
                double straal = stralenBestand.nextDouble();
                cirkels.add(new Cirkel(straal));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Het bestand kon niet geopend worden.");
        }

        System.out.println("Dit zijn de cirkels:");

        for (Cirkel cirkel : cirkels) {
            toonFiguur(cirkel);
            System.out.println();
        }
    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
