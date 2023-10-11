package java1.Classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class testesMySQL {
    
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setNome("Aurora");
        pet.setRaca("Bullterrier");
        pet.setCor("Branca");
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("toca_do_lulu_upx");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin(); // Inicia a transação no banco de dados
        
        // Adiciona as transações que deseja adicionar o banco de dados
        em.persist(pet);
        
        em.getTransaction().commit(); // Envia as transações para o banco de dados
        em.close(); // Fecha a transação para não ficar aberta atoa
    }
    
}
