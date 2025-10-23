public class Factorial implements Operacion {

    @Override
    public double calcular(Numero n1, Numero n2) {
        int numero = (int) n1.getValor();
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular el factorial de un número negativo");
        }
        double resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    @Override
    public String getNombre() {
        return "Factorial";
    }
}

