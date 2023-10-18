/* Exemplo para demonstrar a instancia��o da classe Aluno,
 * ou seja, a cria��o e utiliza��o de objetos da classe Aluno.
 */
class TestaAluno{
  public static void main(String[] args){
    //Declara objetos a1 e a2.
    Aluno a1;
    Aluno a2;

    //Cria objetos (instancia classe).
    a1 = new Aluno(); //Chama o m�todo construtor da classe Aluno.
    a2 = new Aluno(); //Chama o m�todo construtor da classe Aluno.

    System.out.println("*************************************************");
    System.out.println("Testando objetos, atributos e metodos");
    System.out.println("*************************************************");
    System.out.println();
    
    //Atribui valores aos atributos do objeto a1.
    a1.nome  = "Joao";
    a1.sexo  = 'M'; 
    a1.idade = 30; 
    a1.nota1 = 6; 
    a1.nota2 = 7; 

    //Atribui valores aos atributos do objeto a2.
    //Observe que � poss�vel atribuir qualquer valor. 
    //Isso viola o princ�pio do ocultamento da informa��o.
    a2.nome  = "";
    a2.sexo  = 'x';
    a2.idade = -30;
    a2.nota1 = -2;
    a2.nota2 = 15;

    //Acessa os atributos do objeto a1 e mostra na tela.
    System.out.println("Nome     = " + a1.nome);
    System.out.println("Sexo     = " + a1.sexo);
    System.out.println("Idade    = " + a1.idade);
    System.out.println("Nota 1   = " + a1.nota1);
    System.out.println("Nota 2   = " + a1.nota2);
    
    //Chama (invoca) m�todos do objeto a1 para obter a m�dia e a situa��o.
    System.out.println("Media    = " + a1.media());
    System.out.println("Situacao = " + a1.situacao());
   
    System.out.println();
 
    //Acessa os atributos do objeto a2 e mostra na tela.
    System.out.println("Nome     = " + a2.nome);
    System.out.println("Sexo     = " + a2.sexo);
    System.out.println("Idade    = " + a2.idade);
    System.out.println("Nota 1   = " + a2.nota1);
    System.out.println("Nota 2   = " + a2.nota2);
    
    //Chama (invoca) m�todos do objeto a2 para obter a m�dia e a situa��o.
    System.out.println("Media    = " + a2.media());
    System.out.println("Situacao = " + a2.situacao());
  }
}//TestaAluno.