package br.ufpb.dcx.GfelixG.sistemaComercial;

public class ClienteNaoExisteException extends Exception{

    public ClienteNaoExisteException(String msg){
        super(msg);
    }
}
