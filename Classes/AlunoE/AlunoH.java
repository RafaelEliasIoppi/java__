/*
  Exemplo de uma classe para demonstrar os seguintes conceitos:
  - atributos de classe e atributos de instância
  - métodos de classe de métodos de instância  
  - constantes
  - métodos construtores
  - sobrecarga dé métodos (overloading)
*/
public class AlunoH {

  //=============== Atributos de Classe =============================
  private static int totalAlunos;
  
  //Constantes.
  public static final int MAX_ALUNOS = 100;
  public static final float NOTA_MIN_RECUPERACAO     = 3.0f;
  public static final float NOTA_MIN_APROVACAO_BOM   = 7.0f;
  public static final float NOTA_MIN_APROVACAO_OTIMO = 9.0f;
  
  
  //=============== Atributos de Instância ==========================
  private String nome;  
  private char   sexo;  //M ou F
  private int    idade; //maior que zero
  private float  nota1; //entre 0 e 10
  private float  nota2; //entre 0 e 10
  
  //=================================================================
  //===================== Métodos Construtores ======================
  //=================================================================  
  public AlunoH() {
    nome  = "Indefinido";
    sexo  = 'M';
    idade = 18;
    if (totalAlunos < MAX_ALUNOS) {
      totalAlunos++;
    }
    else {
      throw new RuntimeException("Número máximo de alunos atingido.");
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
  //===================== Métodos de Classe =========================
  //=================================================================
  
  //-------------------------------------------------------
  //Método: getTotalAlunos()
  //Retorna o valor da variável de classe totalAlunos, que
  //contém a quantidade de objetos alunos já instanciados.
  //-------------------------------------------------------    
  public static int getTotalAlunos() {
    return totalAlunos;
  }

  //=================================================================
  //===================== Métodos de Instância ======================
  //=================================================================
    
  //-------------------------------------------------------
  //Método: setNome()
  //Atribui o campo nome. Não deixa atribuir um nome vazio.
  //-------------------------------------------------------
  public int setNome(String n) {
    if (n.length() > 0 ) {
      this.nome = n;
      return 0; //ok
    }
    else {
      return 1; //valor inválido
    }
  }

  //-------------------------------------------------------
  //Método: getNome()
  //Retorna o campo nome.
  //------------------------------------------------------- 
  public String getNome() {
    return this.nome;
  }
  
  //-------------------------------------------------------
  //Método: setSexo()
  //Atribui o campo sexo. 
  //Não deixa atribuir um valor diferente de 'M' ou 'F'.
  //Retorno:
  // 0 - Valor atribuído.
  // 1 - Erro. Valor inválido.
  //-------------------------------------------------------
  public int setSexo(char s) {
    if ((s=='M') || (s=='F')) {
      this.sexo = s;
      return 0; //ok
    }
    else {
      return 1; //valor inválido
    }    
  }
  
  //-------------------------------------------------------
  //Método: getSexo()
  //Retorna o campo sexo.
  //-------------------------------------------------------
  public char getSexo() {
    return this.sexo;
  }

  //-------------------------------------------------------
  //Método: setIdade()
  //Atribui o campo idade. Não deixa atribuir uma idade negativa.
  //-------------------------------------------------------
  public int setIdade(int i) {
    if (i > 0 ) {
      this.idade = i;
      return 0; //ok
    }
    else {
      return 1; //valor inválido
    }
  }
  
  //-------------------------------------------------------
  //Método: getIdade()
  //Retorna o campo idade.
  //-------------------------------------------------------
  public int getIdade() {
    return this.idade;
  }
  
  //-------------------------------------------------------
  //Método: setNota1()
  //Atribui o campo nota1. 
  //Não deixa atribuir uma nota inválida.
  //-------------------------------------------------------
  public int setNota1(float f) {
    if ((f >= 0) && (f <= 10)) {
      this.nota1 = f;
      return 0; //ok
    }
    else {
      return 1; //valor inválido
    }
  }

  //-------------------------------------------------------
  //Método: getNota1()
  //Retorna o campo nota1.  
  //-------------------------------------------------------
  public float getNota1() {
    return this.nota1;
  }

  //-------------------------------------------------------
  //Método: setNota2()
  //Atribui o campo nota2. 
  //Não deixa atribuir uma nota inválida.
  //-------------------------------------------------------
  public int setNota2(float f) {
    if ((f >= 0) && (f <= 10)) {
       this.nota2 = f;
       return 0; //ok
    }
    else {
      return 1; //valor inválido
    }
  }

  //-------------------------------------------------------
  //Método: getNota2()
  //Retorna o campo nota2.  
  //-------------------------------------------------------
  public float getNota2() {
    return this.nota2;
  }
  
  //-------------------------------------------------------
  //Método: media()
  //Calcula e retorna a média aritmética das notas 1 e 2.
  //-------------------------------------------------------
  public float media() {
    return (nota1 + nota2) / 2;
  }
  
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
  }

  //-------------------------------------------------------
  //Método: descreveDados()
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