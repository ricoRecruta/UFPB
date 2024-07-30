package br.ufpb.dcx.GfelixG.biblioteca;

import java.util.List;

public class LivroFiccao extends Livro{

    private String tipoFiccao;

    public LivroFiccao(String cod, String nome, String autor, String tipo){
        super(cod, nome, autor, TipoItem.FICCAO);
        this.tipoFiccao = tipo;
    }
    public LivroFiccao(){this("---", "", "","");}

    public String getTipoFiccao() {
        return tipoFiccao;
    }

    public void setTipo(String tipo) {
        this.tipoFiccao = tipo;
    }
}
