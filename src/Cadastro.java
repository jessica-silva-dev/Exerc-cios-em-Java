import                                                                          java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String usuario = "Jessica";
        final int senha = 1234;
        boolean exibirTelaLogin = true;
        while (exibirTelaLogin){
            System.out.println("Acesso somente com nome do usuário e senha!");
            System.out.println("Login do Usuário");
            String usuarioDigitado = input.nextLine();
            System.out.println("Senha do Usuário");
            int senhaDigitada = input.nextInt();
            input.nextLine();
            if (usuarioDigitado.equals(usuario) && senhaDigitada == senha){
                System.out.println("Acesso Liberado!");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("Acesso Negado!");
        }
        System.out.println("Programa finalizado!");
        input.close();
    }
}
