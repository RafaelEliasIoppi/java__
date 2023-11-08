package telas;

import dominio.Animal;
import dominio.Mamifero;
import dominio.Reptil;
import dominio.Peixes;

public class tela {
	
	public void mostrarAnimais(Animal a) {
		
		
		System.out.println("====================================================");
		System.out.println("");
		System.out.print("Som do Animal: ");
		a.emitirSom();
		if (a instanceof Mamifero) {
            //String corDoPelo = ((Mamifero) a).getCorPelo();
			System.out.printf("Cor do pelo: %s\n",((Mamifero)a).getCorPelo() );
       
        } else {
            System.out.println("O animal não é um mamífero, portanto, não possui uma cor de pelo.");
        }
		if (a instanceof Peixes) {
            String corEscama = ((Peixes) a).getCorEscama();
            System.out.println("Cor da escama: " + corEscama);
        } else if (a instanceof Reptil) {
            String corEscama = ((Reptil) a).getCorEscama();
            System.out.println("Cor da escama: " + corEscama);
        } else {
            System.out.println("O animal não é um peixe ou réptil, portanto, não possui uma cor de escama.");
        }
		
		System.out.println("Peso: " + a.getPeso() + " Kg");
		System.out.println("Membros: " + a.getMembros());
		System.out.println("Idade: " + a.getIdade() + " anos");
		
		

		
	}

}
