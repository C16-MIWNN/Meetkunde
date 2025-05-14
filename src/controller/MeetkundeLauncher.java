package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        System.out.println(Cirkel.geefDefinitie());


        Cirkel cirkel = new Cirkel();
        Cirkel mijnEersteCirkel = new Cirkel(3, 1, 4, "diep zwart");

        System.out.println(mijnEersteCirkel.geefOppervlakte());
        System.out.println(mijnEersteCirkel.geefDefinitie());
    }

}
