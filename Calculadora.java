package CALCULADORA;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
	private static JTextField txtPeso;
	private static JTextField txtAltura;

	public static void main(String[] args) {
		TelaBase t01 = new TelaBase("Calculadora IMC");
		
		txtPeso = new JTextField();
		txtPeso.setBounds(12, 86, 470, 22);
		t01.getContentPane().add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Aopa meu bom, qual seu peso?");
		lblNewLabel.setBounds(12, 57, 185, 16);
		t01.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ai sim, hein? Agr me diz ai, meu rei: Qual tua altura?");
		lblNewLabel_1.setBounds(12, 121, 470, 16);
		t01.getContentPane().add(lblNewLabel_1);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(12, 150, 470, 22);
		t01.getContentPane().add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CALCULADORA DE IMC");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(143, 13, 192, 16);
		t01.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 42, 470, 2);
		t01.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 223, 470, 2);
		t01.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("RESULTADO");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setAlignmentX(0.5f);
		lblNewLabel_2_1.setBounds(185, 238, 99, 16);
		t01.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(185, 185, 97, 25);
		t01.getContentPane().add(btnNewButton);
		t01.setVisible(true);
	}
}
