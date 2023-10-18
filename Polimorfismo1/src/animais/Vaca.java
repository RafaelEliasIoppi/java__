package animais;


/*==================== Classe Vaca ====================*/
public class Vaca extends Animal {
  
  //Construtor da Classe.
  public Vaca(String umNome) {
    super(umNome); //Chama construtor da superclasse.
  }

  //Sobrepondo (overriding) ou sobrescrevendo o m�todo fala.
  @Override
  public void fala() {
    System.out.println("muuu");
  }
  
  @Override
  public String toString() {
    return "Vaca [nome=" + nome + "]";
  }
  
}//Vaca.