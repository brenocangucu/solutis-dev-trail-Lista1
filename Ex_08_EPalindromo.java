package Lista_1;

/*
Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da direita
pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.

 */

public class Ex_08_EPalindromo {
    String palavra;

    public Ex_08_EPalindromo(String palavra){
        this.palavra = palavra;
        printPalavra();

    }

    public void printPalavra(){
        if(EPalindromo()){
            System.out.println(palavra + " é palindromo.");
        } else {
            System.out.println(palavra + " não é palindromo.");
        }

    }

    public boolean EPalindromo(){
        StringBuilder palavraReversa = new StringBuilder();

        int palavraLength = this.palavra.length();

        for (int i = (palavraLength - 1); i >=0; --i) {
            palavraReversa.append(palavra.charAt(i));
        }

        return palavra.equalsIgnoreCase(palavraReversa.toString());

    }

}


