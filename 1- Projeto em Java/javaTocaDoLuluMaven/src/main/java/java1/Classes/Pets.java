package java1.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Informa que esta classe é uma entidade no banco de dados
@Table(name = "Pets") // Informa que esta classe estará vinculada à Table Pet no banco de dados
public class Pets {

    // Caso haja algum atributo ENUM, é necessário colocar em cima o "@Enumerated(EnumType.STRING) para ele não puxar enumerado por ordem ao banco de dados.
    
    @Id // Informa que o ID é a chave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Informa que o ID será gerado em sequencia
    private int id;
    private String nome;
    private String sexo;
    private String raca;
    @Column(name = "cor")
    private String cor;

    private String nascimento;
    
    private String tipo_rede_1;
    private String rede_social_1;
    private String tipo_rede_2;
    private String rede_social_2;
    
    private String alergias;
    private String remedios;
    private String vacinacao;
    private String observacoes;
    private int id_petsPlanosValores;
    private int id_tutores;
    

    public Pets() {
        
    }

    public Pets(int id, String nome, String sexo, String raca, String cor, String nascimento, String tipo_rede_1, 
            String rede_social_1, String tipo_rede_2, String rede_social_2, String alergias, String remedios, 
            String vacinacao, String observacoes, int id_petsPlanosValores, int id_tutores) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.cor = cor;
        this.nascimento = nascimento;
        this.tipo_rede_1 = tipo_rede_1;
        this.rede_social_1 = rede_social_1;
        this.tipo_rede_2 = tipo_rede_2;
        this.rede_social_2 = rede_social_2;
        this.alergias = alergias;
        this.remedios = remedios;
        this.vacinacao = vacinacao;
        this.observacoes = observacoes;
        
        this.id_petsPlanosValores = id_petsPlanosValores;
        this.id_tutores = id_tutores;
                
        
    }

    public Pets(int id, String nome, String sexo, String raca, String cor, int id_petsPlanosValores, int id_tutores) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.cor = cor;
        this.id_petsPlanosValores = id_petsPlanosValores;
        this.id_tutores = id_tutores;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getTipo_rede_1() {
        return tipo_rede_1;
    }

    public void setTipo_rede_1(String tipo_rede_1) {
        this.tipo_rede_1 = tipo_rede_1;
    }

    public String getRede_social_1() {
        return rede_social_1;
    }

    public void setRede_social_1(String rede_social_1) {
        this.rede_social_1 = rede_social_1;
    }

    public String getTipo_rede_2() {
        return tipo_rede_2;
    }

    public void setTipo_rede_2(String tipo_rede_2) {
        this.tipo_rede_2 = tipo_rede_2;
    }

    public String getRede_social_2() {
        return rede_social_2;
    }

    public void setRede_social_2(String rede_social_2) {
        this.rede_social_2 = rede_social_2;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getId_petsPlanosValores() {
        return id_petsPlanosValores;
    }

    public void setId_petsPlanosValores(int id_petsPlanosValores) {
        this.id_petsPlanosValores = id_petsPlanosValores;
    }

    public int getId_tutores() {
        return id_tutores;
    }

    public void setId_tutores(int id_tutores) {
        this.id_tutores = id_tutores;
    }
    
    // MUDAR PARA VIEW EM BANCO DE DADOS E PUXAR PELA DAO
    public String imprimir() {
        return "Pet ID: " + id + "\n"
                + "\nNome: " + nome
                + "\nSexo: " + sexo
                + "\nRaça: " + raca
                + "\nCor: " + cor
                + "\nNascimento: " + nascimento
                + "\nRede Social: " + tipo_rede_1 + " - '" + rede_social_1 + "'"
                + "\nRede Social: " + tipo_rede_2 + " - '" + rede_social_2 + "'"
                + "\nAlergias: " + alergias
                + "\nVacinação: " + vacinacao
                + "\nRemédios: " + remedios
                + "\nObservações: " + observacoes
                + "\n"
                + "\nTutor: " + id_tutores
                + "\nPlano: " + id_petsPlanosValores;

    }

}
