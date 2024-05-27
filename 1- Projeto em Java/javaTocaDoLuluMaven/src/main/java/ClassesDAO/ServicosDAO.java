package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java1.Classes.Servicos;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class ServicosDAO {
    private EntityManager em;

    public ServicosDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Servicos servicos){
        this.em.persist(servicos);
    }

    public ServicosDAO() {
    }
    
    
    
    
    
    
    
    
    
    
    
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ResultSet listarComboServicos() {
        conn = new ConexaoDAOviaJDBC().conectaBD();
        String sql = "SELECT Id FROM Servicos;";
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarServicos ServicosDAO" + erro.getMessage());
            return null;
        }
    }
    
    public void inserir(Servicos servico) {
        String sql = "INSERT INTO Servicos (nome, servico, valor, tipo_documento, documento_identificador, "
                + "nascimento, cep, logradouro, numero, bairro, UF, municipio, complemento, "
                + "ddd_1, celular_1, email_1, ddd_2, celular_2, email_2, observacoes) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, servico.getNome());
            stmt.setString(2, servico.getServico());
            stmt.setDouble(3, servico.getValor());
            stmt.setString(4, servico.getTipo_documento());
            stmt.setString(5, servico.getDocumento_identificador());
            
            String dia = servico.getNascimento().substring(0, 2);
            String mes = servico.getNascimento().substring(3, 5);
            String ano = servico.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            stmt.setString(6, dataParaMySQL);
            
            stmt.setInt(7, servico.getCep());
            stmt.setString(8, servico.getLogradouro());
            stmt.setString(9, servico.getNumero());
            stmt.setString(10, servico.getBairro());
            stmt.setString(11, servico.getUf());
            stmt.setString(12, servico.getMunicipio());
            stmt.setString(13, servico.getComplemento());
            stmt.setInt(14, servico.getDdd_1());
            stmt.setInt(15, servico.getCelular_1());
            stmt.setString(16, servico.getEmail_1());
            stmt.setInt(17, servico.getDdd_2());
            stmt.setInt(18, servico.getCelular_2());
            stmt.setString(19, servico.getEmail_2());
            stmt.setString(20, servico.getObservacoes());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao INSERIR SERVICO: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");
    }
    
    
    
    public void editar(Servicos servico) {
        String sql = "UPDATE Servicos SET nome = ?, servico = ?, valor = ?, tipo_documento = ?, documento_identificador = ?, "
                + "nascimento = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, uf = ?, municipio = ?, "
                + "complemento = ?, ddd_1 = ?, celular_1 = ?, email_1 = ?, ddd_2 = ?, celular_2 = ?, email_2 = ?, observacoes = ? WHERE id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, servico.getNome());
            stmt.setString(2, servico.getServico());
            stmt.setDouble(3, servico.getValor());
            stmt.setString(4, servico.getTipo_documento());
            stmt.setString(5, servico.getDocumento_identificador());
            
            String dia = servico.getNascimento().substring(0, 2);
            String mes = servico.getNascimento().substring(3, 5);
            String ano = servico.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            stmt.setString(6, dataParaMySQL);
            
            stmt.setInt(7, servico.getCep());
            stmt.setString(8, servico.getLogradouro());
            stmt.setString(9, servico.getNumero());
            stmt.setString(10, servico.getBairro());
            stmt.setString(11, servico.getUf());
            stmt.setString(12, servico.getMunicipio());
            stmt.setString(13, servico.getComplemento());
            stmt.setInt(14, servico.getDdd_1());
            stmt.setInt(15, servico.getCelular_1());
            stmt.setString(16, servico.getEmail_1());
            stmt.setInt(17, servico.getDdd_2());
            stmt.setInt(18, servico.getCelular_2());
            stmt.setString(19, servico.getEmail_2());
            stmt.setString(20, servico.getObservacoes());
            
            stmt.setInt(21, servico.getId());
            
            stmt.execute();
  
        } catch (SQLException ex) {
            System.out.println("Erro ao EDITAR SERVICO: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Serviço alterado com sucesso.");
    }
    
    
    
    public boolean excluir(int codigo) {
        String sql = "delete FROM Servicos where id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            return stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao EXCLUIR SERVICO: " + ex.getMessage());
        }
        return false;
    }
    
    
    
    public ArrayList<Servicos> getAll() {
        String sql = "SELECT * FROM Servicos";
        
        ArrayList<Servicos> servicos = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String servico = rs.getString("servico");
                double valor = rs.getDouble("valor");
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
                String observacoes = rs.getString("observacoes");

                Servicos serv = new Servicos(id, nome, servico, valor, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro, 
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, observacoes);
                servicos.add(serv);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar SERVICOS getAll: " + ex.getMessage());
        }
        return servicos;
    }
    
    
    
    public static ArrayList<Servicos> getColunasTableServicos() {
        String sql = "SELECT * FROM Servicos";
        
        ArrayList<Servicos> servicos = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String servico = rs.getString("servico");
                double valor = rs.getDouble("valor");
                int ddd_1 = rs.getInt("ddd_1");
                int celular_1 = rs.getInt("celular_1");
                String email_1 = rs.getString("email_1");
                
                Servicos serv = new Servicos(id, nome, servico, valor, ddd_1, celular_1, email_1);
                servicos.add(serv);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar SERVICO getColunasTableServicos: " + ex.getMessage());
        }
        return servicos;
    }
    
    

    
    public Servicos getByID(int idParam) {
        String sql = "SELECT * FROM Servicos where id=?";
        Servicos serv = null;
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql);) {
            
            stmt.setInt(1, idParam);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String servico = rs.getString("servico");
                double valor = rs.getDouble("valor");
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
                String observacoes = rs.getString("observacoes");

                serv = new Servicos(id, nome, servico, valor, tipo_documento, documento_identificador, nascimento, cep, logradouro, numero, bairro, 
                    UF, municipio, complemento, ddd_1, celular_1, ddd_2, celular_2, email_1, email_2, observacoes);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar SERVICOS ByID: " + ex.getMessage());
        }
        return serv;
    }
}
