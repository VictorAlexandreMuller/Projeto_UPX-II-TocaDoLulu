package dao;

import java1.Classes.Pets;
import javax.persistence.EntityManager;

public class DAO {
    
    private EntityManager em;

    public DAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Pets pet){
        this.em.persist(pet);
    }
}
