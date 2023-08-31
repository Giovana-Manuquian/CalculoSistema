package br.senai.sp.sistemacalculo.Model;

public class Circulo {

    public double raio;
    public double resultadoArea;
    public double resultadoPerimetro;

    public double calcularArea() {
        return resultadoArea = Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return resultadoPerimetro = 2 * Math.PI * raio;
    }
}

