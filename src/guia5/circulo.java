/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Emancia7
 */
public class circulo {

    public double radio;
    public double diametro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiamertro() {
        return diametro;
    }

    public void setDiamertro(double diamertro) {
        this.diametro = diamertro;
    }

    public double areaRadio() {
        return (Math.PI) * (Math.pow(radio, 2));
    }

    public double areaDiametro() {
        return (Math.PI) * (Math.pow(diametro / 2, 2));
    }

}
