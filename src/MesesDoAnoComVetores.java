public class MesesDoAnoComVetores {
    public static void main(String[] args) {
        String[] meses = new String[12];
        String[] nomeDosMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < meses.length; i++){
            meses[i] = nomeDosMeses[i];
        }
        for (String mes : meses){
            System.out.println(mes);
        }
    }
}
