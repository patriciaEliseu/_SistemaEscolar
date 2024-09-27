package sistemaEscolar;

import java.util.Random;

public class ExplicacaoDoWhile {
    public static void main(String[] args) {
        int tentativa = 0;
        boolean encomendaRecebida = false;
        String log;

        /*
         while (!encomendaRecebida) {
            tentativa += 1;
            log = "Tentando entregar a correspondência, tentativa " + tentativa;
            imprimeLog(log);
            encomendaRecebida = tentaEntregar();
        }
         */
        do {
            tentativa += 1;
            log = "Tentando entregar a correspondência, tentativa " + tentativa;
            imprimeLog(log);
            encomendaRecebida = tentaEntregar();
        } while (!encomendaRecebida); {

            log = "Correspondência entregue na tentativa " + tentativa;
            imprimeLog(log);
        }

    }

    static boolean tentaEntregar() {
        boolean recebida = new Random().nextBoolean();
        if (recebida) return true;
        else return false;
    };

    static void imprimeLog(String log) {
        System.out.println(log);
    }

}
