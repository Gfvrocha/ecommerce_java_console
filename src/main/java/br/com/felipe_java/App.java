package br.com.felipe_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.JOptionPane;

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

        /*
         * ==== Exercicio 2
         * Paula tem uma petshop, ela precisa de um sistema para controlar seus serviços.
         * Neste sistema, precisa cadastrar o cliente (Dados básicos) os dados do pet, o peso do pet
         * depois o sistema deverá calcular o valor do banho pelo peso do pet.
         * calculo: 
         * 
         *  - Para macho:
         *      (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 15 / 100
         *  - Para femea:
         *      (pesoDoPet * valorPorPeso) + (pesoDoPet * valorPorPeso) * 30 / 100
         * 
         * Feito o calculo o sistema deverá mostrar um relatorio com os dados do pedido e o valor total a pagar.
         

         System.out.println("========================================");
         System.out.println("\t PETSHOP DA PAULA");
         System.out.println("========================================");

         System.out.println("Qual é o nome do cliente: ");
         var nomeCliente = reader.readLine();

         System.out.println("Qual é o endereço do cliente: ");
         var enderecoCliente = reader.readLine();

         System.out.println("Telefone: ");
         var telefoneCliente = Integer.parseInt( reader.readLine());

         System.out.println("========================================");
         System.out.println("\t DADOS DO PET");
         System.out.println("========================================");


         System.out.println("Nome do Pet: ");
         var nomePet = reader.readLine();

         System.out.printf("Peso do(a) %s: ", nomePet);
         double pesoPet = Double.parseDouble( reader.readLine());

         System.out.println("Sexo => M(macho) F(femea): ");
         var sexoPet = reader.readLine();
        
         var valorTotal = 0.0;   

         if (sexoPet.equals("M")) {
            valorTotal = (pesoPet * 2.50)  + (pesoPet * 2.50) * 15 / 100;

            System.out.println("========================================");
            System.out.println("\tORDEM DE SERVIÇO");
            System.out.println("========================================");
            System.out.printf("Pet: %s\nPeso: %sKg\nSexo: %s\nValor total: R$%s\n\n ", nomePet, pesoPet, sexoPet, valorTotal);
            
         } 
         if (sexoPet.equals("F")) {
            valorTotal = (pesoPet * 2.50)  + (pesoPet * 2.50) * 15 / 100;
            
            System.out.println("========================================");
            System.out.println("\tORDEM DE SERVIÇO");
            System.out.println("========================================");
            System.out.printf("Pet: %s\nPeso: %sKg\nSexo: %s\nValor total: R$%s\n\n ", nomePet, pesoPet, sexoPet, valorTotal);
         }
         */

         // Trabalhando com JOptionPane

         var msn = "PetShop da Paula\n Seja bem-vindo(a)";
         JOptionPane.showMessageDialog(null, msn ); 

         String nomeCliente = JOptionPane.showInputDialog("Qual é o nome do cliente: ");
         String telefone = JOptionPane.showInputDialog("Telefone do " + nomeCliente +": ");
         String nomePet = JOptionPane.showInputDialog("Qual é o nome do(a) Pet: ");
         double pesoPet = Double.parseDouble(JOptionPane.showInputDialog("Qual o peso do(a) "+nomePet));
         String sexoPet = JOptionPane.showInputDialog("Sexo do(a) "+nomePet + "\nM = macho\nF = femêa");

         var valorPorPeso = 2.6;
         var valorTotal = 0.0;

         if (sexoPet.equals("M")) {
            valorTotal = (pesoPet * valorPorPeso) + (pesoPet * valorPorPeso) * 15 / 100;
         } 
         else {
            valorTotal = (pesoPet * valorPorPeso) + (pesoPet * valorPorPeso) * 30 / 100;
         }

         String relatorio = "Nome do cliente: " + nomeCliente + "\n";
         relatorio += "Telefone: " + telefone + "\n";
         relatorio += "Pet do(a) " + nomeCliente + ": " + nomePet + "\n";
         relatorio += "Peso do(a) " + nomePet + ": " + pesoPet + "\n";
         relatorio += "Total do serviço: " + valorTotal + "\n";
         
         JOptionPane.showMessageDialog(null, relatorio );




         













         



    
         
    }    



}
