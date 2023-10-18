import java.util.Scanner;

public class TestaAlunoH{
  //Objeto para ler do teclado.
  static Scanner teclado;

  public static void main(String[] args) {
    
    //Variaveis auxiliares
    //String n; //nome
    int    i; //idade
    char   s; //sexo
    float  n1, n2; //nota 1 e nota 2.
    
    //Variaveis para controle do laço.
    int    k    = 0;
    char   resp = 'S';    
    
    teclado = new Scanner(System.in);
    
    AlunoH  a;              //objeto Aluno (variavel auxiliar).    
    AlunoH  alunos[];       //Array de objetos Aluno.
    alunos = new AlunoH[100]; //Cria o Array com 100 posições. Os objetos Aluno não são criados.
      
    //Le os dados dos alunos.
    while ( (resp=='S') | (resp=='s') ) {
      a = new AlunoH();
      
      System.out.println();

      //System.out.print("Digite o nome do aluno: ");
      //n = teclado.nextLine();
      leNome(a);
      
      System.out.print("Digite o sexo do aluno: ");
      s = teclado.nextLine().charAt(0);
      
      System.out.print("Digite a idade do aluno: ");
      i = teclado.nextInt();
      teclado.nextLine();
      
      System.out.print("Digite a primeira nota: ");
      n1 = teclado.nextFloat();
      teclado.nextLine();
      
      System.out.print("Digite a segunda nota: ");
      n2 = teclado.nextFloat();
      teclado.nextLine();
    
      //Cria o objeto aluno.
      //a = new AlunoC(n, s, i);
      a.setNota1(n1);
      a.setNota2(n2);
      
      //Adicona o aluno no Array.
      alunos[k] = a;
      k++;
      
      System.out.print("Deseja cadastrar outro aluno (S/N)? ");
      resp = teclado.nextLine().charAt(0);
    } //laço for para ler dados
       
    System.out.println("====================== Resultados ====================");   
    //Mostra os dados de todos os alunos.
    for (int j=0; j<k; j++) {
      a = alunos[j];
      a.mostraDados();
      //alunos[c].mostraDados();
      System.out.println();
    } //laço for para mostrar valores    
    
  }//final do metodo main().
  
  public static void leNome(AlunoH a) {
    while (true) {
      String n;
      System.out.print("Digite o nome do aluno: ");
      n = teclado.nextLine();
      if (a.setNome(n) == 0) {
        return;
      }
    }
  }
  
}//TestaAlunoH.