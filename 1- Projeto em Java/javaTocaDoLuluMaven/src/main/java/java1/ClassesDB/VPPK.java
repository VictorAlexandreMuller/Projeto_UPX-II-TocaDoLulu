package java1.ClassesDB;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class VPPK implements Serializable{
    private int id_veterinario;
    private int id_pet;

    public int getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(int id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public int getId_pet() {
        return id_pet;
    }

    public void setId_pet(int id_pet) {
        this.id_pet = id_pet;
    }
    
    
}
