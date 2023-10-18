import java.util.Scanner;

public class TestaAlunoC5{
  public static void main(String[] args) {

    //Objeto para ler do teclado.
    Scanner teclado = new Scanner(System.in);
       
    //Cria objeto aluno.
    AlunoC   a = new AlunoC();
  
    //Le e atribui dados ao aluno.
    
    //Utiliza uma variável auxiliar:
    System.out.print("Digite o nome do aluno: ");
    String nome;
    nome = teclado.nextLine();
    a.setNome(nome);
    
    //Sem utilizar variável auxiliar:
    System.out.print("Digite o sexo do aluno: ");
    a.setSexo(teclado.nextLine().charAt(0));
    
    System.out.print("Digite a idade do aluno: ");
    a.setIdade(teclado.nextInt());
    teclado.nextLine();
    
    System.out.print("Digite a primeira nota: ");
    a.setNota1(teclado.nextFloat());
    teclado.nextLine();
    
    System.out.print("Digite a segunda nota : ");
    a.setNota2(teclado.nextFloat());
    teclado.nextLine();
    
    //Mostra resultados.
    System.out.println();
    a.mostraDados();    
  }//main()
  
}//TestaAlunoC5.