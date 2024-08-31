package GfelixG.POO.amigoSecreto;

import java.util.*;

public class Test {
    public static void main(String[]args){

        SistemaAmigo sistema = new SistemaAmigo();

        sistema.cadastraAmigo("José", "Jose@gmail.com");
        sistema.cadastraAmigo("Maria", "Maria@gmail.com");

        sistema.configuraAmigoSecretoDe("Jose@gmail.com", "Maria@gmail.com");
        sistema.configuraAmigoSecretoDe("Maria@gmail.com","Jose@gmail.com");

        sistema.enviarMensagemParaAlguem("E AGORA JOSE, JOSE PARA ONDE","Maria@gmail.com", "Jose@gmail.com", true);
        sistema.enviarMensagemParaTodos("ATENÇÂO PARA O TOQUE DE 5 SEGUNDOS ANTES DO JOGO", "Maria@gmail.com", true);

        List<Mensagem> anonimas = sistema.pesquisaMensagensAnonimas();
        for (Mensagem m : anonimas){
            System.out.println(m.getTextoCompletoAExibir());
        }

        System.out.println(sistema.pesquisaAmigoSecretoDe("Jose@gmail.com"));
    }
}
