package br.com.poligno;

public abstract class PoligonoRegular {

    private int numLados;
    private float tamLado;

    public PoligonoRegular(int numLados, float tamLado) {
        this.numLados= numLados;
        this.tamLado = tamLado;
    }
    public abstract float calcularArea();
    public float calcularPerimetro(){
        return numLados*tamLado;
    }

    public int getNumLado() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public float getTamLado() {
        return tamLado;
    }

    public void setTamLado(float tamLado) {
        this.tamLado = tamLado;
    }
}
