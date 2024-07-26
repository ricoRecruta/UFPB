package br.ufpb.dcx.GfelixG.biblioteca;

import java.util.List;

public interface SistemaBibliotecaInteface {

    /**
     * Cadastra um livro em uma lista que vai ser usada no sistema
     * @param livro livro a ser adicinado na lista
     * @return true quando der certo o cadastro e false para o contrario
     */
    public boolean cadastraLivro(Livro livro) throws JaExisteEsseCodException;

    /**
     * Pesquisa os livros de acordo com o gênero passado
     * @param genero genero a ser usado para separar os livros
     * @return uma lista de acordo com o gênero dos livros
     */
    public List<Livro> pesquisaLivroPeloGenero(String genero);

    /**
     * Busca livro no banco de dados com o código passado
     * @param cod código usado para pesquisa
     * @return o único livro com o código passado
     */
    public Livro pesquisaLivroPeloCod(String cod);

    /**
     * Pesquisa os livros de acordo com o nome passado
     * @param nome nome do livro usado na pesquisa
     * @return uma lista de acordo o nome do livros
     */
    public List<Livro> pesquisaLivroPeloNome(String nome);

    /**
     * Pesquisa os livros de acordo com o autor passado
     * @param autor nome do escritor usado na pesquisa
     * @return uma lista de acordo o nome do livros
     */
    public List<Livro> pesquisaLivroPeloAutor(String autor);

    /**
     * Recebe 2 livros para saber qual o mais barato
     * @param livro1 primeiro livro usado na comparação
     * @param livro2 segundo livro usado na comparação
     * @return inteiro representando -1 = 1° livro / 0 = mesmo preço / 1 = 2° livro
     */
    public int qualMaisBarato(Livro livro1, Livro livro2);
 }
