package Controller;

import Dados.Conexao;
import Model.Cliente;
import java.util.List;
import javax.persistence.Query;

public class DaoCliente{
    public void addCliente(Cliente cliente){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().persist(cliente);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void updateCliente(Cliente cliente){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().merge(cliente);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void deleteCliente(Cliente cliente){        
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().remove(getCliente(cliente.getId()));
        Conexao.getEntity().getTransaction().commit();
    }
    
    public Cliente getCliente (int pk){
        return Conexao.getEntity().find(Cliente.class, pk);
    }
    
    public List<Cliente> getClienteList(){
        String HQL="select c from Cliente c order by c.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        return query.getResultList();
    }
    
    public List<Cliente> getClienteList(String filtro){
        String HQL="select c from Cliente c where c.nome like ?1 or c.cnpj = ?2 order by c.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        query.setParameter(1, "%"+filtro.toUpperCase()+"%");
        query.setParameter(2, filtro);
        return query.getResultList();
    }
       
}
