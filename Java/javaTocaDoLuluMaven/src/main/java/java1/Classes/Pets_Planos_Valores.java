package java1.Classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pets_Planos_Valores")
public class Pets_Planos_Valores {
    @Id
    private char plano;
    private double valor;
    
    public Pets_Planos_Valores(char plano, double valor) {
        this.plano = plano;
        this.valor = valor;
    }

    public Pets_Planos_Valores() {
    }

    public char getPlano() {
        return plano;
    }

    public void setPlano(char plano) {
        this.plano = plano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
