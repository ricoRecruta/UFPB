package br.ufpb.dcx.GfelixG.biblioteca;

import java.util.List;

public class LivroFiccao extends Livro{

    private static final String GENERO = "Ficção";
    private String tipo;

    public LivroFiccao(String cod, String nome, String autor, String tipo){
        super(cod, nome, autor);
        this.tipo = tipo;
    }
    public LivroFiccao(){this("---", "", "","");}

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
