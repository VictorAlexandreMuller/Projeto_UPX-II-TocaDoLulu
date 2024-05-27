package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java1.Classes.Usuarios;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class UsuariosDAO {
    
    private EntityManager em;

    public UsuariosDAO(EntityManager em) {
        this.em = em;
    }

    public UsuariosDAO() {
        
    }

    public void cadastrar(Usuarios usuario){
        this.em.persist(usuario);
    }
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(Usuarios objusuario) {
        conn = new ConexaoDAOviaJDBC().conectaBD();
        
        try {
            String sql = "SELECT * FROM Usuarios where email = ? and senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuario.getEmail());
            pstm.setString(2, objusuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
    
    
}
