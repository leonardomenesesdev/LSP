public class Circulo extends FormaGeometrica{
    private int raio;
    public Circulo(int raio) {
        this.raio = raio;
    }
    public void calcularArea(){
        double area = this.raio*this.raio*3.14;
        System.out.println("Area: "+area);
    }
}
