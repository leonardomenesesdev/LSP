public class Quadrado extends FormaGeometrica{
    private int lado;

    public Quadrado() {
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public void calcularArea(){
        int area = this.lado*this.lado;
        System.out.println("Area: "+area);
    }
}
