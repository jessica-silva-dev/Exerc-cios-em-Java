import java.util.Scanner;

public class SomandoComDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir;
        int soma = 0;
        do {
            System.out.println("Digite um valor: ");
            int valor = scanner.nextInt();
            scanner.nextLine();
            soma += valor;
            System.out.println("Deseja continuar? S/N ");
            repetir = scanner.nextLine();
        } while (repetir.equalsIgnoreCase("S"));
        System.out.println("A soma dos valores é: " + soma);
    }
}
