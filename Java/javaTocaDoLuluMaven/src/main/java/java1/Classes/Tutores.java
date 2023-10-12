package java1.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tutor")
public class Tutores {

    @Id // Informa que o ID é a chave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Informa que o ID será gerado em sequencia
    private int id;
    private String documento_identificador;
    private String tipo_documento;
    private String nome;
    private String nascimento;
    private String endereco;

    private int celular;
    private String email;
    private String rede_social;
    private String tipo_rede;

    public Tutores() {
    }

    public Tutores(int id, String documento_identificador, String tipo_documento, String nome, String nascimento, String endereco, int celular, String email, String rede_social, String tipo_rede) {
        this.id = id;
        this.documento_identificador = documento_identificador;
        this.tipo_documento = tipo_documento;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
        this.rede_social = rede_social;
        this.tipo_rede = tipo_rede;
    }

    public String getDocumento_identificador() {
        return documento_identificador;
    }

    public void setDocumento_identificador(String documento_identificador) {
        this.documento_identificador = documento_identificador;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tutor ID: " + id + "\n"
                + "\nNome: " + nome
                + "\nDocumento: " + tipo_documento + " - " + documento_identificador
                + "\nNascimento: " + nascimento
                + "\nEndereço: " + endereco + "\n"
                + "\nCelular: " + celular
                + "\nE-mail: " + email
                + "\nRede Social: " + tipo_rede + " - " + rede_social;
    }

}
