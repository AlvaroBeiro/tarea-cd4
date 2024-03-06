package tareacd4;

import banco.CtaCorriente;
import java.util.Scanner;
/**
 * Clase principal, crea una instancia de una cuenta
 * corriente y realiza operaciones sobre ella.
 * 
 * @author Alvaro
 * @version 1.1
 * @since 1.0
 * @see CtaCorriente
 */
public class Main {
    
    /**
     * Crea una cuenta corriente nueva e imprime el saldo en pantalla.
     * Tras ello llama a operativa_cuenta
     * 
     * @param args vacío
     */
    public static void main(String[] args) {
        CtaCorriente miCuenta;
        double saldoActual;

        miCuenta = new CtaCorriente("Koldo García Ábalos","0001-2345-07-1234567890",5000,0);
        saldoActual = miCuenta.getSaldocuenta();
        System.out.println("El saldo inicial es de "+ saldoActual +" euros");

        operativa_cuenta(miCuenta);
    }

    
    /**
     * Realiza operaciones sobre la cuenta
     * 
     * @param miCuenta La cuenta sobre la que realizar las operaciones
     */
    public static void operativa_cuenta(CtaCorriente miCuenta) {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            miCuenta.ingresar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}