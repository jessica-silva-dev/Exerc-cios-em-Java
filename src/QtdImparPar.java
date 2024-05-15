import java.util.Scanner;

public class QtdImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja repetir quantas vezes? ");
        int repetir = scanner.nextInt();
        int totalAteDez = 0;
        int soma = 0;
        int somaImpar =0;
        int somaPar =0;
        for (int i = 0; i < repetir; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            int valor = scanner.nextInt();
            if (valor >=0 && valor <= 10){
                totalAteDez += 1;
                soma += valor;
                if (valor % 2 == 1){
                    somaImpar += valor;
                }else {
                    if (valor % 2 == 0){
                        somaPar += valor;
                    }
                }
            }
        }
        System.out.println("Ao todo forem " +totalAteDez+ " valores entre 0 e 10");
        System.out.println("Somando os valores de 0 a 10 = " +soma);
        System.out.println("Somando números Impares = " +somaImpar);
        System.out.println("Somando números Pares = " +somaPar);
    }
}
