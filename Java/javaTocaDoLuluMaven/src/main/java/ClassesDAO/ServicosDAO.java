package ClassesDAO;

import java1.Classes.Servicos;
import javax.persistence.EntityManager;

public class ServicosDAO {
    private EntityManager em;

    public ServicosDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Servicos servicos){
        this.em.persist(servicos);
    }
}
