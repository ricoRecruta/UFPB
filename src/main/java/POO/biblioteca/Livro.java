package POO.biblioteca;

import java.util.Objects;

public class Livro implements Comparable<Livro>{

    private String codigo;
    private String nome;
    private String autor;
    private double preco;
    private TipoItem tipo;

    public Livro (String cod, String nome, String autor, TipoItem tipo){
        this.codigo = cod;
        this.nome = nome;
        this.autor = autor;
        this.tipo = tipo;
    }

    public Livro(){
        this("---", "", "", TipoItem.INDEFINIDO);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||  getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(codigo, livro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public int compareTo(Livro o) {
        if (this.preco > o.getPreco()){
            return -1;
        } else if (this.preco < o.getPreco()){
            return 1;
        }
        return 0;
    }
}
