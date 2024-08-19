package Lista_1;

/*
Crie uma classe e na função main() implemente um programa que lê um número inteiro do
teclado e imprime todos os números primos menores que ele (divisíveis por 1 ou por ele mesmo).
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_03_NumerosPrimos {
    public static void main( String args[] ){
        Scanner scanner = new Scanner(System.in);
        int numero;

        while(true){
            try{
                System.out.println("Digite um número inteiro maior que 1:");
                numero = Integer.parseInt(scanner.nextLine());
                printNumerosPrimosAbaixo(numero);
                break;
            } catch(Exception e){
                System.out.println("Número inválido.");
                continue;
            }
        }

    }

    public static void printNumerosPrimosAbaixo(int numero) throws Exception{
        ArrayList<Integer> lista = numerosPrimosAbaixo(numero);
        System.out.println("Números primos abaixo de " + numero + ": " + lista);
    }

    public static ArrayList<Integer> numerosPrimosAbaixo(int numero) throws Exception {
        if (numero < 2) {
            throw new Exception();
        }

        ArrayList<Integer> numerosPrimosAbaixo = new ArrayList<>();

        if(numero == 2){
            numerosPrimosAbaixo.add(2);
        }

        for(int i = 2; i < numero; i++){

            if(ePrimo(i)){
                numerosPrimosAbaixo.add(i);
            }
        }

        return numerosPrimosAbaixo;

    }

    public static boolean ePrimo(int numero){
        if(numero == 2){
            return true;
        }

        boolean ePrimo = true;

        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                ePrimo = false;
                break;
            }
        }

        return ePrimo;

    }
}

