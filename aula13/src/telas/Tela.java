package telas;

import dominio.Animal;
import dominio.Cachorro;
import dominio.Lobo;
public class Tela {

	public void mostrarDados(Animal a) {
		System.out.println("---------------------------------------------");
	  
		if(a instanceof Cachorro) {
				
			System.out.println("Nome do cão :" + a.getNome()  + " Cor do Pelo: " + a.getCorPelo());
			a.emitirSom();
			}
		else if (a instanceof Lobo) {
			System.out.println("Nome do Lobo :" + a.getNome()  + " Cor do Pelo: " + a.getCorPelo());
			a.emitirSom();
		} else {
			System.out.println("É um mamífero: " + a.getNome()  + " Cor do Pelo: " + a.getCorPelo());	
			a.emitirSom();
			}

           
		}
	
}
