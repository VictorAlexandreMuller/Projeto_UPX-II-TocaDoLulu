package ClassesDAO;

import java1.Classes.Tutores;
import javax.persistence.EntityManager;

public class TutoresDAO {
    
    private EntityManager em;

    public TutoresDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Tutores tutores){
        this.em.persist(tutores);
    }
}
