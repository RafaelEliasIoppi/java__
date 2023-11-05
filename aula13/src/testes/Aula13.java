package testes;

import dominio.Cachorro;
import  telas.Tela;
import dominio.Lobo;
import dominio.Mamifero;

public class Aula13 {

	public static void main(String[] args) {

	
	Lobo l = new Lobo("Nina", "Branco");
	Mamifero m =  new Mamifero("Monkey", "Marrom");
	Cachorro c = new Cachorro("Wolf","Cinza");
	Tela tela = new Tela();
	
	
	
	tela.mostrarDados(c);
	tela.mostrarDados(l);
	tela.mostrarDados(m);
	System.out.println("");
	c.reagir(true);
	c.reagir("olá");
	System.out.println(c);

 
	}

}
