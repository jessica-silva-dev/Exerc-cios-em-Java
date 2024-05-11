import java.util.Scanner;
public class CalculadoraDiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a 1° idade: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite a 2° idade: ");
        int idade2 = scanner.nextInt();

        int diferencaIdade = idade1 - idade2;
        System.out.println("A diferença entre a idade de "+idade1+" anos e a idade de "+idade2+" anos é de = "+diferencaIdade+" anos");
    }
}