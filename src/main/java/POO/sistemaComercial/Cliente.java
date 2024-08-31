package POO.sistemaComercial;

public abstract class Cliente {
    private String nome;
    private String endereco;
    private String email;

    public abstract String getId();
    
    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public Cliente(){this("", "","");}

    @Override
    public String toString(){
        return String.format("""
                Cliente: %s
                Endereço: %s
                Email: %s
                """, this.nome, this.endereco, this.email);
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
}