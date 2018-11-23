package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FRIGORIFICO")
public class Frigorifico implements java.io.Serializable{
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @SwingColumn(description = "Código",colorOfBackgound = "")
    private int id;
    
    @Column(name = "NOME",length = 255, nullable = false)
    @SwingColumn(description = "Cliente",colorOfBackgound = "")
    private String nome;
    
    @Column(name = "CNPJ", length = 18, nullable = false)
    @SwingColumn(description = "CNPJ",colorOfBackgound = "")
    private String cnpj;
    
    @Column(name = "TELEFONE", length = 18, nullable = false)
    @SwingColumn(description = "Telefone",colorOfBackgound = "")
    private String telefone;
    
    @Column(name = "ENDERECO",length = 255, nullable = false)
    private String endereco;
    
    @Column(name = "RESPONSAVEL",length = 255, nullable = false)
    private String responsavel;
    
     //METODOS
    public Frigorifico(){
        setNome("VAZIO");
        setCnpj("00.000.000/0000-00");
        setTelefone("(00) 0 0000-0000");
        setEndereco("VAZIO");
        setResponsavel("VAZIO");  
        
    }
    
    public Frigorifico(int id, String nome, String cnpj,String telefone, String endereco, String responsavel){
        setId(id);
        setNome(nome);
        setCnpj(cnpj);
        setTelefone(telefone);
        setEndereco(endereco);
        setResponsavel(responsavel);
    }
    
    //SET
    
    public void setId(int param){
            id = param;
    }        
    
    public void setNome(String param){
        nome=param.trim().isEmpty()?"NOME NÃO IDENTIFICADO":param.toUpperCase();
    }
    
    public void setCnpj(String param){
        cnpj = param;
    }
    
    public void setTelefone(String param){
        telefone=param.trim().isEmpty()?"TELEFONE NÃO IDENTIFICADO":param;
    }
    
  public void setEndereco(String param){
        endereco=param.trim().isEmpty()?"ENDEREÇO NÃO IDENTIFICADO":param.toUpperCase();
    }
    
   public void setResponsavel(String param){
        responsavel=param.trim().isEmpty()?"RESPONSAVEL NÃO IDENTIFICADO":param.toUpperCase();
    }
    
    //GET
   
   public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
      public String getEndereco(){
        return endereco;
    }
      
      public String getResponsavel(){
        return responsavel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Frigorifico other = (Frigorifico) obj;
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
