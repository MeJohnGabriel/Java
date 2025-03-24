import java.util.Scanner;
public class ex0001 {
    public static void main(String[] args) {        
    System.out.println("Digite um número:");
    Scanner scan = new Scanner(System.in);
    
    int inputNumber = (int) scan.nextDouble();
    double restoDaDivisão = inputNumber % 3;
    System.out.println("O resto da divisão é: " + restoDaDivisão);
    scan.close();
}
}
