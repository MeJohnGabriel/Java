import java.util.Scanner;
public class ex0004 {
public static void main(String[] args) {
    System.out.println("Digite o cateto 'a': ");
    Scanner scan = new Scanner(System.in);
    int catetoA = (int) scan.nextDouble();
    // colocando em potencia
    int catetoAPot = catetoA * catetoA;

    System.out.println("Digite o cateto 'b': ");
    int catetoB = (int) scan.nextDouble();
    int catetoBPot = catetoB * catetoB;

    int hipotenusaRes = catetoAPot + catetoBPot;
    double hipotenusaRaiz  = Math.sqrt(hipotenusaRes);
    System.out.println("A hipotenusa será de :" + hipotenusaRaiz);
    scan.close();
}

}
