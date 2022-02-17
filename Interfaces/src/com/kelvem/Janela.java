package com.kelvem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	private JLabel jNome,jNota1, jNota2, jNota3, jNota4;
	private JTextField jTextoNome,jTexto1, jTexto2, jTexto3, jTexto4;
	private JButton jBotao;
	private JPanel jPanelBorder, jPanelGrid, jPanelFlow;
	
	public Janela() {
		super("Calcular Média Aluno");
		setLayout(new FlowLayout());
		
		jPanelGrid = new JPanel();
		jPanelGrid.setLayout(new GridLayout(5,5));
		
		/////////////////////////////
		
		jNome = new JLabel("Nome do Aluno");
		jPanelGrid.add(jNome);
		
		jTextoNome = new JTextField(2);
		jPanelGrid.add(jTextoNome);
		
		/////////////////////////////
		
		jNota1 = new JLabel("  Primeira nota  ");
		jPanelGrid.add(jNota1);
		
		jTexto1 = new JTextField(2);
		jPanelGrid.add(jTexto1);
		
		/////////////////////////////
		
		jNota2 = new JLabel("  Segunda nota  ");
		jPanelGrid.add(jNota2);
		
		jTexto2 = new JTextField(2);
		jPanelGrid.add(jTexto2);
		
		/////////////////////////////
		
		jNota3 = new JLabel("  terceira nota  ");
		jPanelGrid.add(jNota3);
		
		jTexto3 = new JTextField(2);
		jPanelGrid.add(jTexto3);
		
		/////////////////////////////
		
		jNota4 = new JLabel("  Quarta nota  ");
		jPanelGrid.add(jNota4);
		
		jTexto4 = new JTextField(2);
		jPanelGrid.add(jTexto4);
		
		/////////////////////////////
		
		jPanelFlow = new JPanel();
		jPanelFlow.setLayout(new FlowLayout());
		
		jBotao = new JButton("Calcular Média do Aluno");
		jBotao.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						double nota1 = Double.parseDouble(jTexto1.getText()); 
						double nota2 = Double.parseDouble(jTexto2.getText());
						double nota3 = Double.parseDouble(jTexto3.getText());
						double nota4 = Double.parseDouble(jTexto4.getText());
						double media = (nota1 + nota2 + nota3 + nota4)/4;
						String nome = jTextoNome.getText();
						JOptionPane.showMessageDialog(rootPane, "O nome do aluno é: " + nome + " e a média dele é " + media);
						
						
					}
				}
			);
		
		/////////////////////////////
		
		jPanelFlow.add(jBotao);
		
		
		
		
		
		jPanelBorder = new JPanel();
		jPanelBorder.setLayout(new BorderLayout());
		jPanelBorder.add(jPanelGrid, BorderLayout.CENTER);
		jPanelBorder.add(jPanelFlow, BorderLayout.SOUTH);
		
		this.add(jPanelBorder);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		setResizable(false);
		
	}
	
}
