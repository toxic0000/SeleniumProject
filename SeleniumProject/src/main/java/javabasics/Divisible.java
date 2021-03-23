package javabasics;

import javax.swing.JOptionPane;

public class Divisible {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
		
		if (n1%2 == 0 ) {
			
			System.out.println(n1 + " es divisible entre 2");
		} else {
			System.out.println(n1 + " no es divisible entre 2");
		}

	}

}
