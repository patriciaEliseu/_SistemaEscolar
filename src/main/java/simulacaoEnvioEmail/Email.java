package simulacaoEnvioEmail;

public class Email {
    public static void main(String[] args) {
        /*
        Informacoes do texto separadas por ponto e virgula:
        1. De quem é o e-mail
        2. Para quem o e-mail será endereçado
        3. Se haverá cópia oculta do e-mail para o diretor da empresa - Se for vogal
        4. Qual é o assunto do e-mail
        5. A mensagem
         */
    String info = "noreply@mycompany.com;onetaxi@company.com;a;De {de} para {para}; Bom dia, amigo!";
    Email email = new Email();
    email.enviar(info);

    }
    public void enviar(String email) {
        String[] campos = email.split(";");
        String de = campos[0];
        String para = campos[1];
        String copiaOcultaPara = campos[2];
        String assunto = campos[3];
        String mensagem = campos[4];

        if ("AEIOU".indexOf(copiaOcultaPara.toUpperCase()) >= 0) {
            copiaOcultaPara = "diretor@mycompany.com";
        } else {
            copiaOcultaPara = "";
        }

        assunto = assunto.replace("{de}", de);
        assunto = assunto.replace("{para}", para);

//        Impressão das informações no terminal que simula o envio do email
        System.out.println(
                "De: " + de + "\n"
                    + "Para: " + para + "\n"
                    + "CC: " + copiaOcultaPara + "\n"
                    + "Assunto: " + assunto + " \n"
                    + "Mensagem: " + mensagem
        );
    }
}
