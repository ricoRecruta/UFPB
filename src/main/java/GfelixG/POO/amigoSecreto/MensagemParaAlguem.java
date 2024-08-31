package GfelixG.POO.amigoSecreto;

public class MensagemParaAlguem extends Mensagem{

    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonima) {
        super(texto, emailRemetente, anonima);
        this.emailDestinatario = emailDestinatario;
    }

    @Override
    public String getTextoCompletoAExibir(){
        if (super.ehAnonima()){
            return String.format(
                    """
                            Mensagem para: %s
                            Texto: %s"""
                    , this.emailDestinatario, super.getTexto());
        }
        return String.format(
                """
                        Mensagem de: %s
                        Mensagem para: %s
                        Texto: %s"""
                , super.getEmailRemetente(), this.emailDestinatario, super.getTexto());
    }

    public String getEmailDestinatario() {
        return this.emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
}
