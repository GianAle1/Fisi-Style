package bdmysql;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBD {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/SistemaVentas";
    
    String username = "root";
    String clave = "root";
    
    Connection conn = null;
    
    public Connection conectar()
    {
        try{
            conn = DriverManager.getConnection(url, username, clave);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.", "Error de conexión",JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
}
