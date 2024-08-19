package Lista_1;

/*
Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética
(utilize o método compareTo da classe String),. Informe também, qual das palavras
tem o maior número de caracteres.
 */

import java.util.Scanner;

public class Ex_11_PrintEmOrdemAlfabetica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        int ordemAlfabetica = palavra1.compareToIgnoreCase(palavra2);
        String maiorPalavra = maiorPalavra(palavra1, palavra2);


        if (ordemAlfabetica < 0) {
            System.out.println("Ordem alfabetica:\n 1: " + palavra1 + "\n 2: " + palavra2);
            printMaiorPalavra(maiorPalavra);

        } else if (ordemAlfabetica > 0) {
            System.out.println("Ordem alfabetica:\n 1: " + palavra2 + "\n 2: " + palavra1);
            printMaiorPalavra(maiorPalavra);
        } else {
            System.out.println("Ordem alfabetica:\n 1: " + palavra1 + "\n 2: " + palavra2);
            printMaiorPalavra(maiorPalavra);
        }
    }

        public static String maiorPalavra(String palavra1, String palavra2) {
            if (palavra1.length() > palavra2.length()) {
                return palavra1 + "," + palavra2;
            }

            if (palavra1.length() > palavra2.length()) {
                return palavra2 + "," + palavra1;
            }

            return "iguais";
        }

        public static void printMaiorPalavra(String maiorPalavra){
            if(maiorPalavra.equals("iguais")){
                System.out.println("Ambas palavras tem o mesmo numero de caracteres");
            } else{
                String[] palavras = maiorPalavra.split(",");
                System.out.println("'" + palavras[0] + "'" + " tem mais caracteres que " + "'" + palavras[1] + "'");
            }
        }
}
