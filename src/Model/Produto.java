package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUTO")

public class Produto implements java.io.Serializable {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @SwingColumn(description = "CÓDIGO", colorOfBackgound = "")
    private int id;
    
    @Column(name = "NOME",length = 255, nullable = false)
    @SwingColumn(description = "NOME", colorOfBackgound = "")
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FRIGORIFICO", nullable = false, referencedColumnName = "ID")
    @SwingColumn(description = "ABATEDOURO", colorOfBackgound = "")
    private Frigorifico frigorifico;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ABATE", nullable = false)
    @SwingColumn(description = "DATA DO ABATE", colorOfBackgound = "")
    private Date data_abate;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_VALIDADE", nullable = false)
    @SwingColumn(description = "VALIDADE", colorOfBackgound = "")
    private Date validade;
    
    @Column(name = "LOTE",length = 50, nullable = false)
    @SwingColumn(description = "LOTE", colorOfBackgound = "")
    private String lote;
    
    @Column(name = "PESO_TOTAL", nullable = false)  //VERIFICAR AQUI
    @SwingColumn(description = "PESO TOTAL", colorOfBackgound = "")
    private double peso_total;
    
    @Column(name = "VALOR_VENDA", nullable = false)   //VERIFICAR AQUI
    @SwingColumn(description = "VALOR DE VENDA", colorOfBackgound = "")
    private double valor_venda;
    
    public Produto(){
        setNome("PADRÃO");
        setData_abate(new Date());
        setValidade(new Date());
        setLote("0000000");
        setPeso_total(0.00);
        setValor_venda(0.00);
    }
    public Produto(  int id, Frigorifico frigorifico,String nome, Date data_abate, Date validade, String lote, double valor_venda, double peso_total){
        this.id = id;
        this.setNome(nome);
        this.setFrigorifico(frigorifico);
        this.setData_abate(data_abate);
        this.setValidade(validade);
        this.setLote(lote);
        this.setValor_venda(valor_venda);
        this.setPeso_total(peso_total);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String param) {
        nome=param.trim().isEmpty()?"NOME NÃO IDENTIFICADO":param.toUpperCase();
    }

    public void setFrigorifico(Frigorifico frigorifico) {
        this.frigorifico = frigorifico;
    }

    public void setData_abate(Date data_abate) {
        this.data_abate = data_abate;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public void setLote(String param) {
        lote=param.trim().isEmpty()?"LOTE NÃO IDENTIFICADO":param;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }
    
    public void setPeso_total(double peso_total) {
        this.peso_total = peso_total;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Frigorifico getFrigorifico() {
        return frigorifico;
    }

    public Date getData_abate() {
        return data_abate;
    }

    public Date getValidade() {
        return validade;
    }

    public String getLote() {
        return lote;
    }

    public double getValor_venda() {
        return valor_venda;
    }
    
    public double getPeso_total(){
        return peso_total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        final Produto other = (Produto) obj;
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
