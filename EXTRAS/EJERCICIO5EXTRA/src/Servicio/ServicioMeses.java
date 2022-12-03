/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!.
 */
package Servicio;

import entidad.Meses;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioMeses {

    static Scanner leer = new Scanner(System.in);

    public void llenarMeses(Meses cs) {

        for (int i = 0; i < 12; i++) {
            switch (i + 1) {

                case 1:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Enero");
                    break;
                case 2:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Febrero");
                    break;
                case 3:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Marzo");
                    break;
                case 4:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Abril");
                    break;
                case 5:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Mayo");
                    break;
                case 6:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Junio");
                    break;
                case 7:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Julio");
                    break;
                case 8:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Agosto");
                    break;
                case 9:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Septiembre");
                    break;
                case 10:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Octubre");
                    break;
                case 11:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Noviembre");
                    break;
                case 12:
                    Arrays.fill(cs.getMeses(), i, (i + 1), "Diciembre");
                    break;
            }

        }
cs.setMesSecreto(cs.getMeses()[8]);
    }

    public void esCorrecto(Meses cs) {

        String messi;

        System.out.println("introduzca el mes a buscar");

        do {
            messi = leer.next();
            if (cs.getMesSecreto().equals(messi)) {
                System.out.println("Correcto");

            } else {
                System.out.println("intentelo de nuevo");

            }

        } while (!cs.getMesSecreto().equals(messi));

    }
}
