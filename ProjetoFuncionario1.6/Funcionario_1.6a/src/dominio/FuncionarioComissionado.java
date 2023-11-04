package dominio;

public class FuncionarioComissionado extends FuncionarioAbstrato {
	private float valorVendas;
	private float salBase;
	private float porcentagem;
	
	
	
	public FuncionarioComissionado(String nome, String sexo, String cpf, Endereco endereco, float vendas, float sal, float porcentagem) {
		super(nome, sexo, cpf, endereco);
		setValorVendas(vendas);
		setSalBase(sal);
		setPorcentagem(porcentagem);
	}
	public float getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}
	public float getSalBase() {
		return salBase;
	}
	public void setSalBase(float salBase) {
		this.salBase = salBase;
	}
	public float getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public float salarioBruto() {
		float salario;
		salario = (this.valorVendas * this.porcentagem) + salBase;
		return salario;
		
	}
	
	
	
	
}
