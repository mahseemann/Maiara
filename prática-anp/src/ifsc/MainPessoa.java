package ifsc;

public class MainPessoa {

	public static void main(String[] args) {

		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		
		professor.setNome("Bruna");
		professor.setSiape(4500);
		professor.setCPF("59748612344");
		
		aluno.setNome("Maiara");
		aluno.setMatricula(74896);
		aluno.setCPF("06594875366");
		
		System.out.println("Nome da Professora: "+professor.getNome());
		System.out.println("Siape da Professora: "+professor.getSiape());
		System.out.println("CPF da professora: "+professor.getCPF());
		System.out.println("\nNome da aluna: "+aluno.getNome());
		System.out.println("Matrícula da aluna: "+aluno.getMatricula());
		System.out.println("CPF da aluna: "+aluno.getCPF());
	}
	

}
