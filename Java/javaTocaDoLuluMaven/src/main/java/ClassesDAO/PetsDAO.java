package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java1.Classes.Pets;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class PetsDAO {
    
    private EntityManager em;
    
    public PetsDAO(EntityManager em) {
        this.em = em;
    }
        
    public void cadastrar(Pets pet){
        this.em.persist(pet);
    }
    
    // Construtor vazio
        public PetsDAO() {
        
    }

    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet consultaTipo_Plano() {
        conn = new ConexaoDAOviaJDBC().conectaBD();
        String sql = "SELECT * FROM Pets_Planos_Valores";
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConsultaTipo_Plano" + erro.getMessage());
            return null;
        }
    }
}
