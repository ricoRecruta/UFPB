package br.ufpb.dcx.GfelixG.POO.sistemaComercial;

public class ProdutoNaoExisteException extends Exception{

    public ProdutoNaoExisteException(String msg){
        super(msg);
    }
}
