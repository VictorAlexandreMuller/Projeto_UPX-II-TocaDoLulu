package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    
    // Cria o EntityManagerFactory
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("toca_do_lulu_upx");
    
    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
