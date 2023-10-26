package ClassesDAO;

import java1.Classes.Usuarios;
import javax.persistence.EntityManager;

public class UsuariosDAO {
    
    private EntityManager em;

    public UsuariosDAO(EntityManager em) {
        this.em = em;
    }
    
    public void cadastrar(Usuarios usuario){
        this.em.persist(usuario);
    }
}
