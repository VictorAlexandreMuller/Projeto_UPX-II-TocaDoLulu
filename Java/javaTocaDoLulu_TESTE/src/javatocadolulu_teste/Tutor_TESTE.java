package javatocadolulu_teste;

public class Tutor_TESTE {
    private String documento_identificador;
    private String tipo_documento;
    private String nome;
    private char nascimento;
    private int celular;

    public Tutor_TESTE() {
    }

    public Tutor_TESTE(String documento_identificador, String tipo_documento, String nome, char nascimento, int celular) {
        this.documento_identificador = documento_identificador;
        this.tipo_documento = tipo_documento;
        this.nome = nome;
        this.nascimento = nascimento;
        this.celular = celular;
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

    public char getNascimento() {
        return nascimento;
    }

    public void setNascimento(char nascimento) {
        this.nascimento = nascimento;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Documento: " + documento_identificador +
                "\nTipo de documento: " + tipo_documento +
                "\nNome: " + nome +
                "\nNascimento: " + nascimento +
                "\nCelular: " + celular;
    }
    
    
    
}
