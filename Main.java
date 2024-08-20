package Lista_1;

//Teste das Questoes de 1 a 12;

public class Main {
    public static void main(String[] args){
        String[] arg = new String[0];

        System.out.println("Ex_01_Teste:");
        new Ex_01_Teste().main(arg);
        System.out.println();

        System.out.println("Ex_02_MaiorDeDoisValores");
        new Ex_02_MaiorDeDoisValores().main(arg);
        System.out.println();

        System.out.println("Ex_03_NumerosPrimos");
        new Ex_03_NumerosPrimos().main(arg);
        System.out.println();

        System.out.println("Ex_04_QuilometroParaMilha");
        new Ex_04_QuilometroParaMilha().main(arg);
        System.out.println();

        System.out.println("Ex_05_DiasDaSemana");
        new Ex_05_DiasDaSemana().main(arg);
        System.out.println();

        System.out.println("Ex_06_PrintProdutoNumeroImpares");
        new Ex_06_PrintProdutoNumerosImpares().main(arg);
        System.out.println();

        System.out.println("Ex_07_MetadeDosMultiplosDeTres");
        new Ex_07_MetadeDosMultiplosDeTres().main(arg);
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
