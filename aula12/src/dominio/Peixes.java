package dominio;

public class Peixes extends Animal{
	private String corEscama;

	
	
	public Peixes(float peso, int idade, int membros, String cor) {
		super(peso, idade, membros);
		this.corEscama = cor;
	}

	@Override
	public void locomover() {
		System.out.println("Nadando...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolha");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public String toString() {
		return "Peixes [corEscama=" + corEscama + "]";
	}
	
	
	

}
