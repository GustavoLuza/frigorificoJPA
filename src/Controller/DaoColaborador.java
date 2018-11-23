package Controller;

import Dados.Conexao;
import Model.Colaborador;
import Tipos.TipoSexo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Query;


public class DaoColaborador{
    public void addColaborador(Colaborador colaborador){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().persist(colaborador);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void updateColaborador(Colaborador colaborador){
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().merge(colaborador);
        Conexao.getEntity().getTransaction().commit();
    }
    
    public void deleteColaborador(Colaborador colaborador){        
        Conexao.getEntity().getTransaction().begin();
        Conexao.getEntity().remove(getColaborador(colaborador.getId()));
        Conexao.getEntity().getTransaction().commit();
    }
    
    public Colaborador getColaborador (int pk){
        return Conexao.getEntity().find(Colaborador.class, pk);
    }
    
    public List<Colaborador> getColaboradorList(){
        String HQL="select c from Colaborador c order by c.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        return query.getResultList();
    }
    public List<Colaborador> getColaboradorList(String filtro){
        String HQL="select c from Colaborador c where c.nome like ?1 or c.cpf = ?2 order by c.nome";
        Query query = Conexao.getEntity().createQuery(HQL);
        query.setParameter(1, "%"+filtro.toUpperCase()+"%");
        query.setParameter(2, filtro);
        return query.getResultList();
    }
}
