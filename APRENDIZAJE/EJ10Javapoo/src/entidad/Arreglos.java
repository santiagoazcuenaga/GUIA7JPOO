/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Arreglos {
     private double [] Arreglo1 = new double[50];
 private double [] Arreglo2= new double[20];

    public Arreglos() {
    }

    public double[] getNum1() {
        return Arreglo1;
    }

    public void setNum1(double[] Num1) {
        this.Arreglo1 = Num1;
    }

    public double[] getNum2() {
        return Arreglo2;
    }

    public void setNum2(double[] Num2) {
        this.Arreglo2 = Num2;
    }
}
