import java.util.Scanner;
public class ex017 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int qtdHomens = 0 , qtdMulheres = 0;
    int maiorIdade = 0;
    String sexoInserido = "";
    int idadeInserida = 0;

    for(int i = 0; i <= 3; i++){
    System.out.println("Insira Masculino Feminino p/ sexo: ");
    sexoInserido = sc.next();

    System.out.println("Insira a idade: ");
    idadeInserida = sc.nextInt();

    if (sexoInserido == "Masculino") {
        qtdHomens++;
    }else if (sexoInserido == "Feminino") {
        qtdMulheres++;
    }

    if (idadeInserida > maiorIdade) {
        maiorIdade = idadeInserida;
    }
    }
    if (qtdHomens > qtdMulheres) {
        System.out.println("Sexo masculino foi mais registrado");
    } else if (qtdHomens < qtdMulheres) {
        System.out.println("Sexo feminino foi mais registrado");
    }
    System.out.println("A maior idade foi: " + maiorIdade);
    System.out.println("A maior idade foi: " + qtdHomens);
}
}
