import java.util.*;
import java.text.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

class PostgreSQL_connection{
    String url;
    String user;
    String password;

    public PostgreSQL_connection(){
        url = "jdbc:postgresql://localhost/db1";
        user = "postgres";
        password = "Giomartagio1";
    }

    public Connection connect() {    
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
        return conn;
    }
}




public class HelloWorld {
    public static void main (String [] args){
        PostgreSQL_connection c = new PostgreSQL_connection();
        c.connect();
        Anagrafica p1 = new Anagrafica(1, "Giovanni", "Di Martino");
        
    }

}