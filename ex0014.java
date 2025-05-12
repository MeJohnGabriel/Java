import java.util.Scanner;

public class ex0014 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number , menor = 0;

    System.out.println("Informe um numero: ");
    menor = sc.nextInt();

    do{
        System.out.println("Informe um numero ou zero p sair");
        number = sc.nextInt();

        if (number < menor &&  number != 0 ) {
            menor = number;
        }
    }while(number != 0);
    System.out.println("Resposta: " + menor);
}
}
