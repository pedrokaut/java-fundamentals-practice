import java.util.Scanner;

public class Main {
    public static void questao1() {
        Scanner input = new Scanner(System.in);
        float etqmedio, qmin, qmax;
        System.out.println("Digite a qtd mínima: ");
        qmin = input.nextFloat();

        System.out.println("Digite a qtd máxima: ");
        qmax = input.nextFloat();

        etqmedio = (qmax + qmin) / 2;
        System.out.println("O estoque médio é: " + etqmedio);
    }

    public static void questao2() {
        Scanner input = new Scanner(System.in);
        float cotacao, valorDolar, valorReal;

        System.out.println("Qual a cotação do dólar?");
        cotacao = input.nextFloat();

        System.out.println("Qual o valor em dólares que deseja converter?");
        valorDolar = input.nextFloat();

        valorReal = valorDolar * cotacao;
        System.out.println("O valor em reais é: " + valorReal);
    }
    public static void questao3() {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite a identificação do vendedor: ");
        String vendedor = input.nextLine();

        System.out.print("Digite o código da peça: ");
        String codigo = input.nextLine();

        System.out.print("Digite o preço unitário da peça: ");
        double precoUnitario = input.nextDouble();

        System.out.print("Digite a qtd vendida: ");
        int qtd = input.nextInt();


        double totalVenda = precoUnitario * qtd;
        double comissao = totalVenda * 0.05;


        System.out.println("\n///// Resumo da Venda /////");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Código da peça: " + codigo);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Quantidade vendida: " + qtd);
        System.out.println("Total da venda: R$ " + totalVenda);
        System.out.println("Comissão do vendedor (5%): R$ " + comissao);

        input.close();

    }
    public static void questao4() {
        Scanner input = new Scanner(System.in);

        int A, B, C, D;


        System.out.print("Digite o valor de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        System.out.print("Digite o valor de C: ");
        C = input.nextInt();
        System.out.print("Digite o valor de D: ");
        D = input.nextInt();

        System.out.println("\n/// SOMAS ///");
        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));

        System.out.println("\n/// MULTIPLICAÇÕES ///");
        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));

        input.close();

    }
    public static void questao5() {
        Scanner input = new Scanner(System.in);
        float distancia,tempo,velocidade,litros;
        System.out.print("digite o tempo gasto");
        tempo = input.nextFloat();
        System.out.print("digite a velocidade media");
        velocidade = input.nextFloat();
        distancia = tempo * velocidade;
        litros = distancia / 12;
        System.out.println("A velocidade media:" +velocidade);
        System.out.println("O tempo gasto foi "+ tempo);
        System.out.println("A distancia percorrida foi "+distancia);
        System.out.println("A quantidade de litros foi "+litros);
        input.close();
    }
    public static void questao6() {

        Scanner input = new Scanner(System.in);
        float celsius, fahrenheit;

        System.out.print("digite a temperatura em graus Celsius: ");
        celsius = input.nextFloat();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit e: " + fahrenheit);

        input.close();
    }
    public static void questao7() {
        Scanner input = new Scanner(System.in);

        float fahrenheit, celsius;

        System.out.print("digite a temperatura em graus Fahrenheit: ");
        fahrenheit = input.nextFloat();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius e: " + celsius);

        input.close();
    }
    public static void main(String[] args) {

        questao6();
    }
}
