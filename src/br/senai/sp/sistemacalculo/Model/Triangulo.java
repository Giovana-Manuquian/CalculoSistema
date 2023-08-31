package br.senai.sp.sistemacalculo.Model;

public class Triangulo {

    public double altura;
    public double base;
    public double calcularArea;
    public double calcularPerimetro;
    public double resultadoArea;
    public double resultadoPerimetro;

    public double CalcularArea(){
        return resultadoArea = (base * altura) / 2;
    }

    public double CalcularPerimetro(){
        return resultadoPerimetro = base + altura * 2;
    }

}
