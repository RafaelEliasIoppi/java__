/* Exemplo para demonstrar a utiliza��o da classe AlunoB. */
public class TestaAlunoB1{
  public static void main(String[] args){
    //Declara e instancia objetos.
    AlunoB a1 = new AlunoB();
    AlunoB a2 = new AlunoB();

    System.out.println("****************************************************************");
    System.out.println("Testando objetos, atributos, construtores e metodos");
    System.out.println("****************************************************************");
    System.out.println();
    
    //Mostra dados do objeto rec�m criado (a1).
    System.out.println("Mostra dados do objeto rec�m criado (a1):");
    //Erro de compila��o. O atributo nome n�o est� vis�vel (acess�vel)
    //pois foi declarado como privado (private).
    //S� est�o vis�veis os m�todos assessores.
    //System.out.println("Nome     = " + a1.nome);
    System.out.println("Nome     = " + a1.getNome());
    System.out.println("Sexo     = " + a1.getSexo());
    System.out.println("Idade    = " + a1.getIdade());
    System.out.println("Nota 1   = " + a1.getNota1());
    System.out.println("Nota 2   = " + a1.getNota2());
    System.out.println("Media    = " + a1.media());
    System.out.println("Situacao = " + a1.situacao());
    System.out.println();

    //Mostra dados do objeto rec�m criado (a2).
    System.out.println("Mostra dados do objeto rec�m criado (a2):");
    System.out.println("Nome     = " + a2.getNome());
    System.out.println("Sexo     = " + a2.getSexo());
    System.out.println("Idade    = " + a2.getIdade());
    System.out.println("Nota 1   = " + a2.getNota1());
    System.out.println("Nota 2   = " + a2.getNota2());
    System.out.println("Media    = " + a2.media());
    System.out.println("Situacao = " + a2.situacao());
    System.out.println();

    //Atribui valores para o objeto a1:
    a1.setNome("Pedro");
    //a1.sexo = 'M'; //<<< erro de compila��o. sexo � um campo privado.
    a1.setSexo('M'); //tente colocar 'x'. N�o ir� atribuir.    
    a1.setIdade(30); //tente atribuir uma idade negativa. N�o ir� atribuir.    
    a1.setNota1(6);  //tente colocar uma nota inv�lida. N�o ir� atribuir.
    a1.setNota2(7);

    //Atribui somente as notas para o objeto a2:
    a2.setNota1(9);
    a2.setNota2(10);

    //Mostra dados do objeto (a1).
    System.out.println("Mostra dados do objeto (a1):");
    System.out.println("Nome     = " + a1.getNome());
    System.out.println("Sexo     = " + a1.getSexo());
    System.out.println("Idade    = " + a1.getIdade());
    System.out.println("Nota 1   = " + a1.getNota1());
    System.out.println("Nota 2   = " + a1.getNota2());
    System.out.println("Media    = " + a1.media());
    System.out.println("Situacao = " + a1.situacao());
    System.out.println();

    //Mostra dados do objeto (a2).
    System.out.println("Mostra dados do objeto (a2):");
    System.out.println("Nome     = " + a2.getNome());
    System.out.println("Sexo     = " + a2.getSexo());
    System.out.println("Idade    = " + a2.getIdade());
    System.out.println("Nota 1   = " + a2.getNota1());
    System.out.println("Nota 2   = " + a2.getNota2());
    System.out.println("Media    = " + a2.media());
    System.out.println("Situacao = " + a2.situacao());
    System.out.println();
  }
}//TestaAlunoB1.