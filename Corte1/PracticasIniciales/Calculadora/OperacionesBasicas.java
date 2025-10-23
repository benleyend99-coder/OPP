public class OperacionesBasicas {

    public OperacionesBasicas() {
        // Constructor vacío, no necesita inicialización especial
    }

    // ----- Operaciones básicas -----
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    // ----- Operaciones avanzadas -----

    // Factorial de un número entero (n!)
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Potenciación (a^b)
    public double potenciar(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada (√a)
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo");
        }
        return Math.sqrt(numero);
    }

}
