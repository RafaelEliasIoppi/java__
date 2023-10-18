package testes;

import animais.Animal;
import animais.Cao;
import animais.Gato;

/*
  Exemplo para mostrar a utilização de "Type Cast" ou "Casting".
*/
public class Teste2_Casting {

  public static void main(String[] args) {  
    Object o1;
    Animal a1;
    Cao    c1;
    Gato   g1;

    System.out.println("*********************************************************");
    System.out.println("************ Type casting (coerção de tipo) *************");
    System.out.println("*********************************************************");
    
    //Cria uma instância de Cao.
    c1 = new Cao("Rex");   

    System.out.print("c1.latir()        = ");
    c1.latir();

    //Uma variável de um tipo mais geral (superclasse) pode receber diretamente
    //um objeto de uma classe mais específica (subclasse).
    //Exemplos:
    //Uma variável do tipo Animal pode receber um objeto do tipo Cao ou Gato.
    a1 = c1;
    System.out.println("a1.nome=" + a1.nome);
    
    //Erro de compilação. 
    //Para o compilador, a1 é um animal, e um animal não tem o método latir().
     //a1.latir();

    //Casting (coerção) ou "type casting".
    System.out.print("((Cao)a1).latir() = ");
    //Força o compilador a aceitar que a1 é do tipo Cao, ou seja,
    //trata objeto a1 como sendo do tipo Cao.
    ((Cao)a1) . latir();
  
    //Repetindo:
    //Cria outra instância de Cao.
    //Variável do tipo Animal pode receber um objeto do tipo Cao. 
    a1 = new Cao("K9000"); 
    //Erro de compilação. 
    //Para o compilador, a1 é um animal, e um animal não tem o método latir().
    //a1.latir(); 

    //Casting (coerção) ou "type casting".
    System.out.print("((Cao)a1).latir() = ");
    //Força o compilador a aceitar que a1 é do tipo Cao.
    //Trata objeto a1 como sendo do tipo Cao.
    ((Cao)a1) . latir();

    //Outro exemplo: 
    //Uma variável do tipo Object pode receber um objeto do tipo Animal.
    //o1 recebe a1, ou seja, o1 referencia (aponta para) a1.
    o1 = a1;
    //Trata objeto o1 como sendo do tipo Cao.
    System.out.print("((Cao)o1).latir() = ");
    ((Cao)o1) . latir();
    
    a1 = new Cao("Kiko");
    //Uma variável de um tipo mais específico (subclasse) não pode receber diretamente
    //um objeto de uma classe mais geral (superclasse): 
    //c1 = a1;
    //Tem que fazer a coerção (casting):
    c1 = (Cao)a1;
    System.out.print("c1.nome = " + c1.nome +  " ");    
    c1.latir();
    
    o1 = new Gato("Mimi");
    //Uma variável de um tipo mais específico (subclasse) não pode receber diretamente
    //um objeto de uma classe mais geral (superclasse): 
    //g1 = o1;
    //Tem que fazer a coerção (casting):
    g1 = (Gato)o1;
    System.out.print("g1.nome = " + g1.nome +  " ");
    g1.miar();

    //Não é permitido.
    //g1 = c1;
    
    //Não é permitido.
    //g1 = (Gato)c1;

    //Instancia um Gato.
    a1 = new Gato("Mimi");
    //Forçou o compilador tratar a1 como Cao, o compilador aceita, no entanto,
    //dará erro em tempo de execução, pois no momento da execução a1 é um Gato e não um Cao.
    System.out.println("Agora vai dar erro em tempo de execução (RuntimeException), ao tentar executar a linha abaixo, pois a1 é um Gato e não um Cao.");
    System.out.println("((Cao)a1) . latir();");
    ((Cao)a1) . latir();

  }//main()
  
}//Teste3_Casting.