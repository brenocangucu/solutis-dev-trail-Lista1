package Lista_1;

//Teste das Questoes de 1 a 12;

public class Main {
    public static void main(String[] args){
        System.out.println("Ex_01_Teste:");
        String[] arg = new String[0];
        new Ex_01_Teste().main(arg);
        System.out.println();

        System.out.println("Ex_02_MaiorDeDoisValores");
        new Ex_02_MaiorDeDoisValores().main(arg);
        System.out.println();

        System.out.println("Ex_08_EPalindromo:");
        new Ex_08_EPalindromo("Osso");
        System.out.println();

        System.out.println("Ex_09_AreaDeCirculo");
        new Ex_09_AreaDeCirculo(3.0);
        new Ex_09_AreaDeCirculo(2);
        System.out.println();


        System.out.println("Ex_10_ContadorVogaisEspacosEConsoantes");
        String str = "AEIOUBjbl osies";

        new Ex_10_ContadorVogaisEspacosEConsoantes(str);
        System.out.println();

        System.out.println("Ex_11_PrintEmOrdemAlfabetica");
        new Ex_11_PrintEmOrdemAlfabetica().main(arg);
        System.out.println();

        System.out.println("Ex_12_Motoristas");
        new Ex_12_Motoristas().main(arg);
        System.out.println();
    }
}
