package br.senai.sp.sistemacalculo.Model;

public class Quadrado {

    public double lado;
    public double resultadoArea;
    public double resultadoPerimetro;

    public double calcularArea() {
        return resultadoArea = lado * lado;
    }
    public double calcularPerimetro() {
       return  resultadoPerimetro = 4 * lado;
    }

}

