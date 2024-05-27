package java1.ClassesDB;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class SPPK implements Serializable{
    private int id_servico;
    private int id_pet;

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public int getId_pet() {
        return id_pet;
    }

    public void setId_pet(int id_pet) {
        this.id_pet = id_pet;
    }
    
    
}
