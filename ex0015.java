import java.util.Scanner;

public class ex0015 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int sum = 0;
    
    do {
    System.out.println("Digite um numero [0]-finalizar: ");
    num = sc.nextInt();
    sum += num;
} while (num != 0);
    System.out.println("A soma total dos numeros: " + sum);
}
}
