package br.senai.sp.sistemacalculo.Model;

public class Exibicao {



    public void ExibiTriangulo(Triangulo resultado){
        System.out.println("O resultado do cálculo da area é: " + resultado.resultadoArea);
        System.out.println("O resultado do cálculo do perimetro é: " + resultado.resultadoPerimetro);
        resultado.CalcularPerimetro();
    }

    public void ExibiQuadrado(Quadrado resultado){
        System.out.println("O resultado do cálculo da area é: " + resultado.resultadoArea);
        System.out.println("O resultado do cálculo do perimetro é: " + resultado.resultadoPerimetro);
    }

    public void ExibiCirculo(Circulo resultado){
        System.out.println("O resultado do cálculo da area é: " + resultado.resultadoPerimetro);
        resultado.calcularArea();
        System.out.println("O resultado do cálculo do perimetro é: " + resultado.resultadoPerimetro);
        resultado.calcularPerimetro();
    }

    public void ExibiRetangulo(Retangulo resultado){
        System.out.println("O resultado do cálculo da area é: " + resultado.resultadoPerimetro);
        resultado.calcularArea();
        System.out.println("O resultado do cálculo do perimetro é: " + resultado.resultadoPerimetro);
        resultado.calcularPerimetro();
    }

}


