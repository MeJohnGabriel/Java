import java.util.Scanner;

public class ex0005 {
public static void main(String[] args) {
    System.out.println("Digite o(s) segundo(s): ");
    Scanner scan  = new Scanner(System.in);
    double segundos = (double) scan.nextDouble();

// Convertendo p/ minutos
    double secToMin = segundos / 60;
    System.out.println(segundos + "(s) é igual a: " + secToMin + "minutos");
// Convertendo p/ horas
    double secToHours = segundos / 3600;
    System.out.println(segundos + "(s) é igual a: " + secToHours + "horas");
    scan.close();
}
}
