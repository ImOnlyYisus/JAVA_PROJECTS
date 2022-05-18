package controladores;

import entity.Chat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ControladorChat {
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AppChat");
    private EntityManager em;
    private Query query;
    
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

    public void modifyChat(Chat chat) {
        em= entityManagerFactory.createEntityManager();

        em.getTransaction().begin();

        //Si la identidad del objeto existe se actualizan sus valores en la cache
        em.merge(chat);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public void createChat(Chat chat) {
        em= entityManagerFactory.createEntityManager();

        em.getTransaction().begin();
        //Guardamos el objeto en el contexto de persistencia
        em.persist(chat);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public Chat findByName(String nombre) {
        em= entityManagerFactory.createEntityManager();

        query= em.createNamedQuery("Chat.findByName");
        query.setParameter("nombre", nombre);
        Chat chatAux = (Chat) query.getSingleResult();
        em.close();
        return chatAux;
    }
    

    public List<Chat> findAll() {
        em= entityManagerFactory.createEntityManager();

        query= em.createNamedQuery("Chat.findAll");
        List<Chat> usuarios =(List<Chat>) query.getResultList();
        em.close();
        return usuarios;
    }

}
