package dominio;

public class Mamifero extends Animal {
	

	private String corPelo;
	private String nome;

	public Mamifero(String nome, String corPelo) {
		this.nome = nome;
		this.corPelo = corPelo;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	@Override
	public void emitirSom() {
		System.out.println("Som de Mamífero");
		
	}




	public String getCorPelo() {
		return corPelo;
	}


	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
	
}
