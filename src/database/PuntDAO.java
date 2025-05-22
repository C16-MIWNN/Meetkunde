package database;

import model.Punt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Schrijf punten naar of haal punten uit de database
 */
public class PuntDAO {
    private final DBaccess dBaccess;

    public PuntDAO(DBaccess dBaccess) {
        this.dBaccess = dBaccess;
    }

    public void slaPuntOp(Punt punt) {
        String sql = "INSERT INTO punt VALUES (?, ?);";

        try {
            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);

            preparedStatement.setDouble(1, punt.getxCoordinaat());
            preparedStatement.setDouble(2, punt.getyCoordinaat());

            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }
    }

    public ArrayList<Punt> getPunten() {
        ArrayList<Punt> punten = new ArrayList<>();

        String sql = "SELECT xcoordinaat, ycoordinaat FROM Punt;";

        try {
            PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                double xCoordinaat = resultSet.getDouble("xcoordinaat");
                double yCoordinaat = resultSet.getDouble("ycoordinaat");

                punten.add(new Punt(xCoordinaat, yCoordinaat));
            }
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }

        return punten;
    }
}
