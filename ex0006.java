import java.util.Scanner;
public class ex0006 {
public static void main(String[] args) {
    System.out.println("Digite uma letra: ");
    char[] letras = {  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    Scanner scan  = new Scanner(System.in);
    String letra = scan.nextLine();

    System.out.println("Digite a posição: ");
    int num = scan.nextInt();
    System.out.println();
    for(int i = 0; i < letra.length(); i++){
        System.out.println(letra + " -> na posiçao " + num + ", será: " + letras[num]);
    }
    scan.close();
}
}
