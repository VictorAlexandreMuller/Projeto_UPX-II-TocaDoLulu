package java1.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tutores")
public class Tutores {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String tipo_documento;
    private String documento_identificador;
    private String nascimento;

    private int cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String UF;
    private String municipio;
    private String complemento;

    private int ddd_1;
    private int celular_1;
    private int ddd_2;
    private int celular_2;

    private String email_1;
    private String email_2;
    private String tipo_rede_1;
    private String rede_social_1;
    private String tipo_rede_2;
    private String rede_social_2;
    private String observacoes;

    public Tutores() {
    }

    public Tutores(int id, String nome, String tipo_documento, String documento_identificador, String nascimento, int cep, String logradouro, String numero, String bairro, String UF, String municipio, String complemento, int ddd_1, int celular_1, int ddd_2, int celular_2, String email_1, String email_2, String tipo_rede_1, String rede_social_1, String tipo_rede_2, String rede_social_2, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.tipo_documento = tipo_documento;
        this.documento_identificador = documento_identificador;
        this.nascimento = nascimento;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.UF = UF;
        this.municipio = municipio;
        this.complemento = complemento;
        this.ddd_1 = ddd_1;
        this.celular_1 = celular_1;
        this.ddd_2 = ddd_2;
        this.celular_2 = celular_2;
        this.email_1 = email_1;
        this.email_2 = email_2;
        this.tipo_rede_1 = tipo_rede_1;
        this.rede_social_1 = rede_social_1;
        this.tipo_rede_2 = tipo_rede_2;
        this.rede_social_2 = rede_social_2;
        this.observacoes = observacoes;
    }

    public Tutores(int id, String nome, int ddd_1, int celular_1, String email_1) {
        this.id = id;
        this.nome = nome;
        this.ddd_1 = ddd_1;
        this.celular_1 = celular_1;
        this.email_1 = email_1;
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

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getDocumento_identificador() {
        return documento_identificador;
    }

    public void setDocumento_identificador(String documento_identificador) {
        this.documento_identificador = documento_identificador;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return UF;
    }

    public void setUf(String uf) {
        this.UF = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getDdd_1() {
        return ddd_1;
    }

    public void setDdd_1(int ddd_1) {
        this.ddd_1 = ddd_1;
    }

    public int getCelular_1() {
        return celular_1;
    }

    public void setCelular_1(int celular_1) {
        this.celular_1 = celular_1;
    }

    public int getDdd_2() {
        return ddd_2;
    }

    public void setDdd_2(int ddd_2) {
        this.ddd_2 = ddd_2;
    }

    public int getCelular_2() {
        return celular_2;
    }

    public void setCelular_2(int celular_2) {
        this.celular_2 = celular_2;
    }

    public String getEmail_1() {
        return email_1;
    }

    public void setEmail_1(String email_1) {
        this.email_1 = email_1;
    }

    public String getEmail_2() {
        return email_2;
    }

    public void setEmail_2(String email_2) {
        this.email_2 = email_2;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Tutor ID: " + id
                + "\n"
                + "\nNome: " + nome
                + "\nDocumento: " + tipo_documento + " - " + documento_identificador
                + "\nNascimento: " + nascimento
                + "\nCEP: " + cep
                + "\nEndereço: " + logradouro + ", " + numero + ", " + bairro + " - " + municipio + "/" + UF
                + "\nComplemento: " + complemento
                + "\n"
                + "\nCelular Principal: (" + ddd_1 + ") " + celular_1
                + "\nCelular Secundário: (" + ddd_2 + ") " + celular_2
                + "\nE-mail Principal: " + email_1
                + "\nE-mail Secundário: " + email_2
                + "\nRede Social: " + tipo_rede_1 + " - " + rede_social_1
                + "\nRede Social: " + tipo_rede_2 + " - " + rede_social_2
                + "\nObservações: " + observacoes;
    }

}
