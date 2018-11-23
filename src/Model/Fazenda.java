package Model;

import Tipos.TipoAnimal;
import Tipos.TipoPasto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FAZENDA")

public class Fazenda implements java.io.Serializable{
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @SwingColumn(description = "Código",colorOfBackgound = "")
    private int id;
    
    @Column(name = "NOME",length = 255, nullable = false)
    @SwingColumn(description = "Nome",colorOfBackgound = "")
    private String nome;
    
    @Column(name = "CNPJ", length = 18, nullable = false)
    @SwingColumn(description = "CNPJ",colorOfBackgound = "")
    private String cnpj;
    
    @Column(name = "TELEFONE", length = 18, nullable = false)
    @SwingColumn(description = "Telefone",colorOfBackgound = "")
    private String telefone;
    
    private String endereco;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_PASTO", length = 1, nullable = false)
    private TipoPasto tipo_pasto;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_ANIMAL", length = 1, nullable = false)
    private TipoAnimal tipo_animal;
    
    @Column(name = "NOME_CONTATO",length = 255, nullable = false)
    @SwingColumn(description = "Nome do contato",colorOfBackgound = "")
    private String nome_contato;
    
     //METODOS
    public Fazenda(){
        setNome("VAZIO");
        setCnpj("00.000.000/0000-00");
        setTelefone("(00) 0 0000-0000");
        setEndereco("VAZIO");
        this.setPasto(tipo_pasto.N);
        this.setAnimal(tipo_animal.G);
        setNome_contato("VAZIO");  
        
    }
    
    public Fazenda(int id, String nome, String cnpj,String telefone,String endereco, TipoPasto tipo_pasto, TipoAnimal tipo_animal, String nome_contato){
        this.setId(id);
        this.setNome(nome);
        setCnpj(cnpj);
        setTelefone(telefone);
        setEndereco(endereco);
        setPasto(tipo_pasto);
        setAnimal(tipo_animal);
        setNome_contato(nome_contato);
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
        telefone = param;
    }
    
    public void setEndereco(String param){
        endereco=param.trim().isEmpty()?"ENDEREÇO NÃO IDENTIFICADO":param.toUpperCase();
    }
    
    public void setPasto(TipoPasto tipo_pasto){
       this.tipo_pasto = tipo_pasto;
    }
    
    public void setAnimal(TipoAnimal tipo_animal){
       this.tipo_animal = tipo_animal;
    }
    
   public void setNome_contato(String param){
       nome_contato=param.trim().isEmpty()?"CONTATO NÃO IDENTIFICADO":param.toUpperCase();
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
    
    public TipoPasto getPasto(){
        return tipo_pasto;
    }
    
      public TipoAnimal getAnimal(){
        return tipo_animal;
    }
    
    
    public String getNome_contato(){
        return nome_contato;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final Fazenda other = (Fazenda) obj;
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
