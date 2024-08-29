package br.ufpb.dcx.GfelixG.POO.biblioteca;

public class LivroRomance extends Livro{
    private String tipoRomance;

    public LivroRomance(String cod, String nome, String autor, String tipo){
        super(cod, nome, autor, TipoItem.ROMANCE);
        this.tipoRomance = tipo;
    }

    public LivroRomance(){this("---", "", "", "");}

    public String getTipoRomance() {
        return tipoRomance;
    }

    public void setTipo(String tipo) {
        this.tipoRomance = tipo;
    }
}
