public class AreaFiguras {

    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public double areaCircunferencia(double radio) {
        double pi = 3.141592653589793;
        return pi * radio * radio;
    }

    public double areaTrianguloRectangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
