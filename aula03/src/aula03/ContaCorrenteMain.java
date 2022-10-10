package aula03;

public class ContaCorrenteMain extends ContaCorrente{

	public static void main(String[] args) {

		ContaCorrente contaC = new ContaCorrente();
		contaC.NomePessoa = "Maiara";
		contaC.CPF = (long) (126.160-61);
		contaC.nc = (long) 369852741;
		contaC.saldo = (double) 400;
		
		contaC.mostrarDados();
		 
		contaC.depositar(100.0);
		contaC.sacar(250.0);
		
		contaC.mostrarDados();
	}

}
