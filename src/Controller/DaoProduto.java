package Controller;

import Dados.Conexao;
import Model.Produto;
import java.util.List;
import javax.persistence.Query;

public class DaoProduto{
       public void addProduto(Produto produto){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().persist(produto);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void updateProduto(Produto produto){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().merge(produto);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void deleteProduto(Produto produto){        
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().remove(getProduto(produto.getId()));
        Conexao.getEntity().getTransaction().commit();
    }
    
    public Produto getProduto (int pk){
        return Conexao.getEntity().find(Produto.class, pk);
    }
    
    public List<Produto> getProdutoList(){
        String HQL="select p from Produto p order by p.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        return query.getResultList();
    }
    
    public List<Produto> getProdutoList(String filtro){
        String HQL="select p from Produto p where p.nome like ?1 order by p.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        query.setParameter(1, "%"+filtro.toUpperCase()+"%");
        return query.getResultList();
    }
    
}
