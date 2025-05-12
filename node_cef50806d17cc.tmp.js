import java.util.Scanner;

public class ex009 {
public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    
    int val1 = userinput.nextInt();
    int val2 = userinput.nextInt();
    do {
        System.out.println("Digite 2 valores[1.+ , 2.- , 3.* , 4.sair]: ");
        if (userinput != 4) {
            if (userinput == 1) {
                
            } else if(userinput == 2){
                //subtrair
            } else if(userinput == 2){
                // multiplicar
            } else if(userinput == 4){
                // sai do loop
            }
        }
    } while (userinput !=4);
}
}
