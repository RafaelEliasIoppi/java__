package dominio;

public class FuncionarioAbstrato {

	//Atributos de Instancia
	private String nome;
	private String sexo;
	private String cpf;
	
	
	
	
	
	
	private Endereco endereco;

	//---------------------------------
	//Métodos construtores
	//---------------------------------

	public FuncionarioAbstrato() {
	}

	public FuncionarioAbstrato(String nome, String sexo, String cpf, Endereco endereco){
		this.setNome(nome);
		this.setSexo(sexo);
		this.setCpf(cpf);
		this.setEndereco(endereco);
	}

	//---------------------------------
	//Métodos de instância
	//---------------------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if ((sexo=="M") || (sexo=="F")) {
			this.sexo = sexo;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double txINSS(){
		double txInss;
		if(salarioBruto() <= 1000){
			txInss = 0.08f;
		}else if(salarioBruto() <= 2000 ){
			txInss = 0.09f;
		}else if(salarioBruto() <= 3000){
			txInss = 0.10f;
		}else{
			txInss = 0.11f;
		}
		return txInss;
	}

	public double valorINSS(){
		double valorInss;
		valorInss = salarioBruto() * txINSS();
		if(valorInss > 900){
			valorInss = 900;
		}
		return valorInss;
	}


	public float txIR(){
		float txIR;
		if(salarioBaseIR() <= 1000){
			txIR = 0.0f; 
		}else if(this.salarioBaseIR() <= 3000 ){
			txIR = 0.1f;
		}else if(this.salarioBaseIR() <= 5000){
			txIR = 0.2f;
		}else{
			txIR = 0.3f;
		}
		return txIR;
	}

	public double salarioBaseIR(){
		double salarioBaseIR;
		salarioBaseIR = salarioBruto()- valorINSS();
		return salarioBaseIR;
	}

	public double valorIR(){
		double valorIR = salarioBaseIR() * txIR();
		return valorIR;
	}

	public double salarioLiquido(){
		double salarioLiquido;
		salarioLiquido = salarioBruto() - valorINSS() - valorIR();
		return salarioLiquido;
	}
	
	public float salarioBruto() {
		return 0;
		
	}
	
	//equals()

}//Funcionario