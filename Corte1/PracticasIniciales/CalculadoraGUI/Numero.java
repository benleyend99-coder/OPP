// ==================== Numero.java ====================
/**
 * Clase que encapsula un número entero
 * Proporciona métodos getter y setter para acceder al valor
 */
public class Numero {
    private int valor; // Valor entero almacenado

    /**
     * Constructor que inicializa el número con un valor
     * @param valor El valor entero del número
     */
    public Numero(int valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el valor del número
     * @return El valor entero almacenado
     */
    public int getValor() {
        return valor;
    }

    /**
     * Establece un nuevo valor para el número
     * @param valor El nuevo valor entero
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}