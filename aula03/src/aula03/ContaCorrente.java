package aula03;

public class ContaCorrente {

	public String NomePessoa;
	public Long CPF;
	public Long nc;
	public Double saldo;
	
	public void depositar(Double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	public Double sacar(Double valorSaque) {
		
		double retornoSaque = 0;
		if(valorSaque > saldo);
		   System.out.println("Saldo insufciente:");
	} else {
		saldo = saldo - valorsaque;
		retornoSaque = valorSaque;
	}
	return retornoSaque;
	
	public void mostrarDados() {
		System.out.println("Títular:" + NomePessoa);
		System.out.println("CPF" + CPF);
		System.out.println("Conta:" + nc);
		System.out.println("Saldo Conta;" + saldo);
    }
}
