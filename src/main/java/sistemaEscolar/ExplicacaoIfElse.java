package sistemaEscolar;
/*
resultado seja superior a 7, é exibido a mensagem:
"PARABÉNS: VOCÊ ESTÁ NA PRÓXIMA ETAPA!"

caso contrario, exibe:
"POXA, NÃO FOI DESTA VEZ. ATÉ A PRÓXIMA!"
 */


import java.util.Random;

public class ExplicacaoIfElse {
    public static void main(String[] args) {
        int resultado = resultadoTeste();
        if (resultado > 7) {
            imprimeMensagem("PARABÉNS: VOCÊ ESTÁ NA PRÓXIMA ETAPA!");
        } else {
            imprimeMensagem("POXA, NÃO FOI DESTA VEZ. ATÉ A PRÓXIMA!");
        }
    }

//    Nota aleatória entre 0 e 10
    static int resultadoTeste() {
        return new Random().ints(0, 11).findFirst().getAsInt();
    }

//    Imprime uma mensagem no terminal
    static void imprimeMensagem(String mensagem) {
        System.out.println(mensagem);
    }


}
