package testes;
import animais.Animal;
import animais.Cao;
import animais.Gato;

public class Teste1 {
  public static void main(String[] args) {
	Cao    c1;
	Gato   g1;
	Animal a1;
    Object o1;
    
    c1 = new Cao("Rex");
    g1 = new Gato("Mimi");
    
    //Uma variável de um tipo mais geral (superclasse) pode receber diretamente
    //um objeto de uma classe mais específica (subclasse).
    //Exemplos:
    //Uma variável do tipo Animal pode receber um objeto do tipo Cao ou Gato.

    //a1 recebe c1, ou seja, a1 referencia (aponta para) o Cao c1.
    a1 = c1;
    System.out.println("a1.nome : " + a1.nome);

    //a1 recebe g1, ou seja, a1 referencia (aponta para) Gato g1.
    a1 = g1;
    System.out.println("a1.nome : " + a1.nome);
    
    //Idem (instanciar e atribuir).
    a1 = new Cao("Kiko");
    System.out.println("a1.nome : " + a1.nome);

    //Outro exemplo: 
    //Uma variável do tipo Object pode receber um objeto do tipo Cao.
    //o1 recebe c1, ou seja, o1 referencia (aponta para) c1.
    o1 = c1;
    //No entanto, neste caso não será possível acessar os atributos ou chamar os métodos de Cao ou Animal 
    //diretamente no objeto o1, a não ser que se utilize o mecanismo da coerção (casting), 
    //que será mostrado em outro projeto. 
    //o1.nome;
    //o1.fala();
    //o1.latir();
    //Então, por enquanto, aproveitamos o método toString() que foi implementado na classe Cao.
    //Lembrando que a representação String de um objeto deve ser implementada no método toString().
    System.out.println("o1 é : " + o1);

    //Uma variável de um tipo mais específico (subclasse) não pode receber diretamente
    //um objeto de uma classe mais geral (superclasse), a não ser que se utilize o mecanismo
    //da coerção (casting), que será mostrado em outro projeto.
    //c1 = a1;
    //c1 = o1;
    //a1 = o1;
  }//main()

}//Teste1.