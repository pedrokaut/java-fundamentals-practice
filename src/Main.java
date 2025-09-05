import java.util.Scanner;

public class Main {
    /*
     *
     * Para cada questão, crie uma classe, como a que está exposta a seguir.
     * Padrão: questao1(), questao()2 ... questao10(), por exemplo.
     *
     * */
    public static void questao1() {
        Scanner input = new Scanner(System.in);
        float etqmedio, qmin, qmax;
        System.out.println("Digite a quantidade minima");
        qmin = input.nextFloat();

        System.out.println("Digite a quantidade maxima");
        qmax = input.nextFloat();
        etqmedio = (qmax - qmin) / 2;
        System.out.println("o estoque medio e" + etqmedio);
    }
    public static void questao2() {
        Scanner input = new Scanner(System.in);
        float cotacao,valordola,valorreal,resultado;
        System.out.println("Qual a cotação do dolar?");
        cotacao = input.nextFloat();
        System.out.println("Qual a valor do dolar?");
        valordola = input.nextFloat();
        System.out.println("Qual a valor de reais que deseja");
        valorreal = input.nextFloat();
        resultado = (valordola * valorreal);
        System.out.println("o resultado da conversão e"+resultado);
    }

    public static void main(String[] args) {
        questao2();
    }
}