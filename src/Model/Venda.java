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
@Table(name = "VENDA")

public class Venda implements java.io.Serializable {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @SwingColumn(description = "CÓDIGO", colorOfBackgound = "")
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE", nullable = false, referencedColumnName = "ID")
    @SwingColumn(description = "CLIENTE", colorOfBackgound = "")
    private Cliente cliente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUTO", nullable = false, referencedColumnName = "ID")
    @SwingColumn(description = "PRODUTO", colorOfBackgound = "")
    private Produto produto;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_VENDA", nullable = false)
    @SwingColumn(description = "DATA DA VENDA", colorOfBackgound = "")
    private Date data_venda;
    
    @Column(name = "PESO_TOTAL", nullable = false)
    @SwingColumn(description = "PESO TOTAL", colorOfBackgound = "")
    private double peso;
    
    @Column(name = "VALOR_TOTAL", nullable = false)
    @SwingColumn(description = "VALOR TOTAL", colorOfBackgound = "")
    private double valor_total;
    
    public Venda(){
        setPeso(0.00);
        setValor_total(0.00);
    }
    public Venda(  int id,Produto produto, Cliente cliente,  Date data_venda, Double peso, Double valor_total){
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.data_venda = data_venda;
        this.peso = peso;
        this.valor_total = valor_total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor_total() {
        return valor_total;
    }


    @Override
    public int hashCode() {
        int hash = 3;
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
        final Venda other = (Venda) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
   
}
