import java.util.Scanner;

public class ex009 {
public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);

    int sumC= 0;
    int subC= 0;
    int mutC  = 0;
    int operation =0;
    int opCounter = 0;
    do {
        System.out.println("Isert a value: ");
        int valor1 = userinput.nextInt();    

        System.out.println("Isert another value: ");
        int valor2 = userinput.nextInt();

        System.out.println("Select op. || 1.sum | 2.sub| 3.mut | 4.EXIT ||");
        operation = userinput.nextInt();
        if (operation != 4) {
            if (operation == 1) {
                int sum =  valor1 + valor2;
                subC += valor1 + valor2;
                opCounter++;
                System.out.println("Operation " + opCounter + " was a sum " + " result: " + sum);
                
            } else if(operation == 2){
                int sub = valor1 - valor2;
                subC += valor1 - valor2;
                opCounter++;
                System.out.println("Operation " + opCounter + " was a sub " + " result: " + sub);

                } else if(operation ==3){
                int mut = valor1 * valor2;
                mutC += valor1 * valor2;
                opCounter++;
                System.out.println("Operation " + opCounter + " was a mut " + " result: " + mut);

                } 

        } else if(operation == 4){
            System.out.println("[FINISHED EXECUTION]");
        }
    } while(operation != 4);
    System.out.println("TOTAL SUMS. IS: " + sumC);
    System.out.println("TOTAL SUBS. IS: " + subC);
    System.out.println("TOTAL MUTS. IS: " + mutC);
}
}
