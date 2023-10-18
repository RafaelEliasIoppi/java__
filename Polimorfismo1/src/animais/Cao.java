package animais;

/*==================== Classe Cao ====================*/
public class Cao extends Animal {
  
  //Construtor da Classe.
  public Cao(String umNome) {
    super(umNome); //Chama construtor da superclasse.
  }

  //Sobrepondo (overriding) ou sobrescrevendo o m�todo fala.
  @Override
  public void fala() {
    latir();
  }
  
  @Override
  public String toString() {
	  return "Cao [nome=" + nome + "]";
  }

  //Método específico da classe Cao.
  public void latir() {
    System.out.println("au");
  }
  
}//Cao.