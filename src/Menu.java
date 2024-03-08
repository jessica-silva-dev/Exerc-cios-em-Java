import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoDesejada = 0;
        while (opcaoDesejada != 3){
            System.out.println("Selecione uma das opções abaixo: \nCalcular Imposto = (1)\nDepositar Saçário = (2)\nSair = (3)\n");
            opcaoDesejada = input.nextInt();
        }
    }
}
