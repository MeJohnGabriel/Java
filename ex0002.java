import java.util.Scanner;
public class ex0002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coordenada x1 do ponto 1: ");
            double x1 = scanner.nextDouble();
        System.out.print("Coordenada y1 do ponto 1: ");
            double y1 = scanner.nextDouble();
    
        System.out.print("Coordenada x2 do ponto 2: ");
            double x2 = scanner.nextDouble();
        System.out.print("Coordenada y2 do ponto 2: ");
            double y2 = scanner.nextDouble();
            double distancia = calcularDistancia(x1, y1, x2, y2);
    
        System.out.println("A distancia entre os pontos e: " + distancia);
        
        scanner.close();
    }
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
