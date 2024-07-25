package br.ufpb.dcx.ayla.quiz;

import java.util.List;
import java.util.Vector;
import java.util.Collections;

public class Teste {

    public static void main(String [] args){
        System.out.println("Oi");
        Pergunta pergunta = new PerguntaDissertativa();
        System.out.println(pergunta.toString());
        System.out.println("TESTe token");
        Pergunta pergunta2 = new PerguntaDissertativa("Quem descobriu o Brasil?","Os indígenas");
        Pergunta pergunta3 = new PerguntaDissertativa("Quanto é 2+2?","2");
        List<Pergunta> perguntasList = new Vector();
        perguntasList.add(pergunta);
        perguntasList.add(pergunta2);
        perguntasList.add(pergunta3);
        Collections.sort(perguntasList);
        for (Pergunta p: perguntasList){
            System.out.println(p.getEnunciado());
        }



    }

}