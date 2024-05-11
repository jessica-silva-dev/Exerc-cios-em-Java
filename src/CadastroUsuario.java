import java.util.Scanner;
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome? ");
        String nome = scanner.nextLine();
        if (nome == null || nome.equals(" ")) {
            System.out.println("Usuário Inválido!");
        } else if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("adminnistrador")){
            System.out.println("Usuário Inválido!");
        } else {
            System.out.println(nome+ " Usuário Cadastrado Com Sucesso!");
        }
    }
}
