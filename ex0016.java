import java.util.Scanner;

public class ex0016 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String senha = "java123";
    String senhaInserida;

    do {
        System.out.println("Digite a senha: ");
        senhaInserida = sc.next();
      
          if(senhaInserida.equals(senha)){
            System.out.println("Acesso negado! ");
        }
    
    } while(senhaInserida != senha );

    System.out.println("Acesso permitido");
    sc.close();
}
}
