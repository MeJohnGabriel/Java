import java.util.Scanner;

public class ex011 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double notas[] = new double[5];
double notasSum = 0;
int qtdAprovados = 0, qtdReprovados = 0;

for(int i = 0; i < notas.length; i++){
    System.out.println("Digite a " + (i+1) + " nota: ");
    notas[i] = input.nextDouble();
    notasSum += notas[i];
    
    if (notas[i] < 7) {
        qtdReprovados++;
    } else if (notas[i] >= 7) {
        qtdAprovados++;
    }
}

System.out.println("------------------------");

for(int i = 0; i < notas.length; i++){
    System.out.println(i+1 + "º" + " Nota: " + notas[i]);
}

System.out.println("-----------------------");
System.out.println("Total das notas: " + notasSum);
System.out.println("Media das notas: " + notasSum / notas.length);
System.out.println("------------------------");
System.out.println("Alunos aprovados: " + qtdAprovados);
System.out.println("Alunos reprovados: " + qtdReprovados);
System.out.println("------------------------");

}
}
