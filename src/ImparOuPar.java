import java.util.Scanner;

// Faça um algoritmo que mostre se o número desejado é impar u par

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número desejado: ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("O número " +number+ " é par!");
        }else {
            System.out.println("O número " +number+ " é impar!");
        }
    }
}
