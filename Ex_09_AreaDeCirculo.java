package Lista_1;

/*
Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2, onde o raio (r)
deve ser informado pelo usuário e o resultado terá que ser arredondado.
 */

public class Ex_09_AreaDeCirculo {
    double raio;
    double area;
    long areaArredondado;

    //construtor para raio tipo int
    Ex_09_AreaDeCirculo(int r){
        raio = r * 1.0;
        area = CalculoArea();
        areaArredondado = Math.round(area);
        printArea();
    }

    //construtor para raio tipo flutuante
    Ex_09_AreaDeCirculo(double r){
        raio = r;
        area = CalculoArea();
        areaArredondado = Math.round(area);
        printArea();
    }

    public double CalculoArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double getArea(){
        return area;
    }

    public long getAreaArredondado(){
        return areaArredondado;
    }

    public void printArea(){
        System.out.println("A = PI * " + raio + "\nA = " + area + "\nArredondando: " + areaArredondado);
    }
}
