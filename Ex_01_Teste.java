package Lista_1;

/*
Qual a saída do seguinte programa:
    class teste {
        public static void main( String args[] ){
            int i = 5;
            int j = i;
            j = 10;
            System.out.println( "i + j = " + j + i );
        }
    }

 */

public class Ex_01_Teste {
        public static void main( String args[] ){
            int i = 5;
            int j = i;
            j = 10;
            System.out.println( "i + j = " + j + i );
        }

        //output --> i + j = 105, pois j e i estão sendo impressas como String e não há
        //           SPACE separando as duas;
}
