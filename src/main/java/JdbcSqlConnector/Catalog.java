package JdbcSqlConnector;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Catalog {
    private final static String QUERY_FIND_MY_BASE = "SELECT * FROM FirstDataBase.Veterinar";
    private final static String QUERY_FIND_BY_BIKE = "SELECT * FROM FirstDataBase.Garage where Transport = 'Bike'";
    private final static String QUERY_FIND_BY_PASSWORD = "SELECT * FROM FirstDataBase.UserTable WHERE Password LIKE '3%'";

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mysql";
        String userName = "root";
        String password = "eev0507303539";

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY_FIND_MY_BASE);

            List<VetClinic> vetClinicList = new LinkedList<>();
            while (resultSet.next()) {
                VetClinic vetClinic = buildVetClinic(resultSet);
                vetClinicList.add(vetClinic);
            }
            System.out.println(vetClinicList);
            System.out.println(vetClinicList.size());
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY_FIND_BY_BIKE);

            List<Garage> garageList = new LinkedList<>();
            while (resultSet.next()) {
                Garage garage = buildGarage(resultSet);
                garageList.add(garage);
            }
            System.out.println(garageList);
            System.out.println(garageList.size());
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY_FIND_BY_PASSWORD);

            List<UserTable> userTableList = new LinkedList<>();
            while (resultSet.next()) {
                UserTable userTable = buildUserTable(resultSet);
                userTableList.add(userTable);
            }
            System.out.println(userTableList);
            System.out.println(userTableList.size());
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static VetClinic buildVetClinic(ResultSet resultSet) throws SQLException {
        VetClinic vetClinic = new VetClinic();
        vetClinic.setPet(resultSet.getString(1));
        vetClinic.setName(resultSet.getString(2));
        vetClinic.setAge(resultSet.getInt(3));
        vetClinic.setWeight(resultSet.getInt(4));
        vetClinic.setCondition(resultSet.getString(5));
        return vetClinic;
    }

    private static Garage buildGarage(ResultSet resultSet) throws SQLException {
        Garage garage = new Garage();
        garage.setTransport(resultSet.getString(1));
        garage.setPassengers(resultSet.getInt(2));
        garage.setPrice(resultSet.getDouble(3));
        garage.setColor(resultSet.getString(4));
        return garage;
    }

    private static UserTable buildUserTable(ResultSet resultSet) throws SQLException {
        UserTable userTable = new UserTable();
        userTable.setUserLogin(resultSet.getString(1));
        userTable.setPassword(resultSet.getString(2));
        userTable.setFirstName(resultSet.getString(3));
        userTable.setLastName(resultSet.getString(4));
        userTable.setEmail(resultSet.getString(5));
        return userTable;
    }
}
