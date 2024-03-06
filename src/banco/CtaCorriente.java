package banco;

/**
 * Clase que sirve para crear instancias de cuentas corrientes.
 * 
 * @author Alvaro
 * @version 1.1
 * @since 1.0
 */

public class CtaCorriente {
    private String nombre;
    private String cuenta;
    private double saldocuenta;
    private double interes;

    /**
     * Método que devuelve el nombre
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre
     * @param nombre establece el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la cuenta
     * @return devuelve la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que establece la cuenta
     * @param cuenta establece la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo de la cuenta saldocuenta
     * @return devuelve el saldo de la cuenta saldocuenta
     */
    public double getSaldocuenta() {
        return saldocuenta;
    }

    /**
     * Método que establece el saldo de la cuenta
     * @param saldocuenta establece el saldo de la cuenta
     */
    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**
     * Método que devuelve el interés
     * @return devuelve el interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * Método que establece el interés
     * @param interes establece el interes
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }

    public CtaCorriente()
    {
    }
    /**
     * 
     * @param nombre El nombre del individuo que posee la cuenta
     * @param cuenta El número identificador de la cuenta
     * @param saldo El saldo de la cuenta
     * @param interes los intereses cobrados o generados en la cuenta
     */

    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
    
    /**
     * Método que trata de ingresar una cantidad, lanza una excepción si no es posible.
     * 
     * @param cantidad La cantidad a ingresar
     * @throws Exception si la cantidad a ingresar es negativa
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldocuenta(getSaldocuenta() + cantidad);
    }
    
    /**
     * Método que trata de retirar una cantidad, lanza una Exception si no es posible.
     * 
     * @param cantidad La cantidad a retirar
     * @throws Exception si la cantidad a retirar es negativa o si es mayor al saldo disponible.
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldocuenta()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldocuenta(getSaldocuenta() - cantidad);
    }
}