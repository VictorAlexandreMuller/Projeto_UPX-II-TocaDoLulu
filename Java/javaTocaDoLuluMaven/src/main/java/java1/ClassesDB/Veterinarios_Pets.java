package java1.ClassesDB;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Veterinarios_Pets")
public class Veterinarios_Pets implements Serializable{
    @EmbeddedId
    private VPPK id;

    public VPPK getId() {
        return id;
    }

    public void setId(VPPK id) {
        this.id = id;
    }
    
}
