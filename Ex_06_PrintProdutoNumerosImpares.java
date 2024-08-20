package Lista_1;

/*
Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.
 */

import java.util.ArrayList;

public class Ex_06_PrintProdutoNumerosImpares {
    public static void main(String[] args) {
        int numInicial = 15;
        int numFinal = 30;

        ArrayList<Integer> numerosImpares = numerosImpares(numInicial, numFinal);

        int produtoInt = produtoNumerosInteger(numerosImpares);
        float produtoFloat = produtoNumerosFloat(numerosImpares);

        System.out.println("Numeros impares de " + numInicial + " a " + numFinal + ":");
        System.out.println(numerosImpares + "\n");

        System.out.println("Produto dos numeros impares, tipo int:");
        System.out.println(produtoInt);

        /*
        O restultado matemático é 45.808.142.625, porém como o tipo int armazena até 2.147.483.647
        quando chega no final, retorna do intervalo inicial negativo, -2.147.483.648
         */

        System.out.println("\nProduto dos numeros impares, tipo float:");
        System.out.println(produtoFloat);

    }

    public static int produtoNumerosInteger(ArrayList<Integer> numeros){
        int produtoInt = 1;

        for (Integer i : numeros) {
            produtoInt *= i;
        }

        return produtoInt;
    }

    public static float produtoNumerosFloat(ArrayList<Integer> numeros){
        float produtoFloat = 1.0f;

        for (Integer i : numeros) {
            produtoFloat *= i;
        }

        return produtoFloat;
    }

    public static ArrayList<Integer> numerosImpares(int numInicial, int numFinal) {
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (int i = numInicial; i <= numFinal; i++) {
            if (i % 2 != 0) {
                numerosImpares.add(i);
            }
        }

        return numerosImpares;
    }
}

