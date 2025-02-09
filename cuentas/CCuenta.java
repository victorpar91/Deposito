package cuentas;

public class CCuenta {

    // Private attributes (encapsulated)
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    // Default constructor
    public CCuenta() {
    }

    // Constructor with parameters
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    // Getters and setters for all attributes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    // Method to check account balance
    public double estado() {
        return saldo;
    }

    // Method to deposit money
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("Cannot deposit a negative amount");
        }
        saldo = saldo + cantidad;
    }

    // Method to withdraw money
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("Cannot withdraw a negative amount");
        }
        if (estado() < cantidad) {
            throw new Exception("Insufficient balance");
        }
        saldo = saldo - cantidad;
    }
}
