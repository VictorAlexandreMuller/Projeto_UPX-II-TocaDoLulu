package upx_ii_pet.shop;

import java.util.ArrayList;
import java.util.List;

public class Cachorro {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Cachorro> pesquisaNome (String nome){
        List<Cachorro> listafiltro = new ArrayList<Cachorro>();
        return listafiltro.stream().filter(cachorro -> getNome().equals(nome)).toList();
    }
}
