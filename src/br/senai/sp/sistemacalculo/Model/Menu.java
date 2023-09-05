package br.senai.sp.sistemacalculo.Model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Registro registro = new Registro();
    Exibicao exibicao = new Exibicao();

    public void Menu() {
        int opcao = 0;
        boolean opcaoValida;

        do {
            opcaoValida = true;

            System.out.println("Digite a opção da forma geométrica que deseja calcular: \n" +
                    "1 - Triângulo\n" +
                    "2 - Quadrado\n" +
                    "3 - Circulo\n" +
                    "4 - Retangulo\n" +
                    "Opção: ");

            if (teclado.hasNextInt()) {
                opcao = teclado.nextInt();
                teclado.nextLine(); // Limpar a quebra de linha no buffer
                switch (opcao) {
                    case 1:
                        Triangulo objTriangulo = registro.CadastrarTriangulo();
                        objTriangulo.CalcularArea();
                        objTriangulo.CalcularPerimetro();
                        exibicao.ExibiTriangulo(objTriangulo);
                        opcaoValida = true;
                        break;
                    case 2:
                        Quadrado objQuadrado = registro.CadastrarQuadrado();
                        objQuadrado.calcularArea();
                        objQuadrado.calcularPerimetro();
                        exibicao.ExibiQuadrado(objQuadrado);
                        opcaoValida = true;
                        break;
                    case 3:
                        Circulo objCirculo = registro.CadastrarCirculo();
                        objCirculo.calcularArea();
                        objCirculo.calcularPerimetro();
                        exibicao.ExibiCirculo(objCirculo);
                        opcaoValida = true;
                        break;
                    case 4:
                        Retangulo objRetangulo = registro.CadastrarRetangulo();
                        objRetangulo.calcularArea();
                        objRetangulo.calcularPerimetro();
                        exibicao.ExibiRetangulo(objRetangulo);
                        opcaoValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Digite uma opção válida.");
                        opcaoValida = false;
                        break;
                }
            } else {
                System.out.println("Opção inválida. Digite apenas números.");
                teclado.nextLine(); // Limpar a entrada inválida do buffer
                opcaoValida = false;
            }
        } while (!opcaoValida);
    }
}

