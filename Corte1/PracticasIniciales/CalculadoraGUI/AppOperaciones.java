// ==================== AppOperaciones.java ====================
/**
 * Clase principal de la aplicación de calculadora
 * Permite al usuario realizar operaciones matemáticas básicas de forma individual
 */
public class AppOperaciones {
    private Vista vista;
    private Operacion[] operaciones;

    /**
     * Constructor que inicializa la vista y las operaciones disponibles
     */
    public AppOperaciones() {
        vista = new Vista();
        // Array con todas las operaciones disponibles
        operaciones = new Operacion[]{
            new Suma(),
            new Resta(),
            new Multiplicacion(),
            new Division()
        };
    }

    /**
     * Método principal que ejecuta el bucle de la aplicación
     */
    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            // Mostrar menú principal con todas las operaciones individuales
            int opcion = vista.mostrarMenuPrincipal(operaciones);

            // Opción 0 para salir
            if (opcion == 0) {
                continuar = false;
                vista.mostrarDespedida();
            } 
            // Verificar que la opción esté en el rango de operaciones disponibles
            else if (opcion >= 1 && opcion <= operaciones.length) {
                // Realizar la operación seleccionada
                realizarOperacion(operaciones[opcion - 1]);
            } 
            else {
                vista.mostrarError("Opción inválida. Por favor seleccione una opción válida.");
            }
        }

        // Cerrar recursos al finalizar
        vista.cerrar();
    }

    /**
     * Realiza una operación específica solicitando los números al usuario
     * @param operacion La operación a realizar
     */
    private void realizarOperacion(Operacion operacion) {
        // Mostrar qué operación se va a realizar
        vista.mostrarMensaje("\n=== " + operacion.getNombre().toUpperCase() + " ===");
        
        // Solicitar los dos números al usuario
        int num1 = vista.leerNumero("Ingrese el primer numero entero: ");
        int num2 = vista.leerNumero("Ingrese el segundo numero entero: ");

        // Crear objetos Numero con los valores ingresados
        Numero n1 = new Numero(num1);
        Numero n2 = new Numero(num2);

        try {
            // Realizar el cálculo
            double resultado = operacion.calcular(n1, n2);
            vista.mostrarResultado(operacion.getNombre(), n1.getValor(), n2.getValor(), resultado);
        } catch (ArithmeticException e) {
            // Manejar errores matemáticos (ej: división por cero)
            vista.mostrarError(e.getMessage());
        }

        // Pausar para que el usuario vea el resultado
        vista.pausar();
    }

    /**
     * Método main - punto de entrada de la aplicación
     */
    public static void main(String[] args) {
        AppOperaciones app = new AppOperaciones();
        app.ejecutar();
    }
}