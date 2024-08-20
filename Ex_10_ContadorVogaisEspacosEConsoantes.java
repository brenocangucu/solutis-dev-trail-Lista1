package Lista_1;

import java.util.ArrayList;

/*
Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.
 */

public class Ex_10_ContadorVogaisEspacosEConsoantes {
    char[] cadeiaCaracteres;
    ArrayList<Character> listaDeCaracteres;
    ArrayList<Character> vogais;
    ArrayList<Character> consoantes;
    ArrayList<Character> espacos;

    //construtor para char[]
    public Ex_10_ContadorVogaisEspacosEConsoantes(char[] cadeiaCaracteres){
        this.cadeiaCaracteres = cadeiaCaracteres;
        listaDeCaracteres = arrayParaListaChar(cadeiaCaracteres);
        vogaisEspacosEConsoantes();
        System.out.println(this);

    }

    //construtor para lista de caracteres
    public Ex_10_ContadorVogaisEspacosEConsoantes(ArrayList<Character> listaDeCaracteres){
        this.listaDeCaracteres = listaDeCaracteres;
        this.cadeiaCaracteres = listaParaArrayChar(listaDeCaracteres);
        vogaisEspacosEConsoantes();
        System.out.println(this);
    }

    //construtor para String
    public Ex_10_ContadorVogaisEspacosEConsoantes(String string){
        cadeiaCaracteres = string.toCharArray();
        listaDeCaracteres = arrayParaListaChar(cadeiaCaracteres);
        vogaisEspacosEConsoantes();
        System.out.println(this);
    }

    public void vogaisEspacosEConsoantes(){
        ArrayList<Character> vogais = new ArrayList<>();
        ArrayList<Character> espacos = new ArrayList<>();
        ArrayList<Character> consoantes = new ArrayList<>();

        for(int i = 0; i < cadeiaCaracteres.length; i++){
            char caracter = cadeiaCaracteres[i];

            if(caracter == ' '){
                espacos.add(caracter);
            }

            if (eVogal(caracter)) {
                vogais.add(caracter);
            }

            if(eConsoante(caracter)){
                consoantes.add(caracter);
            }
        }

        this.vogais = vogais;
        this.consoantes = consoantes;
        this.espacos = espacos;

    }

    public boolean eVogal(char caracter){
        char[] vogais = {'a', 'e', 'i', 'o' , 'u', 'A', 'E', 'I', 'O' ,'U'};

        for(int i = 0; i < vogais.length; i++){
            if(caracter == vogais[i]){
                return true;
            }
        }

        return false;
    }

    public boolean eConsoante(char caracter) {
        //se não o caracter não estiver entre 'B' e 'z', retornar falso
        if(!(caracter >= 'B' && caracter <= 'z')){
            return false;
        }

        char caractereMinusculo = caracter;

        //se o caracter for maiusculo, converto para minusculo
        if (caracter <= 'Z') {
            caractereMinusculo += 32;
        }

        //se for vogal, retornar falso
        if (eVogal(caractereMinusculo)) {
            return false;
        }

        return true;
    }

    //conversao ArrayList<Character> para char[]
    public char[] listaParaArrayChar(ArrayList<Character> listaChar){
        char[] arrayChar = new char[listaChar.size()];

        for(int i = 0; i < arrayChar.length; i++){
            arrayChar[i] = listaChar.get(i);
        }

        return arrayChar;
    }

    //conversao char[] para ArrayList<Character>
    public ArrayList<Character> arrayParaListaChar(char[] charArray){
        ArrayList<Character> listaChar = new ArrayList<>();

        for(int i = 0; i < charArray.length; i++){
            listaChar.add(charArray[i]);
        }

        return listaChar;
    }

    @Override
    public String toString(){
        String str = "Cadeia de caracteres: " + listaDeCaracteres + "\n" +
                "\nQuantidade de vogais: " + vogais.size() + "\n" + vogais +
                "\nQuantidade de consoantes: " + consoantes.size() + "\n" + consoantes +
                "\nQuantidade de espaços: " + espacos.size() + "\n" + espacos;

        return str;
    }

}
