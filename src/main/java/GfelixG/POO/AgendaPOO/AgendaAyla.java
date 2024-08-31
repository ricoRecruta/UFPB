package GfelixG.POO.AgendaPOO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class AgendaAyla implements Agenda {

    private HashMap<String,Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla(){
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    public HashMap<String, Contato> getContatos() {
        return contatos;
    }

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        if(!contatos.containsKey(nome)){
            Contato c1 = new Contato(nome, dia, mes);
            contatos.put(nome, c1);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeContato(String nome) throws ContatoInexistenteException {
        if(contatos.containsKey(nome)){
            contatos.remove(nome);
            return true;
        } else {
            throw new ContatoInexistenteException();
        }
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        Collection<Contato> aniversariantes = new ArrayList<>();
        for (Contato c : contatos.values()){
            if(c.getDiaAniversario() == dia && c.getMesAniversario() == mes){
                aniversariantes.add(c);
            }
        }
        return aniversariantes;
    }

    public void salvarDados() throws IOException{
        try {
            gravador.SalvarContatos(contatos);
        } catch (IOException e) {
            System.err.println("Não foi possivel salvar");
            e.printStackTrace();
        }


    }
    public void recuperarDados() throws IOException{
        try{
            this.contatos = gravador.RecuperarContatos();
        } catch (IOException e) {
            System.err.println("Não foi possível recuperar");
            e.printStackTrace();
        }

    }
}