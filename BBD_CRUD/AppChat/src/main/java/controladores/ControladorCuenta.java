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
    
    public void borrarCuenta(Cuenta cuenta) {
        em= entityManagerFactory.createEntityManager();
        Cuenta cuentaAux = null;

        em.getTransaction().begin();

        //Buscamos si es un objeto manejado por el contexto de persistencia
        if(!em.contains(cuenta)){
            //Cargamos el objeto en el contexto de persistencia y se guarda en la variable auxiliar
            cuentaAux = em.merge(cuenta);
        }

        //Eliminamos el objeto
        em.remove(cuentaAux);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public void modifyCuenta(Cuenta cuenta) {
        em= entityManagerFactory.createEntityManager();

        em.getTransaction().begin();

        //Si la identidad del objeto existe se actualizan sus valores en la cache
        em.merge(cuenta);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public void createCuenta(Cuenta cuenta) {
        em= entityManagerFactory.createEntityManager();

        em.getTransaction().begin();
        //Guardamos el objeto en el contexto de persistencia
        em.persist(cuenta);
        //Volcamos la informacion del contexto en la base de datos
        em.getTransaction().commit();
        //Cerramos el contexto de persistencia
        em.close();
    }

    public Cuenta findByName(String nombre) {
        em= entityManagerFactory.createEntityManager();

        query= em.createNamedQuery("Cuenta.findByName");
        query.setParameter("nombre",nombre);
        Cuenta cuentaAux = (Cuenta) query.getSingleResult();
        em.close();
        return cuentaAux;
    }

    public List<Cuenta> findAll() {
        em= entityManagerFactory.createEntityManager();

        query= em.createNamedQuery("Cuenta.findAll");
        List<Cuenta> cuentas =(List<Cuenta>) query.getResultList();
        em.close();
        return cuentas;
    }

}
