import java.util.Scanner;

public class CalcularJurosDeEmprestismo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do emprestismo: ");
        double emprestimo = scanner.nextDouble();
        System.out.println("Qual o valor da porcentagem do juros: ");
        int juros = scanner.nextInt();
        double totalComJuros = ((emprestimo * juros) / 100) + emprestimo;
        System.out.println("Em quantas parcelas deseja pagar? ");
        int parcela = scanner.nextInt();
        double totalPagamento = totalComJuros / parcela;
        System.out.println("Peguei emprestado: R$" + emprestimo);
        System.out.println("Com o juros de " +juros+ "% o total a pagar é = R$" + totalComJuros);
        System.out.println("Em parcelas de " + parcela + "x de R$" + totalPagamento);
    }
}
