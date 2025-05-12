import java.util.Scanner;

public class ex010 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] notas = new int[5];

    for(int i = 0; i < notas.length; i++){
        System.out.println("INSIRA A NOTA: ");
        notas[i] += input.nextInt();
        System.out.println("Na posicao " + i + ": " + notas[i]);
    }

    System.out.println("NOTAS INSERIDAS: ");
    for(int i = 0; i < notas.length; i++){
        System.out.println("Nota: " + (i+1) + ": " + notas[i]);
    }
    
    input.close();
}
}
