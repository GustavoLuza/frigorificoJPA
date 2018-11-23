package Model;

import Tipos.TipoSexo;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COLABORADOR")


public class Colaborador implements java.io.Serializable{
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @SwingColumn(description = "Código",colorOfBackgound = "")
    private int id;
    
    @Column(name = "NOME",length = 255, nullable = false)
    @SwingColumn(description = "Nome",colorOfBackgound = "")
    private String nome;
    
    @Column(name = "CPF", length = 14, nullable = false)
    @SwingColumn(description = "CPF",colorOfBackgound = "")
    private String cpf;
    
    @Column(name = "TELEFONE", length = 18, nullable = false)
    @SwingColumn(description = "Telefone",colorOfBackgound = "")
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEXO", length = 1, nullable = false)
    private TipoSexo sexo;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private Date data_nascimento;
    
    //METODOS
    public Colaborador(){
        setNome("VAZIO");
        setCpf("000.000.000-00");
        setTelefone("(00) 0 0000-0000");
        this.setSexo(TipoSexo.M);
        setDataNascimento(new Date());  
        
    }
    
    public Colaborador(int id, String nome, String cpf,String telefone, TipoSexo sexo, Date DataNascimento){
        this.setId(id);
        this.setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSexo(sexo);
        setDataNascimento(DataNascimento);
    }
    
    //SET
    
    public void setId(int param){
            id = param;
    }        
    
    public void setNome(String param){
        nome=param.trim().isEmpty()?"NOME NÃO IDENTIFICADO":param.toUpperCase();
    }
    
    public void setCpf(String param){
        cpf = param;
    }
    
    public void setTelefone(String param){
        telefone=param.trim().isEmpty()?"TELEFONE NÃO IDENTIFICADO":param;
    }
    
    public void setSexo(TipoSexo sexo){
       this.sexo = sexo;
    }
    
    public void setDataNascimento(Date param){
        data_nascimento = param == null ? new Date() : param;
    }
    
    //GET
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public TipoSexo getSexo(){
        return sexo;
    }
    
    public Date getDataNascimento(){
        return data_nascimento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Colaborador other = (Colaborador) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    
    

}
