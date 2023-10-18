/*
  Exemplo de uma classe para demonstrar os seguintes conceitos:
  - atributos de classe e atributos de inst�ncia
  - m�todos de classe de m�todos de inst�ncia  
  - constantes
  - m�todos construtores
  - sobrecarga d� m�todos (overloading)
*/
public class AlunoH {

  //=============== Atributos de Classe =============================
  private static int totalAlunos;
  
  //Constantes.
  public static final int MAX_ALUNOS = 100;
  public static final float NOTA_MIN_RECUPERACAO     = 3.0f;
  public static final float NOTA_MIN_APROVACAO_BOM   = 7.0f;
  public static final float NOTA_MIN_APROVACAO_OTIMO = 9.0f;
  
  
  //=============== Atributos de Inst�ncia ==========================
  private String nome;  
  private char   sexo;  //M ou F
  private int    idade; //maior que zero
  private float  nota1; //entre 0 e 10
  private float  nota2; //entre 0 e 10
  
  //=================================================================
  //===================== M�todos Construtores ======================
  //=================================================================  
  public AlunoH() {
    nome  = "Indefinido";
    sexo  = 'M';
    idade = 18;
    if (totalAlunos < MAX_ALUNOS) {
      totalAlunos++;
    }
    else {
      throw new RuntimeException("N�mero m�ximo de alunos atingido.");
    }    
  }
  
  public AlunoH(String n) {
    this();
    nome = n;
    //this.nome = n;
    //setNome(n);
  }

  public AlunoH(String n, char s) {
    this(n);
    sexo = s;
    //this.sexo = s;
    //setSexo(s); 
  }

  public AlunoH(String n, char s, int i) {
    this(n, s);
    idade = i;
    //this.idade = i;
    //setIdade(i);    
  }
  
  //=================================================================
  //===================== M�todos de Classe =========================
  //=================================================================
  
  //-------------------------------------------------------
  //M�todo: getTotalAlunos()
  //Retorna o valor da vari�vel de classe totalAlunos, que
  //cont�m a quantidade de objetos alunos j� instanciados.
  //-------------------------------------------------------    
  public static int getTotalAlunos() {
    return totalAlunos;
  }

  //=================================================================
  //===================== M�todos de Inst�ncia ======================
  //=================================================================
    
  //-------------------------------------------------------
  //M�todo: setNome()
  //Atribui o campo nome. N�o deixa atribuir um nome vazio.
  //-------------------------------------------------------
  public int setNome(String n) {
    if (n.length() > 0 ) {
      this.nome = n;
      return 0; //ok
    }
    else {
      return 1; //valor inv�lido
    }
  }

  //-------------------------------------------------------
  //M�todo: getNome()
  //Retorna o campo nome.
  //------------------------------------------------------- 
  public String getNome() {
    return this.nome;
  }
  
  //-------------------------------------------------------
  //M�todo: setSexo()
  //Atribui o campo sexo. 
  //N�o deixa atribuir um valor diferente de 'M' ou 'F'.
  //Retorno:
  // 0 - Valor atribu�do.
  // 1 - Erro. Valor inv�lido.
  //-------------------------------------------------------
  public int setSexo(char s) {
    if ((s=='M') || (s=='F')) {
      this.sexo = s;
      return 0; //ok
    }
    else {
      return 1; //valor inv�lido
    }    
  }
  
  //-------------------------------------------------------
  //M�todo: getSexo()
  //Retorna o campo sexo.
  //-------------------------------------------------------
  public char getSexo() {
    return this.sexo;
  }

  //-------------------------------------------------------
  //M�todo: setIdade()
  //Atribui o campo idade. N�o deixa atribuir uma idade negativa.
  //-------------------------------------------------------
  public int setIdade(int i) {
    if (i > 0 ) {
      this.idade = i;
      return 0; //ok
    }
    else {
      return 1; //valor inv�lido
    }
  }
  
  //-------------------------------------------------------
  //M�todo: getIdade()
  //Retorna o campo idade.
  //-------------------------------------------------------
  public int getIdade() {
    return this.idade;
  }
  
  //-------------------------------------------------------
  //M�todo: setNota1()
  //Atribui o campo nota1. 
  //N�o deixa atribuir uma nota inv�lida.
  //-------------------------------------------------------
  public int setNota1(float f) {
    if ((f >= 0) && (f <= 10)) {
      this.nota1 = f;
      return 0; //ok
    }
    else {
      return 1; //valor inv�lido
    }
  }

  //-------------------------------------------------------
  //M�todo: getNota1()
  //Retorna o campo nota1.  
  //-------------------------------------------------------
  public float getNota1() {
    return this.nota1;
  }

  //-------------------------------------------------------
  //M�todo: setNota2()
  //Atribui o campo nota2. 
  //N�o deixa atribuir uma nota inv�lida.
  //-------------------------------------------------------
  public int setNota2(float f) {
    if ((f >= 0) && (f <= 10)) {
       this.nota2 = f;
       return 0; //ok
    }
    else {
      return 1; //valor inv�lido
    }
  }

  //-------------------------------------------------------
  //M�todo: getNota2()
  //Retorna o campo nota2.  
  //-------------------------------------------------------
  public float getNota2() {
    return this.nota2;
  }
  
  //-------------------------------------------------------
  //M�todo: media()
  //Calcula e retorna a m�dia aritm�tica das notas 1 e 2.
  //-------------------------------------------------------
  public float media() {
    return (nota1 + nota2) / 2;
  }
  
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
    if (media() < NOTA_MIN_RECUPERACAO ) {
      return "Reprovado";
    }
    else {
      if (media() < NOTA_MIN_APROVACAO_BOM ) {
        return "Recuperacao";
      }
      else {
        if (media() < NOTA_MIN_APROVACAO_OTIMO ) {
          return "Aprovado - Bom";
        }
        else {
          return "Aprovado - Otimo";
        }
      }
    }
  }

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
  }

  //-------------------------------------------------------
  //M�todo: descreveDados()
  //Retorna uma String formatada com todos os dados do objeto.
  //-------------------------------------------------------
  public String descreveDados() {  
    return "Nome     = " + nome +
           "\nSexo     = " + sexo +
           "\nIdade    = " + idade +
           "\nNota 1   = " + nota1 +
           "\nNota 2   = " + nota2 +
           "\nMedia    = " + media() +
           "\nSituacao = " + situacao();
  }
  
}//AlunoH.