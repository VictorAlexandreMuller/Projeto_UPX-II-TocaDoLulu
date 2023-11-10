package ClassesDAO;

import ConectionsDAO.ConexaoDAOviaJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ResultSet listarComboPets() {
        conn = new ConexaoDAOviaJDBC().conectaBD();
        String sql = "SELECT Id FROM Pets;";
        
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarPets PetsDAO" + erro.getMessage());
            return null;
        }
    }
    
    public void inserir(Pets pet) {
        String sql = "INSERT INTO Pets (nome, sexo, raca, "
                + "cor, nascimento, tipo_rede_1, rede_social_1, tipo_rede_2, "
                + "rede_social_2, alergias, remedios, vacinacao, observacoes, id_petsPlanosValores, id_tutores) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getSexo());
            stmt.setString(3, pet.getRaca());
            stmt.setString(4, pet.getCor());
            
            String dia = pet.getNascimento().substring(0, 2);
            String mes = pet.getNascimento().substring(3, 5);
            String ano = pet.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            stmt.setString(5, dataParaMySQL);
            
            stmt.setString(6, pet.getTipo_rede_1());
            stmt.setString(7, pet.getRede_social_1());
            stmt.setString(8, pet.getTipo_rede_2());
            stmt.setString(9, pet.getRede_social_2());
            
            stmt.setString(10, pet.getAlergias());
            stmt.setString(11, pet.getRemedios());
            stmt.setString(12, pet.getVacinacao());
            stmt.setString(13, pet.getObservacoes());
            
            // ARRUMAR A PESQUISA REFERENTE AO PLANO, VALOR E ID_TUTORES -----------------------------------------------
            stmt.setInt(14, pet.getId_petsPlanosValores());
            stmt.setInt(15, pet.getId_tutores());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao INSERIR PET: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Pet cadastrado com sucesso!");
    }
    
    
    // REVER
    public void editar(Pets pet) {
        String sql = "UPDATE Tutores SET nome = ?, tipo_documento = ?, documento_identificador = ?, "
                + "nascimento = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, uf = ?, municipio = ?, "
                + "complemento = ?, ddd_1 = ?, celular_1 = ?, email_1 = ?, ddd_2 = ?, celular_2 = ?, email_2 = ?, "
                + "tipo_rede_1 = ?, rede_social_1 = ?, tipo_rede_2 = ?, rede_social_2 = ?, observacoes = ? WHERE id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getSexo());
            stmt.setString(3, pet.getRaca());
            stmt.setString(4, pet.getCor());
            
            String dia = pet.getNascimento().substring(0, 2);
            String mes = pet.getNascimento().substring(3, 5);
            String ano = pet.getNascimento().substring(6);
            String dataParaMySQL = ano+"-"+mes+"-"+dia;
            stmt.setString(5, dataParaMySQL);
            
            stmt.setString(6, pet.getTipo_rede_1());
            stmt.setString(7, pet.getRede_social_1());
            stmt.setString(8, pet.getTipo_rede_2());
            stmt.setString(9, pet.getRede_social_2());
            
            stmt.setString(10, pet.getAlergias());
            stmt.setString(11, pet.getRemedios());
            stmt.setString(12, pet.getVacinacao());
            stmt.setString(13, pet.getObservacoes());
            
            // ARRUMAR A PESQUISA REFERENTE AO PLANO, VALOR E ID_TUTORES -----------------------------------------------
            stmt.setString(14, pet.getObservacoes());
            stmt.setString(15, pet.getObservacoes());
            stmt.setString(16, pet.getObservacoes());
            
            stmt.setInt(17, pet.getId());
            
            stmt.execute();
  
        } catch (SQLException ex) {
            System.out.println("Erro ao EDITAR PET: " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Pet alterado com sucesso.");
    }
    
    
    // OK
    public boolean excluir(int codigo) {
        String sql = "delete from Pets where id = ?";

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            return stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao EXCLUIR PET: " + ex.getMessage());
        }
        return false;
    }
    
    
    
    public ArrayList<Pets> getAll() {
        String sql = "SELECT * FROM Pets";
        
        ArrayList<Pets> pets = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                String sexo = rs.getString("sexo");
                String raca = rs.getString("raca");
                String cor = rs.getString("cor");
                
                String nascimento = rs.getString("nascimento");
                
                String tipo_rede_1 = rs.getString("tipo_rede_1");
                String rede_social_1 = rs.getString("rede_social_1");
                String tipo_rede_2 = rs.getString("tipo_rede_2");
                String rede_social_2 = rs.getString("rede_social_2");
                
                String alergias = rs.getString("alergias");
                String remedios = rs.getString("remedios");
                String vacinacao = rs.getString("vacinacao");
                String observacoes = rs.getString("observacoes");
                
                int id_petsPlanosValores = rs.getInt("id_petsPlanosValores");
                int id_tutores = rs.getInt("id_tutores");
                
                
                
                Pets pet = new Pets(id, nome, sexo, raca, cor, nascimento, tipo_rede_1, 
                        rede_social_1, tipo_rede_2, rede_social_2, alergias, remedios, vacinacao, observacoes, id_petsPlanosValores, id_tutores);
                pets.add(pet);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar PETS getAll: " + ex.getMessage());
        }
        return pets;
    }
    
    
    
    public static ArrayList<Pets> getColunasTablePets() {
        String sql = "SELECT * FROM Pets";
        
        ArrayList<Pets> pets = new ArrayList<>();
        
        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String sexo = rs.getString("sexo");
                String raca = rs.getString("raca");
                String cor = rs.getString("cor");
                
                int id_petsPlanosValores = rs.getInt("id_petsPlanosValores");
                int id_tutores = rs.getInt("id_tutores");
                
                Pets pet = new Pets(id, nome, sexo, raca, cor, id_petsPlanosValores, id_tutores);
                pets.add(pet);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar PETS getColunasTablePets: " + ex.getMessage());
        }
        return pets;
    }
    

    
    
    public Pets getByID(int idParam) {
        String sql = "SELECT * FROM Pets where id=?";
        Pets pet = null;

        try (Connection conn = ConexaoDAOviaJDBC.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setInt(1, idParam);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                String nome = rs.getString("nome");
                int id = rs.getInt("id");
                String sexo = rs.getString("sexo");
                String raca = rs.getString("raca");
                String cor = rs.getString("cor");
                
                String nascimento = rs.getString("nascimento");
                
                String tipo_rede_1 = rs.getString("tipo_rede_1");
                String rede_social_1 = rs.getString("rede_social_1");
                String tipo_rede_2 = rs.getString("tipo_rede_2");
                String rede_social_2 = rs.getString("rede_social_2");
                
                String alergias = rs.getString("alergias");
                String remedios = rs.getString("remedios");
                String vacinacao = rs.getString("vacinacao");
                String observacoes = rs.getString("observacoes");
                
                int id_petsPlanosValores = rs.getInt("id_petsPlanosValores");
                int id_tutores = rs.getInt("id_tutores");

                pet = new Pets(id, nome, sexo, raca, cor, nascimento, tipo_rede_1, rede_social_1, 
                        tipo_rede_2, rede_social_2, alergias, remedios, vacinacao, observacoes, id_petsPlanosValores, id_tutores);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar PETS ByID: " + ex.getMessage());
        }
        return pet;
    }
    
}
