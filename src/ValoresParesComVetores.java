import java.util.Scanner;

public class ValoresParesComVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        int totalPar = 0;
        int totalmpar = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite o " + (i+1) + "° valor: ");
            valores[i] = scanner.nextInt();
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0){
                totalPar += 1;
                System.out.println(valores[i] + " = PAR!");
                System.out.println("Está na posição " + i);
            }else {
                totalmpar += 1;
                System.out.println(valores[i] + " = IMPAR!");
                System.out.println("Está na posição " + i);
            }
        }
        System.out.println("O total de números pares é : "+ totalPar);
        System.out.println("O total de números impares é : "+ totalmpar);
    }
}
