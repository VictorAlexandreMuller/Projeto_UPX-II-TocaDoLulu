package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java1.Classes.Pets;
import java1.Classes.PetsPlanosValores;
import javax.swing.JOptionPane;

public class PetsDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Pets> listaPets = new ArrayList<>();
    ArrayList<PetsPlanosValores> listaCargo = new ArrayList<>();
    
    public void cadastrarPets(Pets objPets) {
        String sql = "insert into funcionario";
    }
    
    public ResultSet listarPets() {
        conn = new ConexaoDAO().conectaBD();
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
