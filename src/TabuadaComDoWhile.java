import java.util.Scanner;

public class TabuadaComDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir = "";
        do {
            System.out.println("Qual tabuada deseja? ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            int comparar = 0;
            do {
                int resultado = numero * (comparar + 1);
                System.out.println(numero + " x " + (comparar + 1) + " = " + resultado);
                comparar += 1;
            } while (comparar < 10);
            System.out.println("Desejs continuar? S/N ");
            repetir = scanner.next();
        } while (repetir.equalsIgnoreCase("S"));
    }
}
