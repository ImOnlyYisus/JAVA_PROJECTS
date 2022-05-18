package controladores;

import entity.Cuenta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ControladorCuenta {
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AppChat");
    private EntityManager em;
    private Query query;
    /*
    public void borrarChat(Chat chat) {
        em= entityManagerFactory.createEntityManager();
        Chat chatAux = null;

        em.getTransaction().begin();

        //Buscamos si es un objeto manejado por el contexto de persistencia
        if(!em.contains(chat)){
            //Cargamos el objeto en el contexto de persistencia y se guarda en la variable auxiliar
            chatAux = em.merge(chat);
        }

        //Eliminamos el objeto
        em.remove(chatAux);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public void modifyUsuario(Usuario usuario) {
        em= entityManagerFactory.createEntityManager();

        em.getTransaction().begin();

        //Si la identidad del objeto existe se actualizan sus valores en la cache
        em.merge(usuario);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public void createUsuario(Usuario usuario) {
        em= entityManagerFactory.createEntityManager();

        em.getTransaction().begin();
        //Guardamos el objeto en el contexto de persistencia
        em.persist(usuario);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public Usuario findByEmail(String email) {
        em= entityManagerFactory.createEntityManager();

        query= em.createNamedQuery("Usuario.findByEmail");
        query.setParameter("email", email);
        Usuario usuarioAux = (Usuario) query.getSingleResult();
        em.close();
        return usuarioAux;
    }*/

    public List<Cuenta> findAll() {
        em= entityManagerFactory.createEntityManager();

        query= em.createNamedQuery("Cuenta.findAll");
        List<Cuenta> cuentas =(List<Cuenta>) query.getResultList();
        em.close();
        return cuentas;
    }

}
