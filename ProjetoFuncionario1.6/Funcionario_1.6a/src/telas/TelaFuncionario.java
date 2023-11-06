package telas;



import dominio.FuncionarioAbstrato;


public class TelaFuncionario {
			
	
	

	public void mostrarDados(FuncionarioAbstrato f ) {
		System.out.println("===============################====================");
		System.out.println("--------------------");
		System.out.println("Dados do Funcionario");
		System.out.println("--------------------");

		System.out.print("Nome: ");
		System.out.println(f.getNome());

		System.out.print("Sexo: ");
		System.out.println(f.getSexo());

		System.out.print("CPF: ");
		System.out.println(f.getCpf());

		System.out.println("-------------------------------");
		System.out.print("Salario Bruto     = ");
		System.out.printf("%10.2f\n", f.salarioBruto());

		System.out.print("INSS              = ");
		System.out.printf("%10.2f\n", f.valorINSS());
		System.out.println("-------------------------------");

		System.out.print("Salario Base IR   = ");
		System.out.printf("%10.2f\n", f.salarioBaseIR());

		System.out.print("IR                = ");
		System.out.printf("%10.2f\n", f.valorIR());
		System.out.println("-------------------------------");

		System.out.print("Salario Liquido   = ");
		System.out.printf("%10.2f\n", f.salarioLiquido());
		System.out.println("-------------------------------");

		System.out.println("Endereco:");
		System.out.println("Rua         : " + f.getEndereco().getRua());
		System.out.println("Numero      : " + f.getEndereco().getNumero());
		System.out.println("Complemento : " + f.getEndereco().getComplemento());
		System.out.println("Bairro      : " + f.getEndereco().getBairro());

	}//mostrarDados()

}//TelaFuncionario.