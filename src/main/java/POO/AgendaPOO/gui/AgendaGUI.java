package POO.AgendaPOO.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUI extends JFrame {

    JLabel linha1, linha2;
    ImageIcon PalhanoImg = new ImageIcon("./imgs/Palhano.jpg");
    public AgendaGUI(){
        setTitle("Agenda aniversários");
        setSize(600, 600 );
        setLocation(150,150);
        setResizable(false);
        getContentPane().setBackground(Color.lightGray);
        linha1 = new JLabel("Melhor Professor!", JLabel.CENTER);
        linha1.setForeground(Color.BLACK);
        linha1.setFont(new Font("Serif", Font.BOLD, 20));

        linha2 = new JLabel(PalhanoImg, JLabel.CENTER);

        getContentPane().setLayout(new GridLayout(3, 1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);

    }

    public static void main (String[]args){
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }


}
