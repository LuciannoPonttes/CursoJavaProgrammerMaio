package teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
	
	private JLabel labelNome, labelCpf;
    private JTextField textFieldNome, textFieldCpf;
    private JButton buttonCriar, buttonAtualizar, buttonDeletar;
    private JPanel panel;
    
    public Principal() {
        setTitle("CRUD de Entidade");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel(new GridLayout(3, 2));
        
        labelNome = new JLabel("Nome:");
        textFieldNome = new JTextField();
        
        labelCpf = new JLabel("CPF:");
        textFieldCpf = new JTextField();
        
        buttonCriar = new JButton("Criar");
        buttonAtualizar = new JButton("Atualizar");
        buttonDeletar = new JButton("Deletar");
        
        buttonCriar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para criar um novo registro
            }
        });
        
        buttonAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para atualizar um registro existente
            }
        });
        
        buttonDeletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para deletar um registro existente
            }
        });
        
        panel.add(labelNome);
        panel.add(textFieldNome);
        panel.add(labelCpf);
        panel.add(textFieldCpf);
        panel.add(buttonCriar);
        panel.add(buttonAtualizar);
        panel.add(buttonDeletar);
        
        add(panel);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Principal();
    }

}
