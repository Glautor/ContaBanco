public class VerificaPoupanca {
	
	public static void main(String args[]){
	Scanner scanner = new Scanner ( System.in );
		System.out.println(“Escolha: [1] Conta e [2] Poupanca: ”);
		Conta conta = null;

		if(scanner.nextInt() == 1){
			conta = new Conta("21.342-7");
		}else{
			conta = new ContaPoupanca("21.342-7");
		}

		conta.creditar(500.87);
		conta.debitar(45.00);

		System.out.println(conta.saldo());
		
		if(conta instanceof ContaPoupanca){
			((ContaPoupanca) conta).renderJuros(0,1);
			System.out.println(“Saldo com juros: ” + conta.saldo());
		}
	}
}