package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkels = new Cirkel[3];

        mijnCirkels[0] = new Cirkel();
        mijnCirkels[1] = new Cirkel(5.7);
        mijnCirkels[2] = new Cirkel(6, 1, 4, "turqoise");

        for (int cirkel = 0; cirkel < mijnCirkels.length; cirkel++) {
            System.out.println(mijnCirkels[cirkel].geefOppervlakte());
            System.out.println(mijnCirkels[cirkel].vertelOverGrootte());
        }
    }

}
