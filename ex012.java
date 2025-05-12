import java.util.Scanner;

public class ex012 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int matriz [][] = new int[2][2];

    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){
            System.out.println("Digite um valor p/ matriz[" + i+"] [" + j + "]: ");
            matriz[i][j] = sc.nextInt();
            
            System.out.println("Voce colocou o valor " + matriz[i][j] + " na posicao: [" + i + "] [" + j+ "] da matriz : ");
        }
    }

    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz[i].length; j++){
            System.out.print(matriz[i][j] + "\t");
        }
        System.out.println();
    }
}
}
