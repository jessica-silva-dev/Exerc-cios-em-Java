import java.util.Scanner;

public class CalcularImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso atual: (Kg) ");
        float peso = scanner.nextFloat();
        System.out.println("Digite o tamanho da sua altura: (m)");
        float altura = scanner.nextFloat();
        float imc = peso / (altura * altura);
        if (imc >= 18.25 && imc <= 25) {
            System.out.println("Parabens, está no peso ideal!");
        } else if (imc < 17) {
            System.out.println("Muito abaixo do peso!");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("VocÊ está com sobrepeso!");
        } else if (imc > 30 && imc <= 35) {
            System.out.println("VocÊ está com obesidade!");
        } else if (imc > 35 && imc <= 40) {
            System.out.println("VocÊ está com obesidade severa!");
        } else  {
            System.out.println("VocÊ está com obesidade mórbida!");
        }
        System.out.println("Seu imc é de: " + imc);
    }
}
