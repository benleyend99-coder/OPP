// ==================== Operacion.java ====================
/**
 * Interfaz que define el funcionamiento para todas las operaciones matemáticas
 */
public interface Operacion {
    /**
     * Calcula el resultado de la operación entre dos números
     * @param n1 Primer número
     * @param n2 Segundo número
     * @return El resultado de la operación
     */
    double calcular(Numero n1, Numero n2);
    
    /**
     * Obtiene el nombre de la operación
     * @return El nombre de la operación
     */
    String getNombre();
}