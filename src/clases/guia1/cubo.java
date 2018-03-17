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
public class cubo {

    public double diagonal;

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double volumenDiagonal() {
        double arista = diagonal / Math.pow(2, 0.5);
        return Math.pow(arista, 3);
    }
}
