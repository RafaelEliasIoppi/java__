package dominio;



public class Funcionario {

	private String nome;
	private Residencia residencia;
	
	
	public Funcionario(String n, Residencia r) { // construtor que obriga o funcionario a ter no minimo 1 residencia
	    this.setNome(n);
	    this.setResidencia(r);
	    
	  }
	
	public Residencia getResidencia() {
		return residencia;
	}

	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}

	public String getNome() {
	    return nome;
	  }
	
	public void setNome(String nome) {
	    //Regras para validação de nome (neste exemplo):
	    //Nome deve ser diferente de null e ter pelo menos 3 caracteres.
	    if (nome == null) 
	      throw new RuntimeException("Nome NULL.");
	    if (nome.length() < 3)
	      throw new RuntimeException("Nome com menos que 3 caracteres.");
	    this.nome = nome;
	  }
	
	
	
}
