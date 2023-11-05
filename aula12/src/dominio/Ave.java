package dominio;

public class Ave extends Animal {

	public Ave(float peso, int idade, int membros) {
		super(peso, idade, membros);
		
	}
	@Override
	public void locomover() {
		System.out.println("Voando...");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo formigas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
		
	}
	
	

}
