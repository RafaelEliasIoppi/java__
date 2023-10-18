/* Exemplo de uma classe para demonstrar os seguintes conceitos:
  - especificador de visibilidade private
  - getters e setters
  - método construtor
*/
public class AlunoB {

  //=============== Atributos de Instância ==========================
  private String nome;  
  private char   sexo;  //M ou F
  private int    idade; //maior que zero
  private float  nota1; //entre 0 e 10
  private float  nota2; //entre 0 e 10
  
  //=================================================================
  //===================== Método Construtor =========================
  //=================================================================
  public AlunoB() {
    nome  = "-----";
    sexo  = '-';
    idade = 0; //Valor default. Não é necessário.
    nota1 = 0; //Valor default. Não é necessário.
    nota2 = 0; //Valor default. Não é necessário.
  }//AlunoB()

  //=================================================================
  //===================== Métodos de Instância ======================
  //=================================================================
    
  //-------------------------------------------------------
  //Método: setNome()
  //Atribui o nome. Não deixa atribuir um nome vazio.
  //-------------------------------------------------------
  public void setNome(String n) {
    if (n.length() > 0 ) {
      nome = n;
    }
  }//setNome()

  //-------------------------------------------------------
  //Método: getNome()
  //Retorna o nome.
  //------------------------------------------------------- 
  public String getNome() {
    return nome;
  }//getNome()
  
  //-------------------------------------------------------
  //Método: setSexo()
  //Atribui o sexo. 
  //Não deixa atribuir um valor diferente de 'M' ou 'F'.
  //-------------------------------------------------------
  public void setSexo(char s) {
    if ((s=='M') || (s=='F')) {
      sexo = s;
    }
  }//setSexo()
  
  //-------------------------------------------------------
  //Método: getSexo()
  //Retorna o sexo.
  //-------------------------------------------------------
  public char getSexo() {
    return sexo;
  }//getSexo()

  //-------------------------------------------------------
  //Método: setIdade()
  //Atribui a idade. Não deixa atribuir uma idade negativa.
  //-------------------------------------------------------
  public void setIdade(int i) {
    if (i > 0 ) {
      idade = i;
    }
  }//setIdade()
  
  //-------------------------------------------------------
  //Método: getIdade()
  //Retorna a idade.
  //-------------------------------------------------------
  public int getIdade() {
    return idade;
  }//getIdade()
  
  //-------------------------------------------------------
  //Método: setNota1()
  //Atribui a nota1. 
  //Não deixa atribuir uma nota inválida.
  //-------------------------------------------------------
  public void setNota1(float f) {
    if ((f >= 0) && (f <= 10)) {
      nota1 = f;
    }
  }//setNota1()

  //-------------------------------------------------------
  //Método: getNota1()
  //Retorna a nota1.  
  //-------------------------------------------------------
  public float getNota1() {
    return nota1;
  }//getNota1()

  //-------------------------------------------------------
  //Método: setNota2()
  //Atribui a nota2. 
  //Não deixa atribuir uma nota inválida.
  //-------------------------------------------------------
  public void setNota2(float f) {
    if ((f >= 0) && (f <= 10)) {
       nota2 = f;
    }
  }//setNota2()

  //-------------------------------------------------------
  //Método: getNota2()
  //Retorna a nota2.  
  //-------------------------------------------------------
  public float getNota2() {
    return nota2;
  }//getNota2()
  
  //-------------------------------------------------------
  //Método: media()
  //Calcula e retorna a média aritmética das notas 1 e 2.
  //-------------------------------------------------------
  public float media() {
    return (nota1 + nota2) / 2;
  }//media()
  
  //-------------------------------------------------------
  //Método: situacao()
  //Calcula a média aritmética das notas 1 e 2 e retorna a situação do aluno.
  //Media        - Situacao
  //(< 3)        - Reprovado        
  //(>=3 E <  7) - Recuperacao      
  //(>=7 E <  9) - Aprovado - Bom   
  //(>=9 E <=10) - Aprovado - Otimo 
  //-------------------------------------------------------
  //--- Situacao ---
  public String situacao() {
    if (media() < 3 ) {
      return "Reprovado";
    }
    else {
      if (media() < 7 ) {
        return "Recuperacao";
      }
      else {
        if (media() < 9 ) {
          return "Aprovado - Bom";
        }
        else {
          return "Aprovado - Otimo";
        }
      }
    }
  }//situacao()

  //-------------------------------------------------------
  //Método: toString()
  //Retorna uma String com uma descrição textual do objeto.
  //-------------------------------------------------------
  public String toString() {  
    return "Nome=" + nome +
           ", Sexo=" + sexo +
           ", Idade=" + idade +
           ", Nota1=" + nota1 +
           ", Nota2=" + nota2;
  }//toString()

  //-------------------------------------------------------
  //Método: mostraDados()
  //Mostra na tela todas as informações do aluno.
  //-------------------------------------------------------
  public void mostraDados() {  
    System.out.println("Nome     = " + nome);
    System.out.println("Sexo     = " + sexo);
    System.out.println("Idade    = " + idade);
    System.out.println("Nota 1   = " + nota1);
    System.out.println("Nota 2   = " + nota2);
    System.out.println("Media    = " + media());
    System.out.println("Situacao = " + situacao());
  }//mostraDados()
  
}//AlunoB.