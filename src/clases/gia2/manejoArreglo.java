/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.gia2;

/**
 *
 * @author Emancia7
 */
public class manejoArreglo {

    public String[] arreglo = new String[10];

    public String[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(String[] arreglo) {
        this.arreglo = arreglo;
    }

    public String[] ordenar() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10 - j; i++) {
                if (arreglo[i].compareTo(arreglo[i + 1]) > 0) {
                    String aux;
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = aux;
                }
            }
        }
        return arreglo;
    }
}
