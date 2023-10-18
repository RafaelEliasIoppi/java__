/* Exemplo para demonstrar a utilização da classe AlunoB. */
public class TestaAlunoB2{
  public static void main(String[] args) {
    //Objeto para ler do teclado.
    Teclado teclado = new Teclado();
    
    //Variaveis auxiliares
    String n; //nome
    char   s; //sexo
    int    i; //idade    
    float  n1, n2; //nota 1 e nota 2.

    //Cria objeto aluno.
    AlunoB   a = new AlunoB();
  
    //Le dados do aluno.    
    System.out.print("Digite o nome do aluno: ");
    n = teclado.leString();
    
    System.out.print("Digite o sexo do aluno: ");
    s = teclado.leChar();
    
    System.out.print("Digite a idade do aluno: ");
    i = teclado.leInteiro();
    
    System.out.print("Digite a primeira nota: ");
    n1 = teclado.leFloat();
    
    System.out.print("Digite a segunda nota : ");
    n2 = teclado.leFloat();
    
    //Atribui dados ao aluno (objeto a).
    a.setNome(n);
    a.setSexo(s);
    a.setIdade(i);
    a.setNota1(n1);
    a.setNota2(n2);
    
    a.mostraDados();    //Pede para o objeto a1 mostrar seus dados. 
    System.out.println();//Imprime uma linha em branco na saída.
    
    //3 formas diferentes de imprimir a representação textual do objeto a.
    String resultado = a.toString();
    System.out.println(resultado);
    System.out.println(a.toString());
    System.out.println(a);
  }
}//TestaAlunoB2.