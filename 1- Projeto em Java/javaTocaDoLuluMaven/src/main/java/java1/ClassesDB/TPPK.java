package java1.ClassesDB;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class TPPK implements Serializable{
    private int id_tutor;
    private int id_pet;

    public int getId_tutor() {
        return id_tutor;
    }

    public void setId_tutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    public int getId_pet() {
        return id_pet;
    }

    public void setId_pet(int id_pet) {
        this.id_pet = id_pet;
    }
    
    
}
