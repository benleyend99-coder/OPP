public class RaizCuadrada implements Operacion {

    @Override
    public double calcular(Numero n1, Numero n2) {
        double numero = n1.getValor();
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }

        // Método de aproximación de Newton-Raphson
        double x = numero;
        double precision = 0.00001;
        while ((x * x - numero) > precision || (x * x - numero) < -precision) {
            x = 0.5 * (x + numero / x);
        }
        return x;
    }

    @Override
    public String getNombre() {
        return "Raíz Cuadrada";
    }
}

