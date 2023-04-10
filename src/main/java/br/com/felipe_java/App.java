package br.com.felipe_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        /*
         * Exercício 1
         * João é um professor de matematica e precisa de um programa que faça
         * o calculo da seguinte expressão:

         *  (X * 8 + Y) - X + Y / 100
         * 
         */
        System.out.println("===========================");
        System.out.println("\t BEM-VINDO");
        System.out.println("===========================");
        System.out.println("João, vamos resolver o seu problema");
        System.out.println("Vou precisar de algumas informações para a expressão (X * 8 + Y) - X + Y / 100");

        System.out.println("Digite o valor de X:" );
        int x = Integer.parseInt(reader.readLine());

        System.out.println("Digite o valor de Y:" );
        int y = Integer.parseInt(reader.readLine());

        var operacao = (x * 8 + y) - x + y / 100;

        System.out.println("Resolvendo => ( " + x + " * 8 + " + y + ") - " + x + " + " + y + "/ 100");
        System.out.println("Resultado: " + operacao);

    }
}
