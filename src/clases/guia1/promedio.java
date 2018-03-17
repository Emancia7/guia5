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
public class promedio {

    public Double[] vector = new Double[10];

    public Double[] getVector() {
        return vector;
    }

    public void setVector(Double[] vector) {
        this.vector = vector;
    }
    
    public double calcularPromedio(){
        double acomulador=0;
        for (int i = 0; i < 10; i++) {
            acomulador = acomulador + vector[i];
        }
        return acomulador/10;
    }
}
