package br.senai.sp.sistemacalculo.Model;

public class Retangulo {

    public double base;
    public double altura;
    public double resultadoArea;
    public double resultadoPerimetro;

    public double calcularArea() {
        return resultadoArea = base * altura;
    }

    public double calcularPerimetro() {
        return resultadoPerimetro = 2 * (base + altura);
    }
}

