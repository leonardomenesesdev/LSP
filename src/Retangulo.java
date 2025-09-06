public class Retangulo extends FormaGeometrica{
    private int base, altura;

    public Retangulo() {
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        int area = this.base*this.altura;
        System.out.println("Area: "+area);
    }
}
