/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Operação {
    private double valorA;
    private double valorB;
    
    
    public Operação() {
        this(0.0,0.0);
        
    }

    public Operação(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }
    
    public double getSoma() {
        return (getValorA() + getValorB());
    }
    
    public double getProduto() {
        return (getValorA() * getValorB());
    }
    
    public double getQuociente() {
        return (getValorA() / getValorB());
    }
    
    public double getDiferenca() {
        return (getValorA() - getValorB());
    }
}
