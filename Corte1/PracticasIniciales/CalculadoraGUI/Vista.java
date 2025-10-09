import java.util.Scanner;

/**
 * Clase Vista - Maneja toda la interacción con el usuario
 * Se encarga de mostrar información y recibir entrada del usuario
 */
public class Vista {
    private Scanner scanner;

    /**
     * Constructor que inicializa el Scanner para leer entrada del usuario
     */
    public Vista() {
        scanner = new Scanner(System.in);
    }

    /**
     * Muestra un mensaje en consola
     * @param mensaje El mensaje a mostrar
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Solicita y lee un número entero del usuario con validación
     * @param prompt El mensaje a mostrar al usuario
     * @return El número entero ingresado
     */
    public int leerNumero(String prompt) {
        System.out.print(prompt);
        // Validar que el usuario ingrese un número entero
        while (!scanner.hasNextInt()) {
            System.out.print("Error: Debe ingresar un numero entero. " + prompt);
            scanner.next(); // Limpiar entrada inválida
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        return numero;
    }

    /**
     * Muestra el menú principal con cada operación como opción individual
     * @param operaciones Array con las operaciones disponibles
     * @return La opción seleccionada por el usuario
     */
    public int mostrarMenuPrincipal(Operacion[] operaciones) {
        System.out.println("\n====================================");
        System.out.println("        CALCULADORA - MENU          ");
        System.out.println("====================================");
        System.out.println("Seleccione la operacion a realizar:");
        System.out.println();
        
        // Mostrar cada operación como una opción individual
        for (int i = 0; i < operaciones.length; i++) {
            System.out.println("  " + (i + 1) + ". " + operaciones[i].getNombre());
        }
        
        System.out.println("  0. Salir");
        System.out.println();
        System.out.print("Ingrese su opcion: ");
        
        // Validar entrada numérica
        while (!scanner.hasNextInt()) {
            System.out.print("Error: Opcion invalida. Ingrese un numero: ");
            scanner.next();
        }
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        return opcion;
    }

    /**
     * Muestra el resultado de una operación con formato mejorado
     * @param operacion Nombre de la operación realizada
     * @param num1 Primer número
     * @param num2 Segundo número
     * @param resultado El resultado obtenido
     */
    public void mostrarResultado(String operacion, int num1, int num2, double resultado) {
        System.out.println("\n-------------------------------------");
        System.out.println("            RESULTADO                ");
        System.out.println("-------------------------------------");
        
        // Mostrar la operación con símbolos matemáticos
        String simbolo = obtenerSimbolo(operacion);
        System.out.println("  " + num1 + " " + simbolo + " " + num2 + " = " + resultado);
        System.out.println();
    }

    /**
     * Obtiene el símbolo matemático correspondiente a una operación
     * @param operacion Nombre de la operación
     * @return El símbolo matemático
     */
    private String obtenerSimbolo(String operacion) {
        // Normalizar el nombre de la operación
        String opNormalizada = operacion.toLowerCase();
        
        if (opNormalizada.contains("suma")) {
            return "+";
        } else if (opNormalizada.contains("resta")) {
            return "-";
        } else if (opNormalizada.contains("multiplica")) {
            return "x";
        } else if (opNormalizada.contains("divisi")) {
            return "/";
        } else {
            return "";
        }
    }

    /**
     * Pausa la ejecución hasta que el usuario presione Enter
     */
    public void pausar() {
        System.out.print("Presione Enter para continuar...");
        scanner.nextLine();
    }

    /**
     * Muestra un mensaje de error
     * @param error El mensaje de error a mostrar
     */
    public void mostrarError(String error) {
        System.out.println("\nERROR: " + error);
        System.out.println();
    }

    /**
     * Muestra mensaje de despedida al salir de la aplicación
     */
    public void mostrarDespedida() {
        System.out.println("\n====================================");
        System.out.println("  Gracias por usar la calculadora  ");
        System.out.println("         Hasta pronto :)            ");
        System.out.println("====================================\n");
    }

    /**
     * Cierra el Scanner y libera recursos
     */
    public void cerrar() {
        scanner.close();
    }
}

