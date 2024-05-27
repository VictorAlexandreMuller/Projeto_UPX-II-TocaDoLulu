package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public ArrayList<PetsPlanosValores> getAll() {
        String sql = "SELECT * FROM Pets_Planos_Valores";
        
        ArrayList<PetsPlanosValores> lstPetsPlanValores = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String plano = rs.getString("plano");
                double valor = rs.getInt("valor");

                PetsPlanosValores petsPlanValores = new PetsPlanosValores(id, plano, valor);
                lstPetsPlanValores.add(petsPlanValores);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar PetsPlanosValores getAll: " + ex.getMessage());
        }
        return lstPetsPlanValores;
    }
    
    public ArrayList<PetsPlanosValores> getPlano() {
        String sql = "SELECT plano as Plano FROM Pets_Planos_Valores";
        
        ArrayList<PetsPlanosValores> lstPetsPlanValores = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String plano = rs.getString("plano");

                PetsPlanosValores petsPlanValores = new PetsPlanosValores(plano);
                lstPetsPlanValores.add(petsPlanValores);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar PetsPlanosValores getAll: " + ex.getMessage());
        }
        return lstPetsPlanValores;
    }
    
}
