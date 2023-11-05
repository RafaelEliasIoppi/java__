package testes;

import dominio.Mamifero;
import dominio.Ave;
import dominio.Peixes;
import dominio.Reptil;
import telas.tela;

public class Aula12 {

	public static void main(String[] args) {
		Mamifero m = new Mamifero(33.5f,10,4,"caramelo");
		Ave v = new Ave(5f,4,2);
		Peixes p = new Peixes(1f, 1, 0,"azul");
		Reptil  r = new Reptil(2f,2,5,"verde");
		tela tela = new tela();
		
		tela.mostrarAnimais(p);
		tela.mostrarAnimais(m);
		tela.mostrarAnimais(v);
		tela.mostrarAnimais(r);
		
		
		
		
		

	}

}
