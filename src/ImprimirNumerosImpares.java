import java.util.Scanner;

public class ImprimirNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número desejado: ");
        int fim = input.nextInt();
        int inicio = 0;
        while (inicio <= fim){
            if (inicio % 2 != 0){
                System.out.println("Números impares = " + inicio);
            }
            inicio += 1;
        }
    }
}
