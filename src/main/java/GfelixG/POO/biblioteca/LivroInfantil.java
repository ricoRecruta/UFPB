package GfelixG.POO.biblioteca;

public class LivroInfantil extends Livro{
    private int faixaEtaria;

    public LivroInfantil(String cod, String nome, String autor, int faixaEtaria){
        super(cod, nome, autor, TipoItem.INFANTIL);
        this.faixaEtaria = faixaEtaria;
    }

    public LivroInfantil() {this("---", "", "", 0);}

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

}
