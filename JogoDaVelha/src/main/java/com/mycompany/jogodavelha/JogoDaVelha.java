package com.mycompany.jogodavelha; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha extends JFrame implements ActionListener {
    private JButton[] botoes = new JButton[9];
    private boolean vezDoX = true;
    private JLabel labelStatus;
    private int jogadas = 0;

    
    public JogoDaVelha() {
        setTitle("Jogo da Velha");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelGrade = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            botoes[i] = new JButton("");
            botoes[i].setFont(new Font("Arial", Font.BOLD, 40));
            botoes[i].setFocusPainted(false);
            botoes[i].addActionListener(this);
            painelGrade.add(botoes[i]);
        }

        labelStatus = new JLabel("Vez do Jogador X", JLabel.CENTER);
        labelStatus.setFont(new Font("Arial", Font.BOLD, 16));

        add(labelStatus, BorderLayout.NORTH);
        add(painelGrade, BorderLayout.CENTER);

        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaoClicado = (JButton) e.getSource();

        if (botaoClicado.getText().equals("")) {
            if (vezDoX) {
                botaoClicado.setText("X");
                botaoClicado.setForeground(Color.RED);
                labelStatus.setText("Vez do Jogador O");
            } else {
                botaoClicado.setText("O");
                botaoClicado.setForeground(Color.BLUE);
                labelStatus.setText("Vez do Jogador X");
            }
            vezDoX = !vezDoX;
            jogadas++;
            verificarVencedor();
        }
    }

    public void verificarVencedor() {
        int[][] combinacoes = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
        };

        for (int[] c : combinacoes) {
            if (!botoes[c[0]].getText().equals("") &&
                botoes[c[0]].getText().equals(botoes[c[1]].getText()) &&
                botoes[c[0]].getText().equals(botoes[c[2]].getText())) {
                
                JOptionPane.showMessageDialog(this, "Jogador " + botoes[c[0]].getText() + " venceu!");
                reiniciar();
                return;
            }
        }

        if (jogadas == 9) {
            JOptionPane.showMessageDialog(this, "Deu Velha!");
            reiniciar();
        }
    }

    private void reiniciar() {
        for (JButton b : botoes) b.setText("");
        vezDoX = true;
        jogadas = 0;
        labelStatus.setText("Vez do Jogador X");
    }

    public static void main(String[] args) {
        // Isso garante que o jogo abra corretamente
        SwingUtilities.invokeLater(() -> new JogoDaVelha());
    }
}