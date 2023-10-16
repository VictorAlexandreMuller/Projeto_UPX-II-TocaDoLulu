package java1.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Informa que esta classe é uma entidade no banco de dados
@Table(name = "Pet") // Informa que esta classe estará vinculada à Table Pet no banco de dados
public class Pets {

    // Caso haja algum atributo ENUM, é necessário colocar em cima o "@Enumerated(EnumType.STRING) para ele não puxar enumerado por ordem ao banco de dados.
    
    @Id // Informa que o ID é a chave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Informa que o ID será gerado em sequencia
    private int id;
    private String nome;
    private String raca;
    @Column(name = "cor")
    private String cor;

    private String nascimento;
    private String rede_social;
    private String tipo_rede;

    private String alergias;
    private String remedios;
    private String vacinacao;
    private String observacoes;

    public Pets() {
    }

    public Pets(int id, String nome, String raca, String cor, String nascimento, String rede_social, String tipo_rede, String alergias, String remedios, String vacinacao, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.nascimento = nascimento;
        this.rede_social = rede_social;
        this.tipo_rede = tipo_rede;
        this.alergias = alergias;
        this.remedios = remedios;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Pet ID: " + id + "\n"
                + "\nNome: " + nome
                + "\nRaça: " + raca
                + "\nCor: " + cor
                + "\nNascimento: " + nascimento
                + "\nRede Social: " + tipo_rede + " - " + rede_social
                + "\nAlergias: " + alergias
                + "\nRemédios: " + remedios
                + "\nVacinação: " + vacinacao
                + "\nObservações: " + observacoes;

    }

}
