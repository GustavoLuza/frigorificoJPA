package Controller;

import Dados.Conexao;
import Model.Frigorifico;
import java.util.List;
import javax.persistence.Query;

public class DaoFrigorifico{
    
    public void addFrigorifico(Frigorifico frigorifico){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().persist(frigorifico);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void updateFrigorifico(Frigorifico frigorifico){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().merge(frigorifico);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void deleteFrigorifico(Frigorifico frigorifico){        
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().remove(getFrigorifico(frigorifico.getId()));
        Conexao.getEntity().getTransaction().commit();
    }
    
    public Frigorifico getFrigorifico (int pk){
        return Conexao.getEntity().find(Frigorifico.class, pk);
    }
    
    public List<Frigorifico> getFrigorificoList(){
        String HQL="select f from Frigorifico f order by f.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        return query.getResultList();
    }
    
    public List<Frigorifico> getFrigorificoList(String filtro){
        String HQL="select f from Frigorifico f where f.nome like ?1 or f.cnpj = ?2 order by f.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        query.setParameter(1, "%"+filtro.toUpperCase()+"%");
        query.setParameter(2, filtro);
        return query.getResultList();
    }
    
}
