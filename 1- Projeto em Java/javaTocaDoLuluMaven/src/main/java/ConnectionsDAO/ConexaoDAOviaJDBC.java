package ConnectionsDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAOviaJDBC {
    
    
    // Método 1 de conexão -----------------------------------------------------------------------------
    private static String db = "toca_do_lulu_upx";
    private static String url = "jdbc:mysql://localhost:3306/"+db+"?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC";
    private static String usuario = "root";
    private static String senha = "root";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException ex) {
            System.out.println(ConexaoDAOviaJDBC.class.getName()+ " "+ ex.getMessage());
        }
        return null;
    }
    
    
    
    
    // Método 2 de conexão -----------------------------------------------------------------------------
    // Conexão usada do PetsDAO
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/toca_do_lulu_upx?user=root&password=root";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conn;
    }
}
