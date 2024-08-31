package GfelixG.AgendaPOO;

import POO.AgendaPOO.AgendaAyla;
import POO.AgendaPOO.Contato;
import POO.AgendaPOO.ContatoInexistenteException;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

public class AgendaAylaTest {

    @Test
    public void TestSalRec() throws IOException {
        AgendaAyla agenda = new AgendaAyla();

        //teste de recuperação de dados
        agenda.recuperarDados();
        HashMap<String, Contato> pesquisa1 = agenda.getContatos();
        assertEquals(pesquisa1.size(), 4);

    }
    @Test
    public void TestCadRem() throws ContatoInexistenteException, IOException {
        AgendaAyla sistema = new AgendaAyla();

        //teste de cadastro
        boolean cadastro = sistema.cadastraContato("Gabriel", 23, 3);
        assertTrue(cadastro);

        //teste de pesquisa
        sistema.cadastraContato("Davi", 23, 3);
        sistema.cadastraContato("Rita", 23, 3);
        sistema.cadastraContato("Jessé", 8, 4);
        sistema.cadastraContato("Lidiane", 3, 7);
        Collection<Contato> pesquisa2 = sistema.pesquisaAniversariantes(23, 3);

        assertEquals(pesquisa2.size(), 3);

        //teste de remoção
        try{
            boolean remocao = sistema.removeContato("Lidiane");
            Collection<Contato> pesquisa3 = sistema.pesquisaAniversariantes(23,3);
            assertTrue(remocao);
        } catch (ContatoInexistenteException e) {
            fail("Contato não existe");
        }

        //teste de persistência dos dados
        sistema.salvarDados();
    }
}
