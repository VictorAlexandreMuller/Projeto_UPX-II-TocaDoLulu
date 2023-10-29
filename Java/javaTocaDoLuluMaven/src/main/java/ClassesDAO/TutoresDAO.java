package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        String sql = "SELECT Id FROM Tutores;";
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarTutores TutoresDAO" + erro.getMessage());
            return null;
        }
    }
    
    public void inserir(Tutores tutor) {
        String sql = "INSERT INTO Tutores (nome, tipo_documento, documento_identificador, "
                + "nascimento, cep, logradouro, numero, bairro, UF, municipio, complemento, "
                + "ddd_1, celular_1, email_1, ddd_2, celular_2, email_2, tipo_rede_1, "
                + "rede_social_1, tipo_rede_2, rede_social_2, observacoes) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tutor.getNome());
            stmt.setString(2, tutor.getTipo_documento());
            stmt.setString(3, tutor.getDocumento_identificador());
            
            String dia = tutor.getNascimento().substring(0, 2);
            String mes = tutor.getNascimento().substring(3, 5);
            String ano = tutor.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            
            stmt.setString(4, dataParaMySQL);
            stmt.setInt(5, tutor.getCep());
            stmt.setString(6, tutor.getLogradouro());
            stmt.setString(7, tutor.getNumero());
            stmt.setString(8, tutor.getBairro());
            stmt.setString(9, tutor.getUf());
            stmt.setString(10, tutor.getMunicipio());
            stmt.setString(11, tutor.getComplemento());
            stmt.setInt(12, tutor.getDdd_1());
            stmt.setInt(13, tutor.getCelular_1());
            stmt.setString(14, tutor.getEmail_1());
            stmt.setInt(15, tutor.getDdd_2());
            stmt.setInt(16, tutor.getCelular_2());
            stmt.setString(17, tutor.getEmail_2());
            stmt.setString(18, tutor.getTipo_rede_1());
            stmt.setString(19, tutor.getRede_social_1());
            stmt.setString(20, tutor.getTipo_rede_2());
            stmt.setString(21, tutor.getRede_social_2());
            stmt.setString(22, tutor.getObservacoes());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Tutor cadastrado com sucesso!");
    }
    
    public void editar(Tutores tutor) {
        String sql = "UPDATE Tutores SET nome = ?, tipo_documento = ?, documento_identificador = ?, "
                + "nascimento = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, uf = ?, municipio = ?, "
                + "complemento = ?, ddd_1 = ?, celular_1 = ?, email_1 = ?, ddd_2 = ?, celular_2 = ?, email_2 = ?, "
                + "tipo_rede_1 = ?, rede_social_1 = ?, tipo_rede_2 = ?, rede_social_2 = ?, observacoes = ? WHERE id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tutor.getNome());
            stmt.setString(2, tutor.getTipo_documento());
            stmt.setString(3, tutor.getDocumento_identificador());
            
            String dia = tutor.getNascimento().substring(0, 2);
            String mes = tutor.getNascimento().substring(3, 5);
            String ano = tutor.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            
            stmt.setString(4, dataParaMySQL);
            stmt.setInt(5, tutor.getCep());
            stmt.setString(6, tutor.getLogradouro());
            stmt.setString(7, tutor.getNumero());
            stmt.setString(8, tutor.getBairro());
            stmt.setString(9, tutor.getUf());
            stmt.setString(10, tutor.getMunicipio());
            stmt.setString(11, tutor.getComplemento());
            stmt.setInt(12, tutor.getDdd_1());
            stmt.setInt(13, tutor.getCelular_1());
            stmt.setString(14, tutor.getEmail_1());
            stmt.setInt(15, tutor.getDdd_2());
            stmt.setInt(16, tutor.getCelular_2());
            stmt.setString(17, tutor.getEmail_2());
            stmt.setString(18, tutor.getTipo_rede_1());
            stmt.setString(19, tutor.getRede_social_1());
            stmt.setString(20, tutor.getTipo_rede_2());
            stmt.setString(21, tutor.getRede_social_2());
            stmt.setString(22, tutor.getObservacoes());
            
            stmt.execute();
  
        } catch (SQLException ex) {
            System.out.println("Erro ao editar produto: " + ex.getMessage());
        }
    }
    
    public boolean excluir(int codigo) {
        String sql = "delete from Tutores where id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            return stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir produto: " + ex.getMessage());
        }
        return false;
    }
    
    public ArrayList<Tutores> getAll() {
        String sql = "SELECT * FROM Tutores";
        
        ArrayList<Tutores> tutores = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                String tipo_documento = rs.getString("tipo_documento");
                String documento_identificador = rs.getString("documento_identificador");
                String nascimento = rs.getString("nascimento");
                int cep = rs.getInt("cep");
                String logradouro = rs.getString("logradouro");
                String numero = rs.getString("numero");
                String bairro = rs.getString("bairro");
                String UF = rs.getString("UF");
                String municipio = rs.getString("municipio");
                String complemento = rs.getString("complemento");
                int ddd_1 = rs.getInt("ddd_1");
                int celular_1 = rs.getInt("celular_1");
                int ddd_2 = rs.getInt("ddd_2");
                int celular_2 = rs.getInt("celular_2");
                String email_1 = rs.getString("email_1");
                String email_2 = rs.getString("email_2");
                String tipo_rede_1 = rs.getString("tipo_rede_1");
                String rede_social_1 = rs.getString("rede_social_1");
                String tipo_rede_2 = rs.getString("tipo_rede_2");
                String rede_social_2 = rs.getString("rede_social_2");
                String observacoes = rs.getString("observacoes");

                Tutores tutor = new Tutores(id, nome, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro, 
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, tipo_rede_1,rede_social_1, tipo_rede_2, rede_social_2, observacoes);
                tutores.add(tutor);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos produto: " + ex.getMessage());
        }
        return tutores;
    }
    
    public ArrayList<Tutores> getColunasTableTutores() {
        String sql = "SELECT * FROM Tutores";
        
        ArrayList<Tutores> tutores = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                int ddd_1 = rs.getInt("ddd_1");
                int celular_1 = rs.getInt("celular_1");
                String email_1 = rs.getString("email_1");
                
                Tutores tutor = new Tutores(id, nome, ddd_1, celular_1, email_1);
                tutores.add(tutor);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos produto: " + ex.getMessage());
        }
        return tutores;
    }
    
    public Tutores getByID(int idParam) {
        String sql = "SELECT * FROM tutores where id=?";
        Tutores tutor = null;

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setInt(1, idParam);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                String tipo_documento = rs.getString("tipo_documento");
                String documento_identificador = rs.getString("documento_identificador");
                String nascimento = rs.getString("nascimento");
                int cep = rs.getInt("cep");
                String logradouro = rs.getString("logradouro");
                String numero = rs.getString("numero");
                String bairro = rs.getString("bairro");
                String UF = rs.getString("UF");
                String municipio = rs.getString("municipio");
                String complemento = rs.getString("complemento");
                int ddd_1 = rs.getInt("ddd_1");
                int celular_1 = rs.getInt("celular_1");
                int ddd_2 = rs.getInt("ddd_2");
                int celular_2 = rs.getInt("celular_2");
                String email_1 = rs.getString("email_1");
                String email_2 = rs.getString("email_2");
                String tipo_rede_1 = rs.getString("tipo_rede_1");
                String rede_social_1 = rs.getString("rede_social_1");
                String tipo_rede_2 = rs.getString("tipo_rede_2");
                String rede_social_2 = rs.getString("rede_social_2");
                String observacoes = rs.getString("observacoes");

                tutor = new Tutores(id, nome, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro, 
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, tipo_rede_1,rede_social_1, tipo_rede_2, rede_social_2, observacoes);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos produto: " + ex.getMessage());
        }
        return tutor;
    }
    
}
