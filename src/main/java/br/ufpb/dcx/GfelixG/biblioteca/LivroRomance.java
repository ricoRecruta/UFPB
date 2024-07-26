package br.ufpb.dcx.GfelixG.biblioteca;

public class LivroRomance extends Livro{

    private static final String GENERO = "Romance";
    private String tipo;

    public LivroRomance(String cod, String nome, String autor, String tipo){
        super(cod, nome, autor);
        this.tipo = tipo;
    }

    public LivroRomance(){this("---", "", "", "");}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getGENERO() {
        return GENERO;
    }
}
