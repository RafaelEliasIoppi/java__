/* 
 * Classe para demonstrar a sobrecarga (overloading) de métodos.
 * 
 */
public class Metodos2 {

  public void metodo1(){
    System.out.println("Olá.");
  }
  
  public void metodo1(int i){
    System.out.println("Número inteiro: " + i);
  }
  
  public void metodo1(float f) {
    System.out.println("Número real: " + f);
  }
  
}