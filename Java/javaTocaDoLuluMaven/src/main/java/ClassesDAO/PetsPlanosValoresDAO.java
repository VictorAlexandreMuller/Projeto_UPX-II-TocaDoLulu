package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java1.Classes.PetsPlanosValores;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class PetsPlanosValoresDAO {
    private EntityManager em;

    public PetsPlanosValoresDAO(EntityManager em) {
        this.em = em;
    }

    public PetsPlanosValoresDAO() {
        
    }
    
    public void cadastrar(PetsPlanosValores petsplanosvalores){
        this.em.persist(petsplanosvalores);
    }
    
    
    
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
        
    public ResultSet listarComboPlanos() {
        conn = new ConexaoDAOviaJDBC().conectaBD();
        String sql = "SELECT * FROM Pets_Planos_Valores;";
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarPets PetsDAO" + erro.getMessage());
            return null;
        }
    }
    
}
