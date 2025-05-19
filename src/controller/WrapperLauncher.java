package controller;

/**
 * @author Vincent Velthuizen
 * Experimenteren met Wrapper klassen
 */
public class WrapperLauncher {

    public static void main(String[] args) {
        int getal = 3;
        Integer getalObject = new Integer(3);
        Integer getalObject2 = Integer.valueOf(3);

        Object[] getallen = new Object[4];
        getallen[0] = getal;

        getalObject = getal;
    }
}
