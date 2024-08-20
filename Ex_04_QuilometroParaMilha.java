package Lista_1;

/*
Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
converte-a para quilômetros e apresenta o resultado no console. (fórmula de conversão: 1 milha = 1.609 km).
 */

import java.util.Scanner;

public class Ex_04_QuilometroParaMilha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float distancia;
        final float conversaoMilhaKm = 1.609f;

        while(true){
            try{
                System.out.println("Distância em milhas:");
                distancia = Float.parseFloat(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Número inválido.");
            }
        }

        System.out.println(distancia + " mi equivale a: ");

        distancia *= conversaoMilhaKm;

        System.out.println(distancia + " km.");
    }
}
