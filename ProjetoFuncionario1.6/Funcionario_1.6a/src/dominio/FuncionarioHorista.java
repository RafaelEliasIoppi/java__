package dominio;


public class FuncionarioHorista extends FuncionarioAbstrato {
	private float salPorhora;
	private float horasTrab;
	
	
	public FuncionarioHorista(String nome, String sexo, String cpf, Endereco endereco, float horas, float salHora) {
		super(nome, sexo, cpf, endereco);
		setHorasTrab(horas);
		setSalPorhora(salHora);
			
		
	}
	
	public float salarioBruto() {
		float salario;
		salario = this.horasTrab * this.salPorhora;
		return salario;
		
	}
	public float getSalPorhora() {
		return salPorhora;
	}
	public void setSalPorhora(float salPorhora) {
		this.salPorhora = salPorhora;
	}
	public float getHorasTrab() {
		return horasTrab;
	}
	public void setHorasTrab(float horasTrab) {
		this.horasTrab = horasTrab;
	}
	
	
	
}
