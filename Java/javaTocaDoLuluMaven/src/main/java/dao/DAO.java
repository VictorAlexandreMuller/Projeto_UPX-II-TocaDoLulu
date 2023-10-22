package dao;

import static dao.JPAUtil.getEntityManager;
import java.util.List;
import java1.Classes.Pets;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class DAO {
    
    private EntityManager em;

    public DAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Pets pet){
        this.em.persist(pet);
    }
}
