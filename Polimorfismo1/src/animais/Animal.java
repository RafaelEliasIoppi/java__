package animais;

/*==================== Classe Animal ====================*/
public class Animal {
  public String nome;      //Atributo público só para simplificar o exemplo.
    
  //Método Construtor da Classe.
  public Animal(String umNome) {
    this.nome = umNome;
  } 

  public void falaNome() {
    System.out.println("Meu nome eh " + nome);
  }
  
  public void fala() {
    System.out.println("---");
  }
  
  public void conversa() {
    System.out.println("Meu nome eh " + nome);
    fala();
    fala();
    fala();
    System.out.println("Prazer em conhece-lo.");
  }
  
}//Animal.