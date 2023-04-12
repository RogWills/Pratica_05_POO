package br.com.poligno;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4,4);
        Triangulo t1 = new Triangulo(3,4);
        //PoligonoRegular q2 = new Quadrado(4,5);
        System.out.println("Area do Quadrado "+ q1.calcularArea());
        System.out.println("Area do Triangulo "+ t1.calcularArea());

        System.out.println("Perimetro do Quadrado " + q1.calcularPerimetro());
        System.out.println("Perimostro do Triangulo " + t1.calcularPerimetro());

    }
}