package br.ufpb.dcx.GfelixG.AgendaPOO;

import br.ufpb.dcx.GfelixG.POO.AgendaPOO.Contato;
import br.ufpb.dcx.GfelixG.POO.AgendaPOO.GravadorDeDados;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class GravadorDeDadosTest {

    @Test
    public void testGravacao() throws IOException {
        File arquivoContatos = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        if(arquivoContatos.exists()){
            arquivoContatos.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        assertFalse(arquivoContatos.exists());
        HashMap<String, Contato> contatosMap = new HashMap<>();
        gravadorDeDados.SalvarContatos(contatosMap);
        assertTrue(arquivoContatos.exists());
        arquivo.delete();
    }

    @Test
    public void testaRecuperacao() throws IOException {
        File arquivoContatos = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        if(arquivoContatos.exists()){
            arquivoContatos.delete();
        }
        GravadorDeDados gravadorDeDados = new GravadorDeDados();
        File arquivo = new File(GravadorDeDados.ARQUIVO_CONTATOS);
        assertFalse(arquivo.exists());
        HashMap<String,Contato> contatosMap = new HashMap<>();
        contatosMap.put("Ayla", new Contato("Ayla",5,10));
        gravadorDeDados.SalvarContatos(contatosMap);
        assertTrue(arquivo.exists());
        HashMap<String,Contato> contatosRecuperados = gravadorDeDados.RecuperarContatos();
        Contato c1 = contatosRecuperados.get("Ayla");
        assertEquals(5,c1.getDiaAniversario());
        assertEquals(10,c1.getMesAniversario());
        assertEquals("Ayla",c1.getNome());
        arquivo.delete();
        }
}

