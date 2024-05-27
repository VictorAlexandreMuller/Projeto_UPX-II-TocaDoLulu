package java1.ClassesDB;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Tutores_Pets")
public class Tutores_Pets implements Serializable{
    @EmbeddedId
    private TPPK id;

    public TPPK getId() {
        return id;
    }

    public void setId(TPPK id) {
        this.id = id;
    }
    
}
