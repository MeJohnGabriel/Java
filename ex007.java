import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
    int res =  verify(1, 0, '/');
    System.out.println(res);
    }
    public static int verify(int x , int y , char operator){
        switch (operator) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '/':
                if (y == 0) {
                    System.out.println("0 = INVALID") ;
                    return 0;
                } else if (y != 0) {
                    return x / y;                
                }
            case '*':
                return x * y;
            
            default:
                System.out.println("INVALID NUMBER");
            return 0;
            } 
    }
}
