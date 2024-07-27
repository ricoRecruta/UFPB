package br.ufpb.dcx.GfelixG.amigoSecreto;

public class Mensagem {

    private String texto;
    private String emailRemetente;
    private boolean anonima;

    public Mensagem(String texto, String emailRemetente, boolean anonima) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
    }

    public Mensagem(String texto, String emailRemetente) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = false;
    }

    public String getTextoCompletoAExibir(){
        if (this.anonima){
            return String.format("Texto: %s", this.texto);
        }
        return String.format(
                """
                        Mensagem de: %s
                        Texto: %s"""
                , this.emailRemetente, this.texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public boolean ehAnonima() {
        return this.anonima;
    }
}
