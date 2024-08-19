package Lista_1;

//Faça um programa que receba 2 valores e retorne o maior entre eles.

import java.util.Scanner;

public class Ex_02_MaiorDeDoisValores {

    public static void main( String args[] ){
        Scanner scanner = new Scanner(System.in);
        int val1;
        int val2;

        while(true){
            System.out.println("Digite o primeiro valor: ");
            try{
                val1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch(Exception e){
                System.out.println("Insira um número válido.");
                continue;
            }
        }

        while(true){
            System.out.println("Digite o segundo valor: ");
            try{
                val2 = Integer.parseInt(scanner.nextLine());
                break;
            } catch(Exception e){
                System.out.println("Insira um número válido.");
                continue;
            }
        }


        System.out.println("O maior valor é: " + maiorDeDoisValores(val1, val2));

    }


    public static int maiorDeDoisValores(int valor1, int valor2){
        return Math.max(valor1, valor2);

    }

}

