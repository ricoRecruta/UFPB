package br.ufpb.dcx.GfelixG.biblioteca;

import java.util.List;
import java.util.Map;

public class SistemaBiblioteca implements SistemaBibliotecaInteface{

    private Map<String, Livro> Livros;

    @Override
    public boolean cadastraLivro(Livro livro) {
        //TODO
        return false;
    }

    @Override
    public List<Livro> pesquisaLivroPeloGenero(String genero) {
        //TODO
        return List.of();
    }

    @Override
    public Livro pesquisaLivroPeloCod(String cod) {
        //TODO
        return null;
    }

    @Override
    public List<Livro> pesquisaLivroPeloNome(String nome) {
        //TODO
        return List.of();
    }

    @Override
    public List<Livro> pesquisaLivroPeloAutor(String autor) {
        //TODO
        return List.of();
    }

    @Override
    public int qualMaisBarato(Livro livro1, Livro livro2) {
        //TODO
        return 0;
    }
}
