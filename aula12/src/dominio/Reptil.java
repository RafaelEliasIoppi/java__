package dominio;

public class Reptil extends Animal {
	

	private String corEscama;
	
	public Reptil(float peso, int idade, int membros, String cor) {
		super(peso, idade, membros);
		this.corEscama = cor;
	}

	
	

	public String getCorEscama() {
		return corEscama;
	}




	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}




	@Override
	public void locomover() {
		System.out.println("Rastejando...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo insetos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
		
	}




	@Override
	public String toString() {
		return "Reptil [corEscama=" + corEscama + "]";
	}
    
	
}
