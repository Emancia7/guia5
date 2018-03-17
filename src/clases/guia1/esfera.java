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
public class esfera {

    public double radio;
    public double diametro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double volumenRadio() {
        return (4/3)*(Math.PI)*(Math.pow(radio, 3));
    }

    public double volumenDiametro() {
        return (4/3)*(Math.PI)*(Math.pow(diametro/2, 3));
    }
}
