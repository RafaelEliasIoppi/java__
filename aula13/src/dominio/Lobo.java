package dominio;

public class Lobo extends Mamifero{
	
		
	public Lobo(String nome, String corPelo) {
		super(nome, corPelo);
		// TODO Auto-generated constructor stub
	}

	
	
	

	@Override
	public void emitirSom() {
		System.out.println("Som de Lobo... Auuuuuuuu!!!!!!!");
	}
}
