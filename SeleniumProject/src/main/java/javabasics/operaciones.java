package javabasics;

import javax.swing.JOptionPane;

public class operaciones {
	
	public static void main(String[] args) {
		Double N1 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero")); //forma directa de convertir un string a un double
		//String N2 = JOptionPane.showInputDialog("ingresa el segundo numero");
		Double N2 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
		
		//System.out.println(N1+Double.parseDouble(N2));//forma indirecta de convertir un double a string
		System.out.println(N1+N2);
		System.out.println(N1-N2);
		System.out.println(N1*N2);
		System.out.println(N1/N2);
		
		JOptionPane.showMessageDialog(null, N1+N2 );
	}

}
