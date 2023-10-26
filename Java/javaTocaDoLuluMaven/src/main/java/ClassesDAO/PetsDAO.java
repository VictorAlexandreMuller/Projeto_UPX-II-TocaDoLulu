package ClassesDAO;

import java1.Classes.Pets;
import javax.persistence.EntityManager;

public class PetsDAO {
    
    private EntityManager em;
    
    public PetsDAO(EntityManager em) {
        this.em = em;
    }
        
    public void cadastrar(Pets pet){
        this.em.persist(pet);
    }
    
    // Construtor vazio
        public PetsDAO() {
        
    }

}
