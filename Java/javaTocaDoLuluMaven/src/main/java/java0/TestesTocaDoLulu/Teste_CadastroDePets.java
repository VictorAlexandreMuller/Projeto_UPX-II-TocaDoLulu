package java0.TestesTocaDoLulu;

import ClassesDAO.PetsDAO;
import ConectionsDAO.JPAUtil;
import java1.Classes.Pets;
import javax.persistence.EntityManager;

public class Teste_CadastroDePets {
    
    public static void main(String[] args) {
        Pets pet = new Pets();
        pet.setNome("Aurora");
        pet.setNascimento("1900-10-21");
        pet.setRaca("Bullterrier");
        pet.setCor("Branca");
        
        EntityManager em = JPAUtil.getEntityManager();
        PetsDAO dao = new PetsDAO(em);
        
        em.getTransaction().begin(); // Inicia a transação no banco de dados
        em.persist(pet); // Adiciona as transações que deseja adicionar o banco de dados
        em.getTransaction().commit(); // Envia as transações para o banco de dados
        em.close(); // Fecha a transação para não ficar aberta atoa
    }
    
}
