import java.util.Scanner;

public class MediaAritimeticaComVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas você vai inserir: ");
        int tamanho = scanner.nextInt();
        double[] notas = new double[tamanho];
        double soma = 0;
        for (int i = 0; i < tamanho; i ++){
            System.out.println("Digite a " +(i + 1) + "° nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / tamanho;
        System.out.println("A média é = " + media);
    }
}
