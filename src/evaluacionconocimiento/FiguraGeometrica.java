
package evaluacionconocimiento;

abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();
}