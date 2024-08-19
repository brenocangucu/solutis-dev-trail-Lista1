package Lista_1;

/*
Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2, onde o raio (r)
deve ser informado pelo usuário e o resultado terá que ser arredondado.
 */

public class Ex_09_AreaDeCirculo {
    int raio;
    double area;
    long areaArredondado;

    Ex_09_AreaDeCirculo(int r){
        raio = r;
        area = CalculoArea();
        areaArredondado = Math.round(area);
        printArea();
    }

    public double CalculoArea(){
        return Math.PI * raio;
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
