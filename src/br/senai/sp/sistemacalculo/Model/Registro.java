package br.senai.sp.sistemacalculo.Model;

import java.util.Scanner;

public class Registro {

    Triangulo triangulo = new Triangulo();
    Quadrado quadrado = new Quadrado();
    Circulo circulo = new Circulo();
    Retangulo retangulo = new Retangulo();

    Scanner teclado = new Scanner(System.in);

    public Triangulo CadastrarTriangulo() {

        System.out.println("Digite a altura do triângulo: ");
        triangulo.altura = teclado.nextDouble();
        System.out.println("Digite a base do triângulo: ");
        triangulo.base = teclado.nextDouble();

        return triangulo;
    }

    public Quadrado CadastrarQuadrado() {

        System.out.println("Digite o lado do quadrado: ");
        quadrado.lado = teclado.nextDouble();

        return quadrado;
    }

    public Circulo CadastrarCirculo() {

        System.out.println("Digite o raio do círculo: ");
        circulo.raio = teclado.nextDouble();

        return circulo;
    }

    public Retangulo CadastrarRetangulo() {

        System.out.println("Digite a base do retângulo: ");
        retangulo.base = teclado.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        retangulo.altura = teclado.nextDouble();

        return retangulo;
    }
}
