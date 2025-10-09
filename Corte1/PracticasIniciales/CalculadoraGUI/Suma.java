// ==================== Suma.java ====================
/**
 * Clase que implementa la operación de suma
 */
public class Suma implements Operacion {
    /**
     * Calcula la suma de dos números
     * @param n1 Primer número
     * @param n2 Segundo número
     * @return La suma de n1 + n2
     */
    @Override
    public double calcular(Numero n1, Numero n2) {
        return n1.getValor() + n2.getValor();
    }

    /**
     * Retorna el nombre de la operación
     * @return "Suma"
     */
    @Override
    public String getNombre() {
        return "Suma";
    }
}