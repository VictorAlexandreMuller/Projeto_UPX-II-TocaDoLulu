package java1.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Informa que esta classe é uma entidade no banco de dados
@Table(name = "Pet") // Informa que esta classe estará vinculada à Table Pet no banco de dados
public class Pet {
    
    @Id // Informa que o ID é a chave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Informa que o ID será gerado em sequencia
    private int id;
    private String nome;
    private char nascimento;
    private String raca;
    
    @Column(name="cor")
    private String cor;
    private String alergias;
    private String remedios;
    private String vacinacao;
    private String rede_social;
    private String tipo_rede;

    public Pet() {
    }

    public Pet(int id, String nome, char nascimento, String raca, String cor, String alergias, String remedios, String vacinacao, String rede_social, String tipo_rede) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.raca = raca;
        this.cor = cor;
        this.alergias = alergias;
        this.remedios = remedios;
        this.vacinacao = vacinacao;
        this.rede_social = rede_social;
        this.tipo_rede = tipo_rede;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getNascimento() {
        return nascimento;
    }

    public void setNascimento(char nascimento) {
        this.nascimento = nascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getRemedios() {
        return remedios;
    }

    public void setRemedios(String remedios) {
        this.remedios = remedios;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getRede_social() {
        return rede_social;
    }

    public void setRede_social(String rede_social) {
        this.rede_social = rede_social;
    }

    public String getTipo_rede() {
        return tipo_rede;
    }

    public void setTipo_rede(String tipo_rede) {
        this.tipo_rede = tipo_rede;
    }
    
    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nNascimento: " + nascimento +
                "\nRaça: " + raca +
                "\nCor: " + cor +
                "\nAlergias: " + alergias +
                "\nRemédios: " + remedios +
                "\nVacinação: " + vacinacao +
                "\nRede Social: " + tipo_rede + " - " + rede_social;
        }
    
    
    
    
    
    
}
