package Lista_1;

/*
Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .
 */

import java.util.ArrayList;

public class Ex_07_MetadeDosMultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer> numerosInt;
        ArrayList<Double> numerosDouble;

        int numInicial = 1;
        int numFinal = 100;

        numerosInt = multiplosDeTresDividiosPorDoisInt(numInicial, numFinal);
        numerosDouble = multiplosDeTresDividiosPorDoisDouble(numInicial, numFinal);

        System.out.println("Multiplos de tres entre " + numInicial + " e " + numFinal + ":");
        System.out.println(multiplosDeTres(numInicial, numFinal) + "\n");

        System.out.println("Divisão por 2 entre " + numInicial + " e " + numFinal + ", tipo int:");
        System.out.println(numerosInt);

        System.out.println("\nDivisão por 2 entre " + numInicial + " e " + numFinal + ", tipo double:");
        System.out.println(numerosDouble);
    }

    public static ArrayList<Double> multiplosDeTresDividiosPorDoisDouble(int numInicial, int numFinal) {
        return numerosDividosPorDoisDouble(multiplosDeTres(numInicial, numFinal));

    }

    public static ArrayList<Integer> multiplosDeTresDividiosPorDoisInt(int numInicial, int numFinal) {
        return numerosDividosPorDoisInt(multiplosDeTres(numInicial, numFinal));

    }

    public static ArrayList<Integer> numerosDividosPorDoisInt(ArrayList<Integer> listaNumeros) {
        ArrayList<Integer> listaIntNumerosDividosPorDois = new ArrayList<>();

        listaNumeros.stream().mapToInt(i -> i / 2).forEach(listaIntNumerosDividosPorDois::add);

        return listaIntNumerosDividosPorDois;
    }

    public static ArrayList<Double> numerosDividosPorDoisDouble(ArrayList<Integer> listaNumeros) {
        ArrayList<Double> listaDoubleNumerosDividosPorDois = new ArrayList<>();

        listaNumeros.stream().mapToDouble(i -> i * 1.0 / 2).forEach(listaDoubleNumerosDividosPorDois::add);

        return listaDoubleNumerosDividosPorDois;
    }


    public static ArrayList<Integer> multiplosDeTres(int numInicial, int numFinal) {
        ArrayList<Integer> multiplosDeTres = new ArrayList<>();

        for (int i = numInicial; i <= numFinal; i++) {
            if (i % 3 == 0) {
                multiplosDeTres.add(i);
            }
        }

        return multiplosDeTres;
    }
}
