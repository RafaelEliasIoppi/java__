package dominio;


public class Cachorro extends Lobo {
	
	
	
	public Cachorro(String nome, String corPelo) {
		super(nome, corPelo);
		
		
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Som de Cachorro: Au Au Au !!!");
	}
	
	
	
	public void reagir(String frase) {
		if(frase == "Toma comida" || frase == "Olá") {
			System.out.println("Abanar e latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int minuto) {
		if(hora < 12 ) {
			System.out.println("Abanar");
		} else if(hora >= 18){
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar e moder");
			emitirSom();
		}
	}
	
	public void reagir(int idade, float peso) {
		if(idade <5) {
			if(peso < 10) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
		} else 
			if(peso <10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
	}


	
	
}
