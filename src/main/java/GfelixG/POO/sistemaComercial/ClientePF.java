package GfelixG.POO.sistemaComercial;

public class ClientePF extends Cliente{

    private String CPF;

    public ClientePF(String cpf, String nome, String endereco, String email){
        super(nome, endereco, email);
        this.CPF = cpf;
    }
    @Override
    public String getId() {return this.CPF;}
}
