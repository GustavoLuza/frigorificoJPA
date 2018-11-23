package Dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
     private static EntityManager em = null;
    
    public static EntityManager getEntity(){
        if (em == null){
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("FrigorificoPU");
            em = factory.createEntityManager();
        }
        return em;
    }
    
}
