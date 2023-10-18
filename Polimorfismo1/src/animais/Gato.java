package animais;


/*==================== Classe Gato ====================*/
public class Gato extends Animal {
  
  //Construtor da Classe.
  public Gato(String umNome) {
    super(umNome); //Chama construtor da superclasse.
  }

  //Sobrepondo (overriding) ou sobrescrevendo o método fala.
  @Override
  public void fala() {
    miar();
  }

  @Override
  public String toString() {
    return "Gato [nome=" + nome + "]";
  }
  
  //Método específico da classe Gato.
  public void miar() {
	  System.out.println("miau");
  }
  
}//Gato.