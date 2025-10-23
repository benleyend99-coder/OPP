import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int leerNumero(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Error: Debe ingresar un número entero. " + prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int mostrarMenuPrincipal() {
        System.out.println("\n========== CALCULADORA ==========");
        System.out.println("1. Realizar operaciones");
        System.out.println("2. Salir");
        return leerNumero("Seleccione una opción: ");
    }

    public int mostrarMenu() {
        mostrarMensaje("\n=== MENÚ PRINCIPAL ===");
        mostrarMensaje("1. Operaciones matemáticas");
        mostrarMensaje("2. Cálculo de áreas de figuras");
        mostrarMensaje("3. Salir");
        return leerNumero("Seleccione una opción: ");
    }

    public int mostrarMenuAreas() {
        mostrarMensaje("\n--- MENÚ DE ÁREAS ---");
        mostrarMensaje("1. Cuadrado");
        mostrarMensaje("2. Rectángulo");
        mostrarMensaje("3. Circunferencia");
        mostrarMensaje("4. Triángulo rectángulo");
        return leerNumero("Seleccione una figura: ");
    }

    public void mostrarResultado(String operacion, double resultado) {
        System.out.println(operacion + ": " + resultado);
    }

    public void mostrarError(String error) {
        System.out.println("ERROR: " + error);
    }

    public void mostrarDespedida() {
        System.out.println("\n¡Gracias por usar la calculadora! Hasta pronto.");
    }

    public void cerrar() {
        scanner.close();
    }
}
