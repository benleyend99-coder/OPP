public class Potenciacion implements Operacion {

    @Override
    public double calcular(Numero n1, Numero n2) {
        double base = n1.getValor();
        int exponente = (int) n2.getValor();
        double resultado = 1;
        if (exponente == 0) return 1;
        boolean negativo = exponente < 0;
        if (negativo) exponente = -exponente;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return negativo ? 1 / resultado : resultado;
    }

    @Override
    public String getNombre() {
        return "Potenciación";
    }
}
