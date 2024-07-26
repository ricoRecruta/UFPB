package br.ufpb.dcx.GfelixG.amigoSecreto;

public class Test {
    public static void main(String[]args){

        Mensagem m = new Mensagem("Boa noiteee", "G.felix2303@gmail.com", true);
        MensagemParaAlguem m1 = new MensagemParaAlguem("Bom diaaaa", "gabrielfxgomes@gmail.com", "G.felix2303@gmail.com",false);

        System.out.println(m.getTextoCompletoAExibir());
        System.out.println(m1.getTextoCompletoAExibir());
    }
}
