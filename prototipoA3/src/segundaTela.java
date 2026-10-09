import javax.swing.*;
import java.awt.*;

public class segundaTela extends JFrame{

    private int perguntaAtual =1;
    private int acerto=0;
    private final int totalPerguntas=3;
    private String respostaCorreta = "B";
    private JButton opcaoA, opcaoB, opcaoC, opcaoD, proxima;
    private JLabel lblogo, questao, perguntaUm, explicacaoUm;

    public segundaTela(){


        setTitle("SecureCheck");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null);

        lblogo = new JLabel("SECURECHECK");
        lblogo.setForeground(Color.PINK);
        add(lblogo);
        lblogo.setBounds(150, 10, 100, 30);
        questao =new JLabel("QUESÃO 1");
        add(questao);
        perguntaUm=new JLabel("<html>Qual é o principal objetivo do uso de um sandbox em segurança cibernética?</html>");
        add(perguntaUm);
        perguntaUm.setBounds(50, 50, 300, 75);
        opcaoA =new JButton("<html>A) Um armazenamento seguro para senhas e credenciais corporativas.</html>");
        add(opcaoA);
        opcaoA.setBounds(50, 130, 300, 50);
        opcaoB =new JButton("<html>B) Isolar e analisar programas ou arquivos suspeitos sem comprometer o sistema principal.</html>");
        add(opcaoB);
        opcaoB.setBounds(50, 190, 300, 50);
        opcaoC =new JButton("<html>C) Criar um ambiente de testes virtual exclusivo para ataques de hackers éticos (pentest).</html>");
        add(opcaoC);
        opcaoC.setBounds(50, 250, 300, 50);
        opcaoD =new JButton("<html>D) Oferecer proteção direta contra ataques de phishing em clientes de e-mail.</html>");
        add(opcaoD);
        opcaoD.setBounds(50, 310, 300, 50);

        opcaoA.setContentAreaFilled(false);opcaoA.setOpaque(true);
        opcaoB.setContentAreaFilled(false);opcaoB.setOpaque(true);
        opcaoC.setContentAreaFilled(false);opcaoC.setOpaque(true);
        opcaoD.setContentAreaFilled(false);opcaoD.setOpaque(true);

        opcaoA.addActionListener(e -> ValidarResposta("A", opcaoA));
        opcaoB.addActionListener(e -> ValidarResposta("B", opcaoB));
        opcaoC.addActionListener(e -> ValidarResposta("C", opcaoC));
        opcaoD.addActionListener(e -> ValidarResposta("D", opcaoD));

        explicacaoUm =new JLabel("<html> O sandbox cria um ambiente isolado e seguro para executar códigos ou arquivos desconhecidos e observar " +
                "seu comportamento sem colocar a rede ou o computador em risco.</html>");
        add(explicacaoUm);
        explicacaoUm.setBounds(10, 400, 300, 100);
        explicacaoUm.setVisible(false);

        proxima =new JButton("PROXIMA");
        proxima.setForeground(Color.BLUE);
        add(proxima);
        proxima.setBounds(250, 500, 120, 40);
        proxima.setVisible(false);

        proxima.addActionListener(e -> {
            perguntaAtual++;
            mudarPergunta();
        });
    }
    private void ValidarResposta(String opcaoEscolhida, JButton botaoClicado){
        opcaoA.setEnabled(false);
        opcaoB.setEnabled(false);
        opcaoC.setEnabled(false);
        opcaoD.setEnabled(false);

        if(opcaoEscolhida.equals(respostaCorreta)){
            botaoClicado.setBackground(Color.BLACK);
            botaoClicado.setBackground(Color.GREEN);
            acerto++;
        }else{
            botaoClicado.setBackground(Color.WHITE);
            botaoClicado.setBackground(Color.RED);
        }
        explicacaoUm.setVisible(true);
        proxima.setVisible(true);
    }
    private void mudarPergunta(){
        explicacaoUm.setVisible(false);
        proxima.setVisible(false);

        if (perguntaAtual > totalPerguntas) {
            new telaFinal(acerto, totalPerguntas).setVisible(true);
            this.dispose();
            return;
        }

        opcaoA.setEnabled(true); opcaoA.setBackground(null);opcaoA.setForeground(null);
        opcaoB.setEnabled(true); opcaoB.setBackground(null);opcaoB.setForeground(null);
        opcaoC.setEnabled(true); opcaoC.setBackground(null);opcaoC.setForeground(null);
        opcaoD.setEnabled(true); opcaoD.setBackground(null);opcaoD.setForeground(null);

        if (perguntaAtual ==2){
            questao.setText("QUESTÃO 2");
            perguntaUm.setText("<html>A Tríade CIA (Confidencialidade, Integridade e Disponibilidade) é a base da segurança da informação. Assinale a " +
                    "alternativa que descreve corretamente o princípio da Integridade:</html>");
            opcaoA.setText("<html>A) Garantir que a informação seja acessível apenas por pessoas autorizadas.</html>");
            opcaoB.setText("<html>B) Assegurar que os sistemas e dados estejam disponíveis para uso contínuo quando necessário.</html>");
            opcaoC.setText("<html>C) Proteger os dados contra modificações, adulterações ou exclusões não autorizadas.</html>");
            opcaoD.setText("<html>D) Criptografar o tráfego de rede para ocultar o conteúdo de interceptadores.</html>");

            respostaCorreta = "C";
            explicacaoUm.setText("<html> A integridade assegura que a informação permaneça exata e confiável, impedindo que seja alterada de" +
                    " maneira indevida ou maliciosa. A opção A refere-se à Confidencialidade e a B à Disponibilidade.</html>");
        }else if (perguntaAtual ==3){
            questao.setText("QUESTÃO 3");
            perguntaUm.setText("<html>O que caracteriza um ataque de Ransomware?</html>");
            opcaoA.setText("<html>A) O roubo silencioso de dados bancários através do registro de teclas digitadas.</html>");
            opcaoB.setText("<html>B)  A sobrecarga de um servidor para derrubar a disponibilidade de um site ou serviço.</html>");
            opcaoC.setText("<html>C)  A infecção por um vírus que se replica sozinho pela rede sem precisar de um arquivo hospedeiro.</html>");
            opcaoD.setText("<html>D) A criptografia dos arquivos da vítima com exigência de pagamento de resgate para liberação.</html>");

            respostaCorreta = "D";
            explicacaoUm.setText("<html> O ransomware bloqueia o acesso aos dados do" +
                    " usuário (geralmente por meio de criptografia forte) e cobra um valor financeiro (resgate) para fornecer a chave de descriptografia.</html>");
            proxima.setText("FINALIZAR");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new segundaTela().setVisible(true);
        });
    }
}
