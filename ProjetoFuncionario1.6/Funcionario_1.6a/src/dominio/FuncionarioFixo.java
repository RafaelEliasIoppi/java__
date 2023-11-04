package dominio;

public class FuncionarioFixo extends FuncionarioAbstrato{
	
	
	private float salarioFixo;
	
	
	
	public FuncionarioFixo(String nome, String sexo, String cpf,  Endereco endereco, float salario) {
		super(nome, sexo, cpf, endereco);
		this.salarioFixo = salario;
	}



	public float  salarioBruto() {
		return salarioFixo;
		  }



	
}
	