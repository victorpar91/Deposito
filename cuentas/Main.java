package cuentas;

public class Main {
    public static void main(String[] args) {
        // Create the account object cuenta1
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Call the operativa_cuenta method with a specific amount
        operativa_cuenta(cuenta1, 500f);
    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;

        // Display current balance
        saldoActual = cuenta.estado();
        System.out.println("The current balance is " + saldoActual);

        try {
            cuenta.retirar(cantidad);
            System.out.println("Successful withdrawal of " + cantidad);
        } catch (Exception e) {
            System.out.println("Failed to withdraw " + cantidad + ": " + e.getMessage());
        }

        try {
            cuenta.ingresar(cantidad);
            System.out.println("Successful deposit of " + cantidad);
        } catch (Exception e) {
            System.out.println("Failed to deposit " + cantidad + ": " + e.getMessage());
        }
    }
}
