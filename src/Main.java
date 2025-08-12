public class Main {
    public static void main(String[] args) throws java.io.IOException {
        String[] nomes = new String[10];
        int[] idades = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = lerLinha();

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = Integer.parseInt(lerLinha());
        }

        System.out.println("\nLista de Dados");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + nomes[i] + " tem " + idades[i] + " anos.");
        }
    }


    public static String lerLinha() throws java.io.IOException {
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = System.in.read()) != -1 && c != '\n' && c != '\r') {
            sb.append((char) c);
        }
        return sb.toString();
    }
}
