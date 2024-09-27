package sistemaEscolar;

public class ExplicacaoFor {
    public static void main(String[] args) {
        String[] nomes = new String[] {"MARCOS", "ALINE", "LUCAS", "PATRICIA"};

        /*
        for (int i = 0; i < nomes.length; i++) {
            imprimeMensagem(nomes[i]);
        }
         */

        for (String nome: nomes) {
            imprimeMensagem(nome);
        }


    }

    static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }


}
