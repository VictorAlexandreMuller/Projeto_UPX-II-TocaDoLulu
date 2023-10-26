package dao;

import java1.Classes.Pets;
import javax.persistence.EntityManager;

public class RegisterDAO {
    
    private EntityManager em;

    public RegisterDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Pets pet){
        this.em.persist(pet);
    }
}
