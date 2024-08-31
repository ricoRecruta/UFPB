package GfelixG.POO.amigoSecreto;

import java.util.HashMap;
import java.util.Map;

public class SistemaAmigoMap {
    private Map<Integer, Amigo> Amigos;
    private Map<Integer, Mensagem> Mensagens;
    private int COD = 0;

    public SistemaAmigoMap(){
        this.Amigos = new HashMap<>();
        this.Mensagens = new HashMap<>();
    }

    public Map<Integer, Amigo> getAmigos() {
        return Amigos;
    }

    public void setAmigos(Map<Integer, Amigo> amigos) {
        Amigos = amigos;
    }

    public Map<Integer, Mensagem> getMensagens() {
        return Mensagens;
    }

    public void setMensagens(Map<Integer, Mensagem> mensagens) {
        Mensagens = mensagens;
    }

    public void cadastraAmigoMap(Amigo a){
        this.Amigos.put(this.COD, a);
        COD++;
    }
}
