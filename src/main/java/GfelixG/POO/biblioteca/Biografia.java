package GfelixG.POO.biblioteca;

public class Biografia extends Livro{
    private String sobre;

    public Biografia(String cod, String nome, String autor, String sobre){
        super(cod, nome, autor, TipoItem.BIOGRAFIA);
        this.sobre = sobre;
    }

    public Biografia(){this("---", "", "", "");}

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
}
