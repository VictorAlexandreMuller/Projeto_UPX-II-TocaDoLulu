package javatocadolulu_teste;

public class Pet_TESTE {
    private int id;
    private String nome;
    private char nascimento;

    public Pet_TESTE() {
    }

    public Pet_TESTE(int id, String nome, char nascimento) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
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

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nNascimento: " + nascimento;
    }
    
    
    
}
