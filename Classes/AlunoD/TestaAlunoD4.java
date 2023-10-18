import java.util.Scanner;

public class TestaAlunoD4{
  public static void main(String[] args) {

    //Objeto para ler do teclado.
    Scanner teclado = new Scanner(System.in);
    
    //Variaveis auxiliares
    String n; //nome
    int    i; //idade
    char   s; //sexo
    float  n1, n2; //nota 1 e nota 2.
    
    AlunoD  a;              //objeto Aluno (variavel auxiliar).    
    AlunoD  alunos[];       //Array de objetos Aluno.
    alunos = new AlunoD[3]; //Cria o Array com 3 posições. Os objetos Aluno não são criados.
      
    //Le os dados para 3 alunos.       
    for (int k=0; k<3; k++) {
      System.out.println();

      //Le os dados.      
      System.out.print("Digite o nome do aluno: ");
      n = teclado.nextLine();
      
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
      a = new AlunoD(n, s, i);
      a.setNota1(n1);
      a.setNota2(n2);
      
      //Adicona o aluno no Array.
      alunos[k] = a;      
    } //laço for para ler dados
       
    System.out.println("====================== Resultados ====================");   
    //Mostra os dados de todos os alunos.
    for (int j=0; j<3; j++) {
      a = alunos[j];
      a.mostraDados();
      //alunos[j].mostraDados();
      System.out.println();
    } //laço for para mostrar valores    
    
  }//main()
  
}//TestaAlunoD4.