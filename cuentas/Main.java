package cuentas;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto cuenta1
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Llamar al método operativa_cuenta con una cantidad específica
        operativa_cuenta(cuenta1, 500f);
    }

    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;

        // Mostrar saldo actual
        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(cantidad);
            System.out.println("Retiro exitoso de " + cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar " + cantidad + ": " + e.getMessage());
        }

        try {
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso exitoso de " + cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar " + cantidad + ": " + e.getMessage());
        }
    }
}
