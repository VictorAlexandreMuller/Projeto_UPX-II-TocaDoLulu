package ClassesDAO;

import java1.Classes.Veterinarios;
import javax.persistence.EntityManager;

public class VeterinariosDAO {
    
    private EntityManager em;

    public VeterinariosDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Veterinarios veterinarios){
        this.em.persist(veterinarios);
    }
}
