package Controller;

import Dados.Conexao;
import Model.Frigorifico;
import Model.Venda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Query;

public class DaoVenda{
    public void addVenda(Venda venda){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().persist(venda);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void updateVenda(Venda venda){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().merge(venda);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void deleteVenda(Venda venda){        
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().remove(getVenda(venda.getId()));
        Conexao.getEntity().getTransaction().commit();
    }
    
    public Venda getVenda (int pk){
        return Conexao.getEntity().find(Venda.class, pk);
    }
    
    public List<Venda> getVendaList(){
        String HQL="select v from Venda v";
        Query query = Conexao.getEntity().createQuery(HQL);
        return query.getResultList();
    }
    
    public List<Frigorifico> getVendaList(int filtro){
        String HQL="select v from Venda v where v.id like ?1";
        Query query = Conexao.getEntity().createQuery(HQL);
        query.setParameter(1, filtro);
        return query.getResultList();
    }
}
