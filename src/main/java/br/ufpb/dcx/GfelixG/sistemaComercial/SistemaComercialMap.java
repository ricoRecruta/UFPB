package br.ufpb.dcx.GfelixG.sistemaComercial;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaComercialMap implements SistemaComercial{

    private Map<String, Produto> produtos;
    private Map<String, Cliente> clientes;

    public SistemaComercialMap() {
        this.produtos = new HashMap<>();
        this.clientes = new HashMap<>();
    }

    @Override
    public boolean existeProduto(Produto produto) {
        return false;
        //TODO
    }

    @Override
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        return null;
        //TODO
    }

    @Override
    public boolean cadastraProduto(Produto produto) {
        return false;
        //TODO
    }

    @Override
    public boolean existeCliente(Cliente cliente) {
        return false;
        //TODO
    }

    @Override
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException {
        return null;
        //TODO
    }

    @Override
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        return List.of();
        //TODO
    }
}
