package GfelixG.POO.sistemaComercial;

public class ClientePJ extends Cliente{

    private String CNPJ;

    public ClientePJ(String cnpj, String nome, String endereco, String email){
        super(nome, endereco, email);
        this.CNPJ = cnpj;
    }

    @Override
    public String getId() {return this.CNPJ;}

}
