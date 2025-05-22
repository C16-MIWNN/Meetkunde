package controller;

import database.DBaccess;
import database.PuntDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

/**
 * @author Vincent Velthuizen
 * Speel met meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("Figuren", "userFiguren", "userFigurenPW");
        dBaccess.openConnection();

        PuntDAO puntDAO = new PuntDAO(dBaccess);
//        puntDAO.slaPuntOp(new Punt(-5, 6));

        for (Punt punt : puntDAO.getPunten()) {
            System.out.println(punt);
        }
    }

    public static void toonFiguur(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
    }

}
