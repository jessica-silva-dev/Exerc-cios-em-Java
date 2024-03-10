import java.util.Scanner;

public class CadastroAlistamentoExercito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o seu gênero (M ou F)");
        String genero = input.nextLine();
        System.out.println("Informe a sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        switch (genero) {
            case "M":
                if (idade >= 18) {
                    System.out.println("Alistamento Obrigatório!");
                } else {
                    System.out.println("Alistamento não permitido!");
                }
                break;
            case "F":
                if (idade < 18) {
                    System.out.println("Alistamento não permitido!");
                } else {
                    System.out.println("Deseja se alistar para o exército? ");
                    String alistar = input.nextLine();
                    if (alistar.equalsIgnoreCase("s") || alistar.equalsIgnoreCase("sim")) {
                        System.out.println("Informe o seu nome?");
                        String nome = input.nextLine();
                        System.out.println("Bem-vinda " + nome + "! Alistamento realizado com sucesso!");
                    } else {
                        System.out.println("Muito bem, você não está obrigada ao alistamento obrigatório.");
                    }
                }
                break;
            default:
                System.out.println("Gênero inválido.");
        }
    }
}
