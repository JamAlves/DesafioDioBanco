package DesafioDioBanco;

public class Main {

	

	public static void main(String[] args) {
		
		Cliente jayme = new Cliente();
		jayme.setNome("Jayme");
		
		
		
		Conta cc = new ContaCorrente(jayme);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(jayme);
		
		
		
		
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
