package br.ufpb.dcx.GfelixG.sistemaComercial;

public class ProdutoNaoExisteException extends Exception{

    public ProdutoNaoExisteException(String msg){
        super(msg);
    }
}
