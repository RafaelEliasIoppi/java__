/* Exemplo para demonstrar a implementação de métodos,
 * passagem de parâmetros, parâmetros variáveis e 
 * retorno de método.
 */
public class Metodos {

  //Recebe 2 parâmetros mas não retorna nada. Utiliza-se void.
  public void exibeMensagem(String nome, int idade) { 
    System.out.println("Ola " + nome + ", voce tem " + idade + " anos de idade.");
  }//exibeMensagem()

  //Recebe um parâmetro inteiro e retorna o seu dobro, também inteiro.
  public int calculaDobro(int n) { 
    return n * 2;
  }//calculaDobro()

  //Recebe 3 parâmetros e retorna um double.
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

  //Utilizando o conceito Varargs (quantidade arbitrária/variável de parâmetros)
  public void mostraValores(int ... v) {
    int i;
    System.out.print("Valores: ");
    for(i=0; i<v.length; i++) {
      System.out.print(" | " + v[i]);
    }
    System.out.println(" | ");
  }//mostraValores()
  
}//Metodos.