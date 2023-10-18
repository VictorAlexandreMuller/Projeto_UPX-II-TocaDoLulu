package java1.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Servicos")
public class Servicos {

    @Id // Informa que o ID é a chave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Informa que o ID será gerado em sequencia
    private int id;
    private String tipo_servico;
    private String nome;
    private String documento_identificador;
    private String tipo_documento;
    private String nascimento;
    private String endereco;

    private int celular;
    private String email;

    public Servicos() {
    }

    public Servicos(String tipo_servico, String nome, String documento_identificador, String tipo_documento, String nascimento, String endereco, int celular, String email) {
        this.tipo_servico = tipo_servico;
        this.nome = nome;
        this.documento_identificador = documento_identificador;
        this.tipo_documento = tipo_documento;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
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

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    @Override
    public String toString() {
        return "Serviço ID: " + id
                + "\nServiço: " + tipo_servico + "\n"
                + "\nNome: " + nome
                + "\nDocumento: " + tipo_documento + " - " + documento_identificador
                + "\nNascimento: " + nascimento
                + "\nEndereço: " + endereco
                + "\nCelular: " + celular
                + "\nE-mail: " + email;
    }

}
