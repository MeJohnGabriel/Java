import java.util.Scanner;

public class MatrizGuiada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3]; // 2 linhas, 3 colunas

        // Preenchendo a matriz
        System.out.println("Preenchendo a matriz 2x3...");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um valor para matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                // Mostra o valor que acabou de ser inserido
                System.out.println("Valor inserido na posição [" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

        System.out.println("\n---------------------------");
        System.out.println("Conteúdo final da matriz:");
        // Exibindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t = tabulação (alinha melhor)
            }
            System.out.println(); // pula linha ao final de cada linha da matriz
        }

        sc.close();
    }
}

