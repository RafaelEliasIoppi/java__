/* Exemplo para demonstrar a utilização da classe AlunoB. */
public class TestaAlunoB1{
  public static void main(String[] args){
    //Declara e instancia objetos.
    AlunoB a1 = new AlunoB();
    AlunoB a2 = new AlunoB();

    System.out.println("****************************************************************");
    System.out.println("Testando objetos, atributos, construtores e metodos");
    System.out.println("****************************************************************");
    System.out.println();
    
    //Mostra dados do objeto recém criado (a1).
    System.out.println("Mostra dados do objeto recém criado (a1):");
    //Erro de compilação. O atributo nome não está visível (acessível)
    //pois foi declarado como privado (private).
    //Só estão visíveis os métodos assessores.
    //System.out.println("Nome     = " + a1.nome);
    System.out.println("Nome     = " + a1.getNome());
    System.out.println("Sexo     = " + a1.getSexo());
    System.out.println("Idade    = " + a1.getIdade());
    System.out.println("Nota 1   = " + a1.getNota1());
    System.out.println("Nota 2   = " + a1.getNota2());
    System.out.println("Media    = " + a1.media());
    System.out.println("Situacao = " + a1.situacao());
    System.out.println();

    //Mostra dados do objeto recém criado (a2).
    System.out.println("Mostra dados do objeto recém criado (a2):");
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
    //a1.sexo = 'M'; //<<< erro de compilação. sexo é um campo privado.
    a1.setSexo('M'); //tente colocar 'x'. Não irá atribuir.    
    a1.setIdade(30); //tente atribuir uma idade negativa. Não irá atribuir.    
    a1.setNota1(6);  //tente colocar uma nota inválida. Não irá atribuir.
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