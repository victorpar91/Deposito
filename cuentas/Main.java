package cuentas;

/**
 * Clase principal para ejecutar el programa de ejemplo.
 */
public class Main {

    /**
     * Constructor por defecto de la clase Main.
     * Inicializa la clase sin realizar configuraciones adicionales.
     */
    public Main() {
        // Constructor vacío por defecto
    }

    /**
     * Método principal que crea un objeto de cuenta y ejecuta operaciones sobre él.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear el objeto cuenta1
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Llamar al método operativa_cuenta con una cantidad específica
        operativa_cuenta(cuenta1, 500f);
    }

    /**
     * Realiza operaciones de retiro e ingreso en una cuenta.
     * @param cuenta Objeto de la cuenta sobre la que se operará.
     * @param cantidad Cantidad de dinero a retirar e ingresar.
     */
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
