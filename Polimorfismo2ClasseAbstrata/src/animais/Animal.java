package animais;

/*==================== Classe Animal ====================*/
public abstract class Animal {
  public String nome;      //Atributo público só para simplificar o exemplo.
    
  //Método Construtor da Classe.
  public Animal(String umNome) {
    this.nome = umNome;
  } 

  //Declaração de um método abstrato.
  //Deverá ser implementado (sobrescrito) pelas classes descendentes 
  //que forem concretas (não abstratas).
  public abstract void fala();
  
  public void falaNome() {
    System.out.println("Meu nome eh " + nome);
  }
    
  public void conversa() {
    System.out.println("Meu nome eh " + nome);
    fala();
    fala();
    fala();
    System.out.println("Prazer em conhece-lo.");
  }
  
}//Animal.