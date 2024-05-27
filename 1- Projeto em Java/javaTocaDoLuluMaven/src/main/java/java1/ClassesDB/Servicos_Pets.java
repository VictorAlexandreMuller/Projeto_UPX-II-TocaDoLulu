package java1.ClassesDB;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Servicos_Pets")
public class Servicos_Pets implements Serializable{
    @EmbeddedId
    private SPPK id;

    public SPPK getId() {
        return id;
    }

    public void setId(SPPK id) {
        this.id = id;
    }
    
}
