
package evaluacionconocimiento;

public class EvaluacionConocimiento {

 public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Rojo", 5.0);
        Circulo circulo = new Circulo("Azul", 3.0);

        System.out.println("Area del cuadrado (color: " + cuadrado.getColor() + "): " + cuadrado.calcularArea());
        System.out.println("Area del círculo (color: " + circulo.getColor() + "): " + circulo.calcularArea());
    }
}
