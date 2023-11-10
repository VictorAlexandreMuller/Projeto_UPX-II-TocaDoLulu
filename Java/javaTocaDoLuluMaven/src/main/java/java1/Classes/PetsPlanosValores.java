package java1.Classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pets_Planos_Valores")
public class PetsPlanosValores {
    @Id
    private int id;
    private String plano;
    private double valor;
    
    public PetsPlanosValores(int id, String plano, double valor) {
        this.id = id;
        this.plano = plano;
        this.valor = valor;
    }

    public PetsPlanosValores() {
    }

    public PetsPlanosValores(String plano) {
        this.plano = plano;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String imprimir(){
        return plano;
    }

    @Override
    public String toString() {
        return plano;
    }
        
}
