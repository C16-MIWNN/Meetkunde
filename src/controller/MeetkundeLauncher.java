package controller;

import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Rechthoek[] rechthoeken = new Rechthoek[3];

        rechthoeken[0] = new Rechthoek();
        rechthoeken[1] = new Rechthoek(10, 11);
        rechthoeken[2] = new Rechthoek(5, 8, new Punt(3, 2), "ogre");

        for (int rechthoek = 0; rechthoek < rechthoeken.length; rechthoek++) {
            System.out.println(rechthoeken[rechthoek].geefOppervlakte());
            System.out.println(rechthoeken[rechthoek].vertelOverGrootte());
        }

    }

}
