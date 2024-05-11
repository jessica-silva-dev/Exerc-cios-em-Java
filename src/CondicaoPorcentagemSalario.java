import java.util.Scanner;
public class CondicaoPorcentagemSalario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do seu salario? ");
        double salario = scanner.nextDouble();
        if (salario >= 4500) {
            double resultado = salario * 0.30;
            System.out.println("Seu salario é R$" +salario+ " e a porcentagem de 30% é: " +resultado+ "%");
        }else {
            double resultado = salario * 0.15;
            System.out.println("Seu salario é R$" +salario+ " e a porcentagem de 15% é: " +resultado+ "%");
        }
    }
}
