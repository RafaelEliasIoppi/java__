/* Exemplo de uma classe para demonstrar os seguintes conceitos:
  - especificador de visibilidade private
  - getters e setters
  - m�todo construtor
*/
public class AlunoB {

  //=============== Atributos de Inst�ncia ==========================
  private String nome;  
  private char   sexo;  //M ou F
  private int    idade; //maior que zero
  private float  nota1; //entre 0 e 10
  private float  nota2; //entre 0 e 10
  
  //=================================================================
  //===================== M�todo Construtor =========================
  //=================================================================
  public AlunoB() {
    nome  = "-----";
    sexo  = '-';
    idade = 0; //Valor default. N�o � necess�rio.
    nota1 = 0; //Valor default. N�o � necess�rio.
    nota2 = 0; //Valor default. N�o � necess�rio.
  }//AlunoB()

  //=================================================================
  //===================== M�todos de Inst�ncia ======================
  //=================================================================
    
  //-------------------------------------------------------
  //M�todo: setNome()
  //Atribui o nome. N�o deixa atribuir um nome vazio.
  //-------------------------------------------------------
  public void setNome(String n) {
    if (n.length() > 0 ) {
      nome = n;
    }
  }//setNome()

  //-------------------------------------------------------
  //M�todo: getNome()
  //Retorna o nome.
  //------------------------------------------------------- 
  public String getNome() {
    return nome;
  }//getNome()
  
  //-------------------------------------------------------
  //M�todo: setSexo()
  //Atribui o sexo. 
  //N�o deixa atribuir um valor diferente de 'M' ou 'F'.
  //-------------------------------------------------------
  public void setSexo(char s) {
    if ((s=='M') || (s=='F')) {
      sexo = s;
    }
  }//setSexo()
  
  //-------------------------------------------------------
  //M�todo: getSexo()
  //Retorna o sexo.
  //-------------------------------------------------------
  public char getSexo() {
    return sexo;
  }//getSexo()

  //-------------------------------------------------------
  //M�todo: setIdade()
  //Atribui a idade. N�o deixa atribuir uma idade negativa.
  //-------------------------------------------------------
  public void setIdade(int i) {
    if (i > 0 ) {
      idade = i;
    }
  }//setIdade()
  
  //-------------------------------------------------------
  //M�todo: getIdade()
  //Retorna a idade.
  //-------------------------------------------------------
  public int getIdade() {
    return idade;
  }//getIdade()
  
  //-------------------------------------------------------
  //M�todo: setNota1()
  //Atribui a nota1. 
  //N�o deixa atribuir uma nota inv�lida.
  //-------------------------------------------------------
  public void setNota1(float f) {
    if ((f >= 0) && (f <= 10)) {
      nota1 = f;
    }
  }//setNota1()

  //-------------------------------------------------------
  //M�todo: getNota1()
  //Retorna a nota1.  
  //-------------------------------------------------------
  public float getNota1() {
    return nota1;
  }//getNota1()

  //-------------------------------------------------------
  //M�todo: setNota2()
  //Atribui a nota2. 
  //N�o deixa atribuir uma nota inv�lida.
  //-------------------------------------------------------
  public void setNota2(float f) {
    if ((f >= 0) && (f <= 10)) {
       nota2 = f;
    }
  }//setNota2()

  //-------------------------------------------------------
  //M�todo: getNota2()
  //Retorna a nota2.  
  //-------------------------------------------------------
  public float getNota2() {
    return nota2;
  }//getNota2()
  
  //-------------------------------------------------------
  //M�todo: media()
  //Calcula e retorna a m�dia aritm�tica das notas 1 e 2.
  //-------------------------------------------------------
  public float media() {
    return (nota1 + nota2) / 2;
  }//media()
  
  //-------------------------------------------------------
  //M�todo: situacao()
  //Calcula a m�dia aritm�tica das notas 1 e 2 e retorna a situa��o do aluno.
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
  //M�todo: toString()
  //Retorna uma String com uma descri��o textual do objeto.
  //-------------------------------------------------------
  public String toString() {  
    return "Nome=" + nome +
           ", Sexo=" + sexo +
           ", Idade=" + idade +
           ", Nota1=" + nota1 +
           ", Nota2=" + nota2;
  }//toString()

  //-------------------------------------------------------
  //M�todo: mostraDados()
  //Mostra na tela todas as informa��es do aluno.
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