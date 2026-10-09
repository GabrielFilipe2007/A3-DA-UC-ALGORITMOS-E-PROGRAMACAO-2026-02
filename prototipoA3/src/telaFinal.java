import javax.swing.*;
import java.awt.*;

public class telaFinal extends JFrame {
    public telaFinal(int acertos, int totalPerguntas) {
        setTitle("SECURECHECK");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JLabel lblogo = new JLabel("SECURECHECK");
        lblogo.setForeground(Color.PINK);
        add(lblogo);
        lblogo.setBounds(150, 10, 100, 30);
        JLabel lbtitulo =new JLabel("Quiz concluido", SwingConstants.CENTER);
        lbtitulo.setForeground(Color.pink);
        add(lbtitulo);
        lbtitulo.setBounds(50, 50, 300, 40);
        JLabel lbresultado =new JLabel("<html><center>Parabéns por finalizar o quiz!<br><br> " +
                "Seu resultado foi:<br><br>" +
                "<font size='6' color='green'>" + acertos + "</font> de " + totalPerguntas + " acertos.</center></html>", SwingConstants.CENTER);
        add(lbresultado);
        lbresultado.setBounds(20, 150, 300, 250);

        JLabel lbFeedback =new JLabel("", SwingConstants.CENTER);
        lbFeedback.setBounds(50, 320, 300, 40);
        if (acertos >= 2) {
            lbFeedback.setText("Excelente! Você entende muito de segurança.");
            lbFeedback.setForeground(Color.GREEN);
        } else {
            lbFeedback.setText("Bom esforço! Continue estudando cibersegurança.");
            lbFeedback.setForeground(Color.ORANGE);
        }
        add(lbFeedback);

        JButton btnSair = new JButton("SAIR");
        btnSair.setForeground(Color.RED);
        add(btnSair);
        btnSair.setBounds(130, 450, 140, 40);

        btnSair.addActionListener(e -> System.exit(0));
    }

    public telaFinal() {

    }
}
