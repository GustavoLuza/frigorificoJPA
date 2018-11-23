package Controller;

import Dados.Conexao;
import Model.Animal;
import java.util.List;
import javax.persistence.Query;

public class DaoAnimal{
    public void addAnimal(Animal animal){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().persist(animal);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void updateAnimal(Animal animal){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().merge(animal);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void deleteAnimal(Animal animal){        
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().remove(getAnimal(animal.getId()));
        Conexao.getEntity().getTransaction().commit();
    }
    
    public Animal getAnimal (int pk){
        return Conexao.getEntity().find(Animal.class, pk);
    }
    
    public List<Animal> getAnimalList(){
        String HQL="select a from Animal a order by a.especie";
        Query query = Conexao.getEntity().createQuery(HQL);
        return query.getResultList();
    }
    
    public List<Animal> getAnimalList(String filtro){
        String HQL="select a from Animal a where a.raca like ?1";
        Query query = Conexao.getEntity().createQuery(HQL);
        query.setParameter(1,filtro);
        return query.getResultList();
    }
    
}
