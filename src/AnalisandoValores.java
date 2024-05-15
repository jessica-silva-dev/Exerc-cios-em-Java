import java.util.Scanner;

public class AnalisandoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int somaPares = 0;
        int dividePor5 = 0;
        int nulos = 0;
        int valor = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i+1) + "° valor");
            valor = scanner.nextInt();
            soma += valor;
            if (valor % 5 == 0) {
                dividePor5++;
            }
            if (valor % 2 == 0){
                somaPares += valor;
            }
            if (valor == 0){
                nulos++;
            }
        }
        float media = soma / 5;
        System.out.println("Soma total = " +soma);
        System.out.println("Média = " +media);
        System.out.println("Soma total doa números pares = " +somaPares);
        System.out.println("Total de números diviseis por 5 = " +dividePor5);
        System.out.println("Total de números nulos = " +nulos);
    }
}
