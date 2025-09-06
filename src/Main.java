//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(6);
        quadrado.calcularArea();
        FormaGeometrica c = new Circulo(2);
        System.out.println("circulo");
        c.calcularArea();
    }
}