import java.util.Scanner;
/*
Faça um algoritmo que peça ao usuário seu ano de
nascimento e o ano atual. Calcule e imprima na tela sua idade.
 */

public class AdquirindoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite em que ano está? (4 digitos): ");
        int anoAtual = scanner.nextInt();
        System.out.println("Digite seu ano de nascimento (4 digitos): ");
        int anoNascimento = scanner.nextInt();
        int idade = anoAtual - anoNascimento;
        if (anoAtual > 2024){
            System.out.println("Sua idade vai ser: "+idade+ " anos");
        }else {
            System.out.println("Sua idade é: " +idade+ " anos");
        }
    }
}
