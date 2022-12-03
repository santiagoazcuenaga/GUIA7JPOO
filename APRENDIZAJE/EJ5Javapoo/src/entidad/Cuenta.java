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
public class Cuenta {
    public double numeroCuenta;
  public long Dni;
  public double saldoActual;

    public Cuenta() {
    }

    public Cuenta(double numeroCuenta, long Dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.Dni = Dni;
        this.saldoActual = saldoActual;
    }

    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(double numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
  
}
