public class Conta {

	private String numero;
	private double saldo;

	public Conta(String numero){
		this.numero = numero;
		this.saldo = 0;
	}

	public void creditar(double valor){
		this.saldo += valor;
	}

	public void debitar(double valor){
		this.saldo -= valor;
	}

	public double saldo(){
		return this.saldo;
	}

	public String numero(){
		return this.numero;
	}
}