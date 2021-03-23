package POO;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	/**
	* @author jpompa
	* @date 06/03/21
	* **/
	
	public Cuenta() {
		
	}//end cuenta
	
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre=nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
		
		
	}//end cuenta
	
	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
		
	}//end cuenta
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//end setNombre
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}//end setNumeroCuenta
	
	public void setTipointeres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}//end setTipoInteres
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}//end setsaldo
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}
	
	public double getTipoInteres() {
		return this.tipoInteres;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;
		
		if(n<0) {
			ingresoCorrecto = false;
		}else {
			saldo = saldo + n;
		}//end else
		
		return ingresoCorrecto;
	}//end ingreso
	
	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;
		if(n>0) {
			reintegroCorrecto = false;
		}else if(saldo >= n) {
			saldo -= n;
		}else {
			reintegroCorrecto = false;
		}
		
		return reintegroCorrecto;
	}// end reintegro
	
	public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		if(n<0) {
			correcto = false;
		}else if (saldo >= n) {
			reintegro(n);
			c.reintegro(n);
		}else {
			correcto = false;
		}
		
		return correcto;
	}//end transferencia

}//end clase
