package controller;

import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Cirkel cirkel = null;

        while (cirkel == null) {
            System.out.print("Geef een straal: ");

            try {
                double straal = keyboard.nextDouble();
                cirkel = new Cirkel(straal);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Geen cirkel gemaakt vanwege: " + illegalArgumentException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Je moet een komma-getal invoeren!");
                keyboard.nextLine();
            } finally {
                System.out.println("We gaan het nu (eventueel) nog een keer proberen");
            }

        }

        System.out.println(cirkel);
    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
