package Lista_1;
/*
Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o
dia da semana correspondente. Suponha que Segunda corresponde a 1 , Terça corresponde a 2,
 e assim por diante. Utilizando Array.
 */

import java.util.Scanner;

public class Ex_05_DiasDaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] diasDaSemana = {"Segunda", "Terça", "Quarta",
                "Quinta", "Sexta", "Sábado", "Domingo"};

        while (true) {
            try {
                System.out.println("Digite um número de 1 a 7:");
                int dia = Integer.parseInt(scanner.nextLine()) - 1;

                if(dia < 0 | dia > 6){
                    throw new Exception();
                }

                System.out.println("Dia: " + diasDaSemana[dia]);
                break;

            } catch (Exception e) {
                System.out.println("Número inválido.");
            }
        }
    }
}