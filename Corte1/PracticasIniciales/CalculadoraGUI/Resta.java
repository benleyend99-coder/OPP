// ==================== Resta.java ====================
/**
 * Clase que implementa la operación de resta
 */
public class Resta implements Operacion {
    /**
     * Calcula la resta de dos números
     * @param n1 Primer número (minuendo)
     * @param n2 Segundo número (sustraendo)
     * @return La resta de n1 - n2
     */
    @Override
    public double calcular(Numero n1, Numero n2) {
        return n1.getValor() - n2.getValor();
    }

    /**
     * Retorna el nombre de la operación
     * @return "Resta"
     */
    @Override
    public String getNombre() {
        return "Resta";
    }
}