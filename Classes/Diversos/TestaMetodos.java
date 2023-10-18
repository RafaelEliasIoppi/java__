/* Exemplo para demonstrar a implementação de métodos,
 * passagem de parâmetros, parâmetros variáveis e 
 * retorno de método.
 */
public class TestaMetodos {

  public static void main(String[] args) {
    int    i;
    double d;
    int[] meuVetor = {5, 6, 7, 8, 9};
    
    Metodos calc = new Metodos();
    
    //Chamando métodos que não retornam nada (void).
    calc.exibeMensagem("Joao", 30);

    //Chamando métodos que retornam números.
    i = calc.calculaDobro(10);             //retorna um valor inteiro.
    d = calc.calculaImposto(1000, 0.1, 5); //retorna um valor double.
    System.out.println("Dobro de 10 = " + i);
    System.out.println("Imposto     = " + d);
    
    //Passando um array para um método.
    calc.mostraVetor(meuVetor);  
    
    //Chamando um método com quantidade variável de parâmetros.
    calc.mostraValores();
    calc.mostraValores(3);
    calc.mostraValores(3, 8);
    calc.mostraValores(3, 8, 9, 1, 4, 2, 9, 3, 5);
    calc.mostraValores(meuVetor); //Pode ser passado um array.
    
  }//main()
  
}//TestaMetodos.