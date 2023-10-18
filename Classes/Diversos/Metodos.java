/* Exemplo para demonstrar a implementa��o de m�todos,
 * passagem de par�metros, par�metros vari�veis e 
 * retorno de m�todo.
 */
public class Metodos {

  //Recebe 2 par�metros mas n�o retorna nada. Utiliza-se void.
  public void exibeMensagem(String nome, int idade) { 
    System.out.println("Ola " + nome + ", voce tem " + idade + " anos de idade.");
  }//exibeMensagem()

  //Recebe um par�metro inteiro e retorna o seu dobro, tamb�m inteiro.
  public int calculaDobro(int n) { 
    return n * 2;
  }//calculaDobro()

  //Recebe 3 par�metros e retorna um double.
  public double calculaImposto(double capital, double tx, int meses) {
    double imp;
    imp = capital * tx * meses;
    return imp;
  }//calculaImposto()

  //Recebe um array.
  public void mostraVetor(int[] v) {
    int i;
    System.out.print("Vetor:   ");
    for(i=0; i<v.length; i++) {
      System.out.print(" | " + v[i]);
    }
    System.out.println(" | ");
  }//mostraVetor()

  //Utilizando o conceito Varargs (quantidade arbitr�ria/vari�vel de par�metros)
  public void mostraValores(int ... v) {
    int i;
    System.out.print("Valores: ");
    for(i=0; i<v.length; i++) {
      System.out.print(" | " + v[i]);
    }
    System.out.println(" | ");
  }//mostraValores()
  
}//Metodos.