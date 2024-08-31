package POO.amigoSecreto;

public class MensagemParaTodos extends Mensagem{

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }

    public MensagemParaTodos(String texto, String emailRemetente) {
        super(texto, emailRemetente);
    }

    @Override
    public String getTextoCompletoAExibir(){
        if (super.ehAnonima()){
            return String.format(
                    """
                            Mensagem para: TODOS
                            Texto: %s"""
                    , super.getTexto());
        }
        return String.format(
                """
                        Mensagem de: %s
                        Mensagem para: TODOS
                        Texto: %s"""
                , super.getEmailRemetente(), super.getTexto());
    }
}
