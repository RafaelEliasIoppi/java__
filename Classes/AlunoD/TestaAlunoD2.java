import java.util.Scanner;

public class TestaAlunoD2{
  public static void main(String[] args) {

    //Objeto para ler do teclado.
    Scanner teclado = new Scanner(System.in);
    
    //Variaveis auxiliares
    String n; //nome
    char   s; //sexo
    int    i; //idade    
    float  n1, n2; //nota 1 e nota 2.

    //Declara o objeto aluno, mas ainda não instancia ele.
    AlunoD a;
  
    //Le dados do aluno.    
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
    
    System.out.print("Digite a segunda nota : ");
    n2 = teclado.nextFloat();
    teclado.nextLine();
    
    //Instancia o objeto aluno.
    a = new AlunoD(n, s, i);
    //Atribui notas ao aluno (objeto a).
    a.setNota1(n1);
    a.setNota2(n2);
    //Mostra resultados.
    System.out.println();
    a.mostraDados();
  }//main()
  
}//TestaAlunoD2.