package POO.amigoSecreto;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo   {

    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public SistemaAmigo() {
        this.mensagens = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void cadastraAmigo(String nomeAmigo, String emailAmigo){
        Amigo a = new Amigo(nomeAmigo, emailAmigo);
        this.amigos.add(a);
    }

    public Amigo pesquisaAmigo(String emailAmigo){
        for(Amigo a: this.amigos){
            if (a.getEmail().equals(emailAmigo)){
                return a;
            }
        }
        return null;
    }

    public Mensagem enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima){
        MensagemParaTodos m = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        this.mensagens.add(m);
        return m;
    }

    public Mensagem enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        MensagemParaAlguem m = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        this.mensagens.add(m);
        return m;
    }

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> anonimas = new ArrayList<>();
        for (Mensagem m : this.mensagens){
            if(m.ehAnonima()){
                anonimas.add(m);
            }
        }
        return anonimas;
    }

    public List<Mensagem> pesquisaTodasAsMensagens(){
        return this.mensagens;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailSorteado){
        pesquisaAmigo(emailDaPessoa).setEmailAmigoSorteado(emailSorteado);
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa){
        Amigo a = pesquisaAmigo(emailDaPessoa);
        return a.getEmailAmigoSorteado();
    }
}
