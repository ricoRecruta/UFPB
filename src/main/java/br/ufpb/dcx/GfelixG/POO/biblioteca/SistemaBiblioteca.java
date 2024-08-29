package br.ufpb.dcx.GfelixG.POO.biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaBiblioteca implements SistemaBibliotecaInteface{

    private Map<String, Livro> Livros;
    public static final String PREFIXO_CODIGO= "C0D";

    public SistemaBiblioteca(){
        this.Livros = new HashMap<>();
    }

    @Override
    public boolean cadastraLivro(Livro livro) throws JaExisteEsseCodException {
        if (this.Livros.containsKey(livro.getCodigo())){
            throw new JaExisteEsseCodException("Já existe um livro cadastrado com o código" + livro.getCodigo());
        } else {
            this.Livros.put(livro.getCodigo(), livro);
            return true;
        }
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
