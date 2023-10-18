package testes;

import animais.Animal;
import animais.Cao;
import animais.Vaca;

/*
  Exemplo para demonstração do polimorfismo e métodos sobrepostos (overriding).
*/
public class Teste4_Polimorfismo {

  public static void main(String[] args) {  
    Animal a1, a2;

    System.out.println("****************************************************************");
    System.out.println("Testando polimorfismo");
    System.out.println("****************************************************************");
    System.out.println();
    
    //Cria objetos (usando polimorfismo).
    a1 = new Animal("");   //cria uma instância de Animal. Em geral, não é uma forma adequada.
    a2 = new Cao("Benji"); //cria uma instância de Cao (usando polimorfismo).
    
    System.out.println("--- Objetos a1 e a2 foram criados ---");

    System.out.print("a1.fala() = ");
    a1.fala();
    System.out.println();
    a1.conversa();

    //Polimorfismo: o objeto a2 foi declarado um Animal.
    //A classe Animal possui o método fala(), mas no momento da execução 
    //é chamado o método fala() da classe Cao.
    System.out.print("a2.fala() = ");
    a2.fala();
    System.out.println();
    a2.conversa();

    //Mais polimorfismo.
    System.out.println("\n------------- Mais Polimorfismo ----------------");
    a2 = new Vaca("Mimi");
    System.out.println("a2 = new Vaca(\"Mimi\")");
    System.out.print("a2.fala() = ");
    a2.fala();    
    System.out.println();
    
    a2.conversa();
    
  }//main()
  
}//Teste4_Polimorfismo.