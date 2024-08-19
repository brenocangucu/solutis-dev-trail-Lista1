package Lista_1;

/*
Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida
e a quantidade de combustível em litros utilizados para cada tanque cheio.

Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e
os litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio.

O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque cheio
e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto.

Todos os cálculos de média devem produzir resultados de ponto flutuante.

 */

import java.util.Scanner;

public class Ex_12_Motoristas {
    public static void main(String[] args){
        //armazenar a quilometragem e o consumo total
        int totalKmDirigidos = 0;
        int totalLitrosDeGasolinaConsumidos = 0;
        int contador = 1;
        //para um tanque
        int kmDirigidos;
        int litrosDeGasolinaConsumidos;
        double mediaKmLitro;

        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Tanque " + contador);
                System.out.println("Digite o número de kM dirigidos: (enter finaliza)");

                String input = scanner.nextLine();

                if(input.equals("")){
                    System.out.println("Total de quilometros rodados: " + totalKmDirigidos + "\nTotal de litros de gasolina consumidos: " + totalLitrosDeGasolinaConsumidos + "\n");
                    break;
                }
                kmDirigidos = Integer.parseInt(input);

                System.out.println("Digite a quantidade de litros de gasolina consumidos:");
                litrosDeGasolinaConsumidos = Integer.parseInt(scanner.nextLine());

                mediaKmLitro = kmDirigidos * 1.0 / litrosDeGasolinaConsumidos;

                System.out.println("Tanque " + contador + ", consumo: " + mediaKmLitro +  "km/l");

                totalKmDirigidos += kmDirigidos;
                totalLitrosDeGasolinaConsumidos += litrosDeGasolinaConsumidos;

                System.out.println("Total de quilometros rodados: " + totalKmDirigidos + "\nTotal de litros de gasolina consumidos: " + totalLitrosDeGasolinaConsumidos + "\n");

                contador++;
            } catch (Exception e) {
                System.out.println("Número inválido");
            }

        }
    }
}
