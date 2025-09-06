import java.util.Scanner;

public class Main {
    public static void questao1() {
        Scanner input = new Scanner(System.in);
        float etqmedio, qmin, qmax;
        System.out.println("Digite a qtd mínima: ");
        qmin = input.nextFloat();

        System.out.println("Digite a qtd máxima: ");
        qmax = input.nextFloat();

        etqmedio = (qmax + qmin) / 2; // fórmula corrigida
        System.out.println("O estoque médio é: " + etqmedio);
    }

    public static void questao2() {
        Scanner input = new Scanner(System.in);
        float cotacao, valorDolar, valorReal;

        System.out.println("Qual a cotação do dólar?");
        cotacao = input.nextFloat();

        System.out.println("Qual o valor em dólares que deseja converter?");
        valorDolar = input.nextFloat();

        valorReal = valorDolar * cotacao; // fórmula corrigida
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

    public static void main(String[] args) {
        questao3();
    }
}
