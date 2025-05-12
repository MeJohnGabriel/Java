import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matriz [][] = new int[3][3];
    int soma = 0;
    
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){
            System.out.println("Digite um valor p/ a posic" + i + " e " + j + ": ");
            matriz[i][j] = sc.nextInt();
            soma += matriz[i][j];
        }
    }

    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j] + "\t");
        }
    System.out.println();
    }
    System.out.println("A soma dos elementos da matriz é: " + soma);
sc.close();

    }
}
