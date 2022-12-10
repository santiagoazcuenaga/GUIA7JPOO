/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Fracciones;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioFracciones {

    static Scanner leer = new Scanner(System.in);

    public void pedirdatos(Fracciones b1) {
        System.out.println("ingrese el numerador de la primera fraccion");
        b1.setNumerador1(leer.nextDouble());
        System.out.println("ingrese el denominador de la primera fraccion");
        b1.setDenominador1(leer.nextDouble());
        System.out.println("ingrese el numerador de la segunda fraccion");
        b1.setNumerador2(leer.nextDouble());
        System.out.println("ingrese el denominador de la segunda fraccion");
        b1.setDenominador2(leer.nextDouble());

    }

    public Fracciones sumar(Fracciones cs) {
        double resultadoNumerador;
        double resultadoDenominador;
        resultadoNumerador = (cs.getNumerador1() * cs.getDenominador2()) + (cs.getNumerador2() * cs.getDenominador1());
        resultadoDenominador = cs.getDenominador1() * cs.getDenominador2();
        // c.num=a.num*b.den+b.num*a.den; FORMULITA PAPÁAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        //c.den=a.den*b.den
        System.out.println("Su fraccion resultante sumada es :" + resultadoNumerador + "/" + resultadoDenominador);

        return cs;
    }

    public Fracciones restar(Fracciones cs) {
        double resultadoNumeradorr;
        double resultadoDenominadorr;
        resultadoNumeradorr = (cs.getNumerador1() * cs.getDenominador2()) - (cs.getNumerador2() * cs.getDenominador1());
        resultadoDenominadorr = cs.getDenominador1() * cs.getDenominador2();
        // c.num=a.num*b.den-b.num*a.den; FORMULITA PAPÁAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        //c.den=a.den*b.den
        System.out.println("Su fraccion resultante restada es :" + resultadoNumeradorr + "/" + resultadoDenominadorr);

        return cs;
    }

    public Fracciones multiplicar(Fracciones cs) {
        double resultadoNumeradorrr;
        double resultadoDenominadorrr;
        resultadoNumeradorrr = cs.getNumerador1() * cs.getNumerador2();
        resultadoDenominadorrr = cs.getDenominador1() * cs.getDenominador2();
        // c.num=a.num*b.num; FORMULITA PAPÁAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        //c.den=a.den*b.den
        System.out.println("Su fraccion resultante multiplicada es :" + resultadoNumeradorrr + "/" + resultadoDenominadorrr);

        return cs;
    }

    public Fracciones dividir(Fracciones cs) {
        double lastresultadonumerador;
        double lastresultadodenominador;
        lastresultadonumerador = cs.getNumerador1() * cs.getDenominador2();
        lastresultadodenominador = cs.getDenominador1() * cs.getNumerador2();
        System.out.println("su fraccion resultante dividida es :" + lastresultadonumerador + "/" + lastresultadodenominador);
        return cs;

    }
}
