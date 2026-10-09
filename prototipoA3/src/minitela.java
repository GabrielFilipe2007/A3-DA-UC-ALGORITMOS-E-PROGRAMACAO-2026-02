import javax.swing.*;
import java.awt.*;

public class minitela extends JFrame {

    public minitela() {

        setTitle("SECURECHECK");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null);

        JLabel lblogo = new JLabel("SECURECHECK");
        lblogo.setForeground(Color.PINK);
        JLabel lbInicio = new JLabel("Bem vindo ao quiz");
        JButton botao = new JButton("Começar");
        botao.setBackground(Color.GREEN);

        lblogo.setBounds(150, 10, 100, 30);
        lbInicio.setBounds(150, 150, 180, 150);
        botao.setBounds(150, 300, 120, 40);

        botao.addActionListener(e -> {
            segundaTela novaTela = new segundaTela();
            novaTela.setVisible(true);

                });

        add(lblogo);
        add(lbInicio);
        add(botao);

        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new minitela().setVisible(true);
        });
    }
}
