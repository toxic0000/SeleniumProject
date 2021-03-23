package POO;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String numero;
		double tipo;
		double importe;
		
		Cuenta cuenta1 = new Cuenta();
		
		System.out.println("ingresa nombre");
		nombre = teclado.next();
		System.out.println("ingresa numero de cuenta");
		numero = teclado.next();
		System.out.println("tipo de interes");
		tipo = teclado.nextDouble();
		System.out.println("mete el importe");
		importe = teclado.nextDouble();
		teclado.close();
		
		//asignar valores con metodo set
		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setSaldo(importe);
		cuenta1.setTipointeres(tipo);
		
		//utilizar contructor con parametros y asignarlos
		Cuenta cuenta2 = new Cuenta("jorge", "1234", 120.0, 5000 );
		System.out.println(cuenta2.getNombre());
		
		//utilizar constructor que recibe objeto
		Cuenta cuenta3 = new Cuenta(cuenta1);
		
		
		
		

	}//end public

}//end clase
