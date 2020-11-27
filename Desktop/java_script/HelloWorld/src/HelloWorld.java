import java.util.*;
import java.text.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Anagrafica{
    int idAna;
    String nome;
    String cognome;
    Date date_create;
    Date date_agg;

    public void SetDate() {
        Date d = new Date();
        date_create = d;
        date_agg = d;
    }

    public void PrintAnagrafica(){
        SimpleDateFormat ft = new SimpleDateFormat ("HH:mm:ss yyyy/MM/dd");
        System.out.println(idAna + " " + nome + " " + cognome + " " + ft.format(date_create));
    }

    public Anagrafica(int id, String in_nome, String in_cognome){
        nome = in_nome;
        cognome = in_cognome;
        SetDate();
        PrintAnagrafica();
    }
}

class POSTGRESQL_connection{

    public POSTGRESQL_connection(){
        String url = "jdbc:postgresql://localhost:5432/db1";
        Properties props = new Properties();
        props.setProperty("user","giova");
        props.setProperty("password","Giomartagio1");
        props.setProperty("ssl","true");
        try (Connection connection = DriverManager.getConnection(url, props) ) {

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            System.out.println("Reading car records...");
            System.out.printf("%-30.30s  %-30.30s%n", "Model", "Price");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.cars");
            while (resultSet.next()) {
                System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("model"), resultSet.getString("price"));
            }
        }
        catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }

    }
}


public class HelloWorld {

    public static void main (String [] args){
        POSTGRESQL_connection connect = new POSTGRESQL_connection();
        Anagrafica p1 = new Anagrafica(1, "Giovanni", "Di Martino");
        
    }

}