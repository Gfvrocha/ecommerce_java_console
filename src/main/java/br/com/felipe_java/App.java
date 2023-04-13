package br.com.felipe_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class App 
{
    /**
     * @param args
     * @throws IOException
     */
    public static void main( String[] args ) throws IOException
    {

        
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
        /*
        
         * ==== Exercício 1
         * João é um professor de matematica e precisa de um programa que faça
         * o calculo da seguinte expressão:

         *  (X * 8 + Y) - X + Y / 100
         * 
         
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

        */

        /* ====
         * João tem um armazem e precisa de um programa que solicite
         * o nome do seu cliente
         * o endereço do seu cliente
         * o nome do material de construção
         * o valor do material de construção
         * e a quantidade que o cliente deseja
         * no final do programa, mostre um relatorio com o valor total do produto comprado
         

         System.out.println("================================");
         System.out.println("\t DEPOSITO ROCHA");
         System.out.println("================================");

         System.out.println("Qual é o nome do seu cliente: ");
         var nomeCliente = reader.readLine();

         System.out.println("Qual é o endereço do seu cliente: ");
         var enderecoCliente = reader.readLine();

         System.out.println("Qual é o produto: ");
         var produto = reader.readLine();

         System.out.println("Quantidade: ");
         int quantidade = Integer.parseInt(reader.readLine());

         System.out.printf("Valor do produto (%s): ", produto);
         var valor = Double.parseDouble(reader.readLine());
         
         var valorTotal = quantidade * valor;

         System.out.println("\n================================");
         System.out.println("\t RELATORIO DE ENTREGA");
         System.out.println("================================\n");
         System.out.printf("Cliente: %s", nomeCliente);
         System.out.printf("\nEndereço: %s", enderecoCliente);
         System.out.printf("\nItem: %s", produto);
         System.out.printf("\nQuantidade: %s", quantidade);
         
         System.out.println("\nValor unit: R$ " + valor + "\nValor Total: R$ " + valorTotal );

         if (valorTotal > 100){
            System.out.println("\n=====================================================================================");
            System.out.println("\nParabéns " + nomeCliente + "! Em sua proxima compra você terá um desconto de 10%.");
            System.out.println("\n=====================================================================================");
        } 
        */


        
         



    
         
    }    



}
