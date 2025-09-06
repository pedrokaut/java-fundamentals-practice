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
    public static void questao8() {
        Scanner input = new Scanner(System.in);

        double volume, raio, altura;
        final double PI = 3.14159;

        System.out.print("Digite o raio da lata de óleo: ");
        raio = input.nextDouble();

        System.out.print("Digite a altura da lata de óleo: ");
        altura = input.nextDouble();

        volume = PI * raio * raio * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

        input.close();
    }
    public static void questao9() {
        Scanner input = new Scanner(System.in);

        int anos, meses, dias, idademdias;

        System.out.print("Digite sua idade em anos: ");
        anos = input.nextInt();

        System.out.print("Digite os meses: ");
        meses = input.nextInt();

        System.out.print("Digite os dias: ");
        dias = input.nextInt();

        idademdias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade em dias é: " + idademdias);

        input.close();
    }
    public static void questao10() {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();

        System.out.println("\nrelacionamentos em ordem");

        if (n1 == n2) {
            System.out.println(n1 + " é igual a " + n2);
        } else {
            System.out.println(n1 + " é diferente de " + n2);
        }
        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else if (n1 < n2) {
            System.out.println(n1 + " é menor que " + n2);
        }
        if (n1 >= n2) {
            System.out.println(n1 + " é maior ou igual a " + n2);
        } else {
            System.out.println(n1 + " é menor ou igual a " + n2);
        }

        input.close();
    }
    /// NIVEL 2
    public static void questao11() {
        Scanner input = new Scanner(System.in);
        int a,b,temp;
        System.out.println("Digite o valor de A: ");
        a = input.nextInt();
        System.out.println("Digite o valor de B: ");
        b = input.nextInt();
        System.out.println("valores antes da troca: "+ a +" e "+ b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("valores depois da troca: "+ a+" e "+ b);
    }
    public static void main(String[] args) {

        questao11();
    }
}
