import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Quantos anos você tem? ");
        byte idade = scanner.nextByte();
        if (idade <= 10){
            System.out.println(nome+ " particpará da categoria Infantil de natação!");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome+ " particpará da categoria Juvemil de natação!");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome+ " particpará da categoria Pré-adulto de natação!");
        }else {
            System.out.println(nome+ " particpará da categoria Adulto de natação!");
        }
    }
}
