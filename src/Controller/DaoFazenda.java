package Controller;

import Dados.Conexao;
import Model.Cliente;
import Model.Fazenda;
import java.util.List;
import javax.persistence.Query;

public class DaoFazenda{
    public void addFazenda(Fazenda fazenda){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().persist(fazenda);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void updateFazenda(Fazenda fazenda){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().merge(fazenda);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void deleteFazenda(Fazenda fazenda){        
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().remove(getFazenda(fazenda.getId()));
        Conexao.getEntity().getTransaction().commit();
    }
    
    public Fazenda getFazenda (int pk){
        return Conexao.getEntity().find(Fazenda.class, pk);
    }
    
    public List<Fazenda> getFazendaList(){
        String HQL="select f from Fazenda f order by f.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        return query.getResultList();
    }
    
    public List<Fazenda> getFazendaList(String filtro){
        String HQL="select f from Fazenda f where f.nome like ?1 or f.cnpj = ?2 order by f.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        query.setParameter(1, "%"+filtro.toUpperCase()+"%");
        query.setParameter(2, filtro);
        return query.getResultList();
    }
       
}
