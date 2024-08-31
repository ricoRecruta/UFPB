package POO.amigoSecreto;

import java.util.Scanner;

public class TestaGUI {

    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        SistemaAmigo sistema = new SistemaAmigo();

        //Numero de amigos que vão participar da brincadeira
        System.out.println("Digite a quantidade de amigos: ");
        int quantAmigos = Integer.parseInt(leitor.nextLine());

        for(int k = 0; k<quantAmigos; k++) {
            System.out.printf("Digite o nome do %d° amigo: \n", k+1);
            String nomeAmigo = leitor.nextLine();
            System.out.printf("Digite o email do %d° amigo: \n", k+1);
            String emailAmigo = leitor.nextLine();
            sistema.cadastraAmigo(nomeAmigo, emailAmigo);
        }

        for(Amigo a : sistema.getAmigos()) {
            System.out.printf("Qual foi o amigo secreto do %s: \n", a.getNome());
            sistema.configuraAmigoSecretoDe(a.getEmail(), leitor.nextLine());
        }

        System.out.println("Digite um mensagem: ");
        String texto = leitor.nextLine();

        System.out.println("Digite seu email: ");
        String email = leitor.nextLine();

        System.out.println("Deseja enviar de forma anônima: [S/N]");
        String resposta = leitor.nextLine().toUpperCase();
        boolean anonima = resposta.equals("S");

        Mensagem FIM = sistema.enviarMensagemParaTodos(texto, email, anonima);
        System.out.println(FIM.getTextoCompletoAExibir());
    }
}
