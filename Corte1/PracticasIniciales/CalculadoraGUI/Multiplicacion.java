// ==================== Multiplicacion.java ====================
/**
 * Clase que implementa la operación de multiplicación
 */
public class Multiplicacion implements Operacion {
    /**
     * Calcula la multiplicación de dos números
     * @param n1 Primer número
     * @param n2 Segundo número
     * @return El producto de n1 * n2
     */
    @Override
    public double calcular(Numero n1, Numero n2) {
        return n1.getValor() * n2.getValor();
    }

    /**
     * Retorna el nombre de la operación
     * @return "Multiplicación"
     */
    @Override
    public String getNombre() {
        return "Multiplicación";
    }
}