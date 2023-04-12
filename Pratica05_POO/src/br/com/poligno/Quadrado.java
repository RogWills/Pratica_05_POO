package br.com.poligno;

public class Quadrado extends PoligonoRegular{

    public Quadrado(int numLados, float tamLado) {
        super(numLados, tamLado);
    }
    public float calcularArea(){
        return getTamLado()*getTamLado();
    }
}
