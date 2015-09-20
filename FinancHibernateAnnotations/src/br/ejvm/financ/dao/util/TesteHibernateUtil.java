package br.ejvm.financ.dao.util;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ejvm.financ.model.Ganho;

public class TesteHibernateUtil {
    public static void main(String[] args) {

        Ganho ganho = new Ganho();
        ganho.setDeQuem("FADE");
        ganho.setData(Calendar.getInstance().getTime());
        ganho.setOk(true);
        ganho.setValor(3000L);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("financ");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();    
        manager.persist(ganho);
        manager.getTransaction().commit();  

        System.out.println("ID da Ganho: " + ganho.getId());

        manager.close();
      }

}
