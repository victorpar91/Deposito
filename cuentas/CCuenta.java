package cuentas;

/**
 * Clase que representa una cuenta bancaria con información del titular, número de cuenta, saldo y tipo de interés.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    
    /** Número de cuenta bancaria */
    private String cuenta;
    
    /** Saldo actual de la cuenta */
    private double saldo;
    
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto de la cuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre Nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta bancaria.
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo en la cuenta.
     * @param saldo Nuevo saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     * @return Tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece un nuevo tipo de interés para la cuenta.
     * @param tipoInterés Nuevo tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return Saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("Saldo insuficiente");
        }
        saldo = saldo - cantidad;
    }
}
