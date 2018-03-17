/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.guia1;

/**
 *
 * @author Emancia7
 */
public class cuadrado {

    public double base;
    public double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double diagonal() {
        double numero;
        numero = Math.pow(base, 2) + Math.pow(altura, 2);
        return Math.pow(numero, 0.5);
    }

}
