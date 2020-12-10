package conexion;
import java.sql.*;

public class Conexion {    
    
    public  Connection connect() {  
        Connection conn = null;  
        try {  
            Class.forName("org.sqlite.JDBC");            
            String url = "jdbc:sqlite:D:\\eder\\archivos 2020\\2020-2\\poo\\sesion 11\\db\\ventas1";
            conn = DriverManager.getConnection(url);  
            System.out.println(conn);  
            System.out.println("Connection to SQLite has been established.");  
            
        } catch (SQLException | ClassNotFoundException e) {  
            System.out.println("capturando error: "+e.getMessage());  
        }  
        return conn;
    }
    
}
