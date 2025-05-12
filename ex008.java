import java.util.Scanner;

public class ex008 {
public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    int num = 0;
    int cont = 0;
    int sum = 0;

        do {
            System.out.println("Isert a value:");
            num = userinput.nextInt();

            if (num != 0) {
                sum += num;
                cont ++;
            }
           
        } while (num != 0);
        
        System.out.println("The total is: " + sum);
        System.out.println(cont + 1  + " numbers were typed");

        userinput.close();
    }

}
