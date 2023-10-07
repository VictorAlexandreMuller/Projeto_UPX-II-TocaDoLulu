package java0.TocaDoLulu;

import java.util.ArrayList;
import java.util.List;

public class teste_NaoExcluir {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    // APRENDENDO A USAR "STREAM" NO NetBeans versão 20.
    public List<teste_NaoExcluir> pesquisaNome (String nome){
        List<teste_NaoExcluir> listafiltro = new ArrayList<teste_NaoExcluir>();
        return listafiltro.stream().filter(cachorro -> getNome().equals(nome)).toList();
    }
}
