package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java1.Classes.Tutores;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class TutoresDAO {
    
    private EntityManager em;

    public TutoresDAO(EntityManager em) {
        this.em = em;
    }

    public TutoresDAO() {
        
    }
    
    public void cadastrar(Tutores tutores){
        this.em.persist(tutores);
    }
    
    
    
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet listarComboTutores() {
        conn = new ConexaoDAOviaJDBC().conectaBD();
        String sql = "SELECT Id, Nome FROM Tutores;";
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarTutores TutoresDAO" + erro.getMessage());
            return null;
        }
    }
}
