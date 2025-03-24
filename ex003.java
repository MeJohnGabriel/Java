import java.util.Scanner;
public class ex003 {
public static void main(String[] args) {
   System.out.println("Digite o primeiro numero: ");
    Scanner scanner = new Scanner(System.in);
    int inputNumber1 = (int) scanner.nextInt();
    System.out.println("Digite o segundo numero: ");
    int inputNumber2 = (int) scanner.nextInt();

    int divisao = inputNumber1 / inputNumber2;

    // RESULTADO
    System.out.println("O resultado é : " + divisao);
    scanner.close();
}
}
