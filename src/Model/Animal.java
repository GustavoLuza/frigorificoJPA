package Model;

import Tipos.TipoAnimal;
import Tipos.TipoSexo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ANIMAL")

public class Animal implements java.io.Serializable {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @SwingColumn(description = "CÓDIGO ANIMAL", colorOfBackgound = "")
    private int id;
    
    @Column(name = "RACA",length = 255, nullable = false)
    @SwingColumn(description = "RAÇA", colorOfBackgound = "")
    private String raca;
    
    @Column(name = "ESPECIE",length = 255, nullable = false)
    @SwingColumn(description = "ESPÉCIE", colorOfBackgound = "")
    private TipoAnimal especie;
    
    @Column(name = "PESO", nullable = false)
    private double peso;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "SEXO", length = 1, nullable = false)
    private TipoSexo sexo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FAZENDA", nullable = false, referencedColumnName = "ID")
    @SwingColumn(description = "FAZENDA", colorOfBackgound = "")
    private Fazenda fazenda;
 
    public Animal(){
        setRaca("PADRÃO");
        setPeso(0.00);
        this.setSexo(TipoSexo.M);
    }
    public Animal(  int id,Fazenda fazenda, String raca, TipoAnimal especie, double peso, TipoSexo sexo){
        this.id = id;
        this.setRaca(raca);
        this.setEspecie(especie);
        this.setPeso(peso);
        this.setSexo(sexo);
        this.setFazenda(fazenda);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRaca(String param) {
        this.raca=param.trim().isEmpty()?"RAÇA NÃO IDENTIFICADA":param.toUpperCase();
    }
    
    public void setEspecie(TipoAnimal especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public int getId() {
        return id;
    }

    public String getRaca() {
        return raca;
    }
     
    public TipoAnimal getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
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
        final Animal other = (Animal) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    } 
}
