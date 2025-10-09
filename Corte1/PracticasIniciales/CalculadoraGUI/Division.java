// ==================== Division.java ====================
/**
 * Clase que implementa la operación de división
 */
public class Division implements Operacion {
    /**
     * Calcula la división de dos números
     * Lanza una excepción si se intenta dividir por cero
     * @param n1 Primer número (dividendo)
     * @param n2 Segundo número (divisor)
     * @return El cociente de n1 / n2
     * @throws ArithmeticException si n2 es igual a 0
     */
    @Override
    public double calcular(Numero n1, Numero n2) {
        // Validar que no se divida por cero
        if (n2.getValor() == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        // Realizar la división con conversión a double para obtener decimales
        return (double) n1.getValor() / n2.getValor();
    }

    /**
     * Retorna el nombre de la operación
     * @return "División"
     */
    @Override
    public String getNombre() {
        return "División";
    }
}
