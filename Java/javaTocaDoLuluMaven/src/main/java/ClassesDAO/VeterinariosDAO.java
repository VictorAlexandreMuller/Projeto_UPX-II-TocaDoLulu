package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java1.Classes.Veterinarios;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class VeterinariosDAO {
    
    private EntityManager em;

    public VeterinariosDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Veterinarios veterinarios){
        this.em.persist(veterinarios);
    }

    public VeterinariosDAO() {
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet listarComboVeterinarios() {
        conn = new ConexaoDAOviaJDBC().conectaBD();
        String sql = "SELECT Id FROM Veterinarios;";
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarVeterinarios VeterinariosDAO" + erro.getMessage());
            return null;
        }
    }
    
    public void inserir(Veterinarios veterinario) {
        String sql = "INSERT INTO Veterinarios (nome, tipo_documento, documento_identificador, crmv, "
                + "nascimento, cep, logradouro, numero, bairro, UF, municipio, complemento, "
                + "ddd_1, celular_1, email_1, valor, ddd_2, celular_2, email_2, observacoes) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, veterinario.getNome());
            stmt.setString(2, veterinario.getTipo_documento());
            stmt.setString(3, veterinario.getDocumento_identificador());
            stmt.setString(4, veterinario.getCrmv());
            
            String dia = veterinario.getNascimento().substring(0, 2);
            String mes = veterinario.getNascimento().substring(3, 5);
            String ano = veterinario.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            stmt.setString(5, dataParaMySQL);
            
            stmt.setInt(6, veterinario.getCep());
            stmt.setString(7, veterinario.getLogradouro());
            stmt.setString(8, veterinario.getNumero());
            stmt.setString(9, veterinario.getBairro());
            stmt.setString(10, veterinario.getUf());
            stmt.setString(11, veterinario.getMunicipio());
            stmt.setString(12, veterinario.getComplemento());
            stmt.setInt(13, veterinario.getDdd_1());
            stmt.setInt(14, veterinario.getCelular_1());
            stmt.setString(15, veterinario.getEmail_1());
            stmt.setDouble(16, veterinario.getValor());
            stmt.setInt(17, veterinario.getDdd_2());
            stmt.setInt(18, veterinario.getCelular_2());
            stmt.setString(19, veterinario.getEmail_2());
            stmt.setString(20, veterinario.getObservacoes());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao INSERIR VETERINARIO: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Veterinário cadastrado com sucesso!");
    }
    
    
    
    public void editar(Veterinarios veterinario) {
        String sql = "UPDATE Veterinarios SET nome = ?, tipo_documento = ?, documento_identificador = ?, crmv = ? "
                + "nascimento = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, uf = ?, municipio = ?, "
                + "complemento = ?, ddd_1 = ?, celular_1 = ?, email_1 = ?, valor = ?, ddd_2 = ?, celular_2 = ?, email_2 = ?, observacoes = ? WHERE id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, veterinario.getNome());
            stmt.setString(2, veterinario.getTipo_documento());
            stmt.setString(3, veterinario.getDocumento_identificador());
            stmt.setString(4, veterinario.getCrmv());
            
            String dia = veterinario.getNascimento().substring(0, 2);
            String mes = veterinario.getNascimento().substring(3, 5);
            String ano = veterinario.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            stmt.setString(5, dataParaMySQL);
            
            stmt.setInt(6, veterinario.getCep());
            stmt.setString(7, veterinario.getLogradouro());
            stmt.setString(8, veterinario.getNumero());
            stmt.setString(9, veterinario.getBairro());
            stmt.setString(10, veterinario.getUf());
            stmt.setString(11, veterinario.getMunicipio());
            stmt.setString(12, veterinario.getComplemento());
            stmt.setInt(13, veterinario.getDdd_1());
            stmt.setInt(14, veterinario.getCelular_1());
            stmt.setString(15, veterinario.getEmail_1());
            stmt.setDouble(16, veterinario.getValor());
            stmt.setInt(17, veterinario.getDdd_2());
            stmt.setInt(18, veterinario.getCelular_2());
            stmt.setString(19, veterinario.getEmail_2());
            stmt.setString(20, veterinario.getObservacoes());
            
            stmt.setInt(21, veterinario.getId());
            
            stmt.execute();
  
        } catch (SQLException ex) {
            System.out.println("Erro ao EDITAR VETERINARIO: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Veterinário alterado com sucesso.");
    }
    
    
    
    public boolean excluir(int codigo) {
        String sql = "delete from Veterinarios where id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            return stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao EXCLUIR VETERINARIO: " + ex.getMessage());
        }
        return false;
    }
    
    
    
    public ArrayList<Veterinarios> getAll() {
        String sql = "SELECT * FROM Veterinarios";
        
        ArrayList<Veterinarios> veterinarios = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String tipo_documento = rs.getString("tipo_documento");
                String documento_identificador = rs.getString("documento_identificador");
                String crmv = rs.getString("crmv");
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
                double valor = rs.getDouble("valor");
                String observacoes = rs.getString("observacoes");

                Veterinarios veterinario = new Veterinarios(id, nome, tipo_documento, documento_identificador, crmv, nascimento, cep, logradouro, numero, bairro, 
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, valor, observacoes);
                veterinarios.add(veterinario);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar VETERINARIOS getAll: " + ex.getMessage());
        }
        return veterinarios;
    }
    
    
    
    public static ArrayList<Veterinarios> getColunasTableVeterinarios() {
        String sql = "SELECT * FROM Veterinarios";
        
        ArrayList<Veterinarios> veterinarios = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int ddd_1 = rs.getInt("ddd_1");
                int celular_1 = rs.getInt("celular_1");
                String email_1 = rs.getString("email_1");
                double valor = rs.getDouble("valor");
                
                Veterinarios veterinario = new Veterinarios(id, nome, ddd_1, celular_1, email_1, valor);
                veterinarios.add(veterinario);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar VETERINARIOS ColunasTableVeterinarios: " + ex.getMessage());
        }
        return veterinarios;
    }
    
    

    
    public Veterinarios getByID(int idParam) {
        String sql = "SELECT * FROM Veterinarios where id=?";
        Veterinarios veterinario = null;

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setInt(1, idParam);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String tipo_documento = rs.getString("tipo_documento");
                String documento_identificador = rs.getString("documento_identificador");
                String crmv = rs.getString("crmv");
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
                double valor = rs.getDouble("valor");
                String observacoes = rs.getString("observacoes");

                veterinario = new Veterinarios(id, nome, tipo_documento, documento_identificador, crmv, nascimento, cep, logradouro, numero, bairro, 
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, valor, observacoes);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar VETERINARIOS ByID: " + ex.getMessage());
        }
        return veterinario;
    }
}
