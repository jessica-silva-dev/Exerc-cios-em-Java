import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual tabuada você deseja: ");
        int numeroDesejado = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numeroDesejado+ " x " +i+ " = " +(numeroDesejado * i));
        }
    }
}
