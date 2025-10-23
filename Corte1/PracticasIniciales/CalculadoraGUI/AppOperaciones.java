public class AppOperaciones {
    public static void main(String[] args) {
        Vista vista = new Vista();
        OperacionesBasicas operaciones = new OperacionesBasicas();
        boolean salir = false;

        while (!salir) {
            int opcionPrincipal = vista.mostrarMenu();

            switch (opcionPrincipal) {
                case 1: // ----- Operaciones matemáticas -----
                    vista.mostrarMensaje("\n--- OPERACIONES MATEMÁTICAS ---");
                    vista.mostrarMensaje("1. Suma");
                    vista.mostrarMensaje("2. Resta");
                    vista.mostrarMensaje("3. Multiplicación");
                    vista.mostrarMensaje("4. División");
                    vista.mostrarMensaje("5. Factorial");
                    vista.mostrarMensaje("6. Potenciación");
                    vista.mostrarMensaje("7. Raíz cuadrada");
                    int opcionOperacion = vista.leerNumero("Seleccione una opción: ");

                    try {
                        switch (opcionOperacion) {
                            case 1: { // Suma
                                double a = vista.leerNumero("Ingrese el primer número: ");
                                double b = vista.leerNumero("Ingrese el segundo número: ");
                                vista.mostrarResultado("Suma", operaciones.sumar(a, b));
                                break;
                            }
                            case 2: { // Resta
                                double a = vista.leerNumero("Ingrese el primer número: ");
                                double b = vista.leerNumero("Ingrese el segundo número: ");
                                vista.mostrarResultado("Resta", operaciones.restar(a, b));
                                break;
                            }
                            case 3: { // Multiplicación
                                double a = vista.leerNumero("Ingrese el primer número: ");
                                double b = vista.leerNumero("Ingrese el segundo número: ");
                                vista.mostrarResultado("Multiplicación", operaciones.multiplicar(a, b));
                                break;
                            }
                            case 4: { // División
                                double a = vista.leerNumero("Ingrese el dividendo: ");
                                double b = vista.leerNumero("Ingrese el divisor: ");
                                vista.mostrarResultado("División", operaciones.dividir(a, b));
                                break;
                            }
                            case 5: { // Factorial
                                int n = vista.leerNumero("Ingrese un número entero positivo: ");
                                vista.mostrarResultado("Factorial de " + n, operaciones.factorial(n));
                                break;
                            }
                            case 6: { // Potenciación
                                double base = vista.leerNumero("Ingrese la base: ");
                                double exponente = vista.leerNumero("Ingrese el exponente: ");
                                vista.mostrarResultado("Potenciación", operaciones.potenciar(base, exponente));
                                break;
                            }
                            case 7: { // Raíz cuadrada
                                double num = vista.leerNumero("Ingrese el número: ");
                                vista.mostrarResultado("Raíz cuadrada", operaciones.raizCuadrada(num));
                                break;
                            }
                            default:
                                vista.mostrarError("Opción inválida. Intente nuevamente.");
                        }
                    } catch (Exception e) {
                        vista.mostrarError(e.getMessage());
                    }
                    break;

                case 2: // ----- Cálculo de áreas -----
                    int opcionArea = vista.mostrarMenuAreas();
                    switch (opcionArea) {
                        case 1: {
                            double lado = vista.leerNumero("Ingrese el lado del cuadrado: ");
                            vista.mostrarResultado("Área del cuadrado", lado * lado);
                            break;
                        }
                        case 2: {
                            double base = vista.leerNumero("Ingrese la base: ");
                            double altura = vista.leerNumero("Ingrese la altura: ");
                            vista.mostrarResultado("Área del rectángulo", base * altura);
                            break;
                        }
                        case 3: {
                            double radio = vista.leerNumero("Ingrese el radio: ");
                            vista.mostrarResultado("Área de la circunferencia", Math.PI * Math.pow(radio, 2));
                            break;
                        }
                        case 4: {
                            double base = vista.leerNumero("Ingrese la base: ");
                            double altura = vista.leerNumero("Ingrese la altura: ");
                            vista.mostrarResultado("Área del triángulo rectángulo", (base * altura) / 2);
                            break;
                        }
                        default:
                            vista.mostrarError("Opción no válida en el menú de áreas.");
                            break;
                    }
                    break;

                case 3: // ----- Salir -----
                    vista.mostrarDespedida();
                    salir = true;
                    break;

                default:
                    vista.mostrarError("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        vista.cerrar();
    }
}
