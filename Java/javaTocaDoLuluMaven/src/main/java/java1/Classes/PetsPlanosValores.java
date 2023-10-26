package java1.Classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pets_Planos_Valores")
public class PetsPlanosValores {
    @Id
    private String plano;
    private double valor;
    
    public PetsPlanosValores(String plano, double valor) {
        this.plano = plano;
        this.valor = valor;
    }

    public PetsPlanosValores() {
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
    
    
}
