/* 
 * Classe para demonstrar a sobrecarga (overloading) de m�todos.
 * 
 */
public class Metodos2 {

  public void metodo1(){
    System.out.println("Ol�.");
  }
  
  public void metodo1(int i){
    System.out.println("N�mero inteiro: " + i);
  }
  
  public void metodo1(float f) {
    System.out.println("N�mero real: " + f);
  }
  
}