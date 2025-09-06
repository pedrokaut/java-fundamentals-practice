import java.util.Arrays;
import java.util.Scanner;
/// INFORMAÇÕES PESSOAIS =================================================
/// NOME:PEDRO VICTOR SOARES GONÇALO
/// MATRICULA:2024010454
/// REPOSITORIO: https://github.com/pedrokaut/java1
/// INFORMAÇÕES PESSOAIS =================================================

public class Main {
    /// NIVEL 1 ==================================================
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
    /// NIVEL 2 ==================================================
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
    public static void questao12() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro por gentiliza: ");
        int numero = input.nextInt();

        int modulo;
        if (numero >= 0) {
            modulo = numero;
        } else {
            modulo = numero * -1;
        }

        System.out.println("O módulo de " + numero + " é: " + modulo);

        input.close();
    }
    public static void questao13() {
        //utilizei veotores pois ficaria um codigo gingatesco apenas com condicionais
        //sabia utilizar devido a semelhança com a linguagem C
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = input.nextInt();
        }

        input.close();


        Arrays.sort(numeros);
        System.out.println("\nNúmeros em Ordem Crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();


        System.out.println("Números em Ordem Decrescente:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
    public static void questao14() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = input.nextInt();

        int diferenca;


        if (numero1 > numero2) {
            diferenca = numero1 - numero2;
        } else {
            diferenca = numero2 - numero1;
        }

        System.out.println("A diferença do maior para o menor é: " + diferenca);

        input.close();
    }
    public static void questao15() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = input.nextDouble();
        System.out.println("Digite a quarta nota:");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Média inicial: %.2f\n", media);

        if (media >= 7.0) {
            System.out.printf("APROVADO! Média final: %.2f\n", media);
        } else {

            System.out.println("Aluno em recuperação. Digite a nota da recuperação:");
            double notaRecuperacao = input.nextDouble();

            double novaMedia = (media + notaRecuperacao) / 2;
            System.out.printf("Nova média após recuperação: %.2f\n", novaMedia);

            if (novaMedia >= 7.0) {
                System.out.println("APROVADO na recuperação! Parabéns!");
            } else {
                System.out.println("REPROVADO. O aluno não atingiu a média necessária.");
            }
        }

        input.close();
    }
    public static void questao16() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = input.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = input.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
            System.out.println("O menor número é: " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
            System.out.println("O menor número é: " + numero1);
        } else {
            System.out.println("Os dois números são iguais: " + numero1);
        }

        input.close();
    }
    public static void questao17() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = input.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("valor válido");
        } else {
            System.out.println("valor inválido");
        }

        input.close();
    }
    public static void questao18() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um código entre 1,2 e 3:");
        int codigo = input.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            default:
                System.out.println("Código inválido");
                break;
        }

        input.close();
    }
    public static void questao19() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do lado A:");
        double a = input.nextDouble();
        System.out.println("Digite o valor do lado B:");
        double b = input.nextDouble();
        System.out.println("Digite o valor do lado C:");
        double c = input.nextDouble();
        if ((a < b + c) && (b < a + c) && (c < a + b)) {

            if (a == b && b == c) {
                System.out.println(" forma um triângulo EQUILÁTERO.");
            } else if (a == b || a == c || b == c) {
                System.out.println("forma um triângulo ISÓSCELES.");
            } else {
                System.out.println("forma um triângulo ESCALENO.");
            }
        } else {

            System.out.println("Os valores fornecidos não são de um  triângulo.");
        }

        input.close();
    }
    public static void questao20() {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite um valor para 'a' maior que zero:");
        a = input.nextInt();
        System.out.println("Digite um valor para 'b' maior que zero:");
        b = input.nextInt();
        System.out.println("Digite um valor para 'c' maior que zero:");
        c = input.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            int menor;
            int maior;

            if (a <= b && a <= c) {
                menor = a;
            } else if (b <= a && b <= c) {
                menor = b;
            } else {
                menor = c;
            }
            if (a >= b && a >= c) {
                maior = a;
            } else if (b >= a && b >= c) {
                maior = b;
            } else {
                maior = c;
            }

            int multiplicacao = menor * maior;
            double divisao = (double) maior / menor;
            System.out.println("\n--- Resultados ---");
            System.out.println("O menor valor lido é: " + menor);
            System.out.println("O maior valor lido é: " + maior);
            System.out.println("O menor valor multiplicado pelo maior é: " + multiplicacao);
            System.out.printf("O maior valor dividido pelo menor é: %.2f\n", divisao);
        } else {
            System.out.println("\nvalores digitados não são válidos, tem que ser menores ou iguais a zero.");
        }

        input.close();

    }
    public static void questao21() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = input.nextInt();
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        input.close();
    }
    public static void questao22() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Digite um número inteiro:");
        int numero = input.nextInt();
        if (numero >= 0) {
            a = numero;
        } else {
            b = numero;
        }
        System.out.println("Variável A: " + a + ", Variável B: " + b);

        input.close();

    }
    /// INFORMAÇÕES PESSOAIS =================================================
    /// NOME:PEDRO VICTOR SOARES GONÇALO
    /// MATRICULA:2024010454
    /// REPOSITORIO: https://github.com/pedrokaut/java1
    /// INFORMAÇÕES PESSOAIS =================================================
    public static void main(String[] args) {

        questao22();
    }
}
