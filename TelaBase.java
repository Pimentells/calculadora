package CALCULADORA;

import javax.swing.*;

public class TelaBase extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public TelaBase(String Texto){
		this.setTitle(Texto);
		this.setResizable(false);
		this.setLocation(0, 0);
		this.setSize(500, 500);
		this.setLayout(null);
		
	}
}
