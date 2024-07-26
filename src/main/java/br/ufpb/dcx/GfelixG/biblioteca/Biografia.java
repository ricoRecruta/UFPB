package br.ufpb.dcx.GfelixG.biblioteca;

public class Biografia extends Livro{

    private static final String GENERO = "Biografia";
    private String sobre;

    public Biografia(String cod, String nome, String autor, String sobre){
        super(cod, nome, autor);
        this.sobre = sobre;
    }

    public Biografia(){this("---", "", "", "");}

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public static String getGENERO() {
        return GENERO;
    }
}
