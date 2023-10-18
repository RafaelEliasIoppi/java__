/* Exemplo de uma classe para demonstrar os seguintes conceitos:
  - m�todos construtores
  - palavra chave this
  - sobrecarga d� m�todos (overloading)
*/
public class AlunoD {

  //============= Atributos de Classe (est�ticos) ===================
	
  private static float notaMinima            = 0;
  private static float notaMinimaRecuperacao = 3.0f;
  private static float notaMinimaAprovBom    = 7.0f;
  private static float notaMinimaAprovOtimo  = 9.0f;
  private static float notaMaxima            = 10;

  //Constantes.  
  public static final char MASCULINO = 'M';
  public static final char FEMININO  = 'F';
  
  //=============== Atributos de Inst�ncia ==========================
  private String nome;  
  private char   sexo;  //M ou F
  private int    idade; //maior que zero
  private float  nota1; //entre 0 e 10
  private float  nota2; //entre 0 e 10
  
  //=================================================================
  //===================== M�todos Construtores ======================
  //=================================================================
  
  //-------------------------------------------------------
  // Construtor padr�o (default): AlunoD()
  //-------------------------------------------------------
  public AlunoD() {
    //Chama o construtor default da superclasse (Object).
    //N�o � necess�rio, pois o compilador j� o faz por padr�o.
    //Mas se for feito explicitamente, tem que ser a primeira linha do construtor.
    super();
    
    //Inicializa os atributos do objeto Aluno.
    nome  = "-----";
    sexo  = '-';
    idade = 0;    //N�o � necess�rio (zero j� � o padr�o).
    nota1 = 0.0f; //N�o � necess�rio (zero j� � o padr�o).
    nota2 = 0.0f; //N�o � necess�rio (zero j� � o padr�o).
  }

  //-------------------------------------------------------
  // Construtor: AlunoD(String)
  //-------------------------------------------------------
  public AlunoD(String n) {
    //Chama o construtor AlunoC(). Deve ser a primeira linha.
    this();     
    
    //Atribui o nome.
    setNome(n);
    //     nome = n; //N�o recomendado.
    //this.nome = n; //N�o recomendado.
  }

  //-------------------------------------------------------
  // Construtor: AlunoD(String, char)
  //-------------------------------------------------------
  public AlunoD(String n, char s) {
    //Chama o construtor AlunoC(String). Deve ser a primeira linha.
    this(n);
    //Atribui o sexo.
    setSexo(s);    
  }

  //-------------------------------------------------------
  // Construtor: AlunoD(String, char, int)
  //-------------------------------------------------------
  public AlunoD(String n, char s, int i) {
    //Chama o construtor AlunoC(String, char). Deve ser a primeira linha.
    this(n, s);
    //Atribui a idade.    
    setIdade(i);
  }

  //-------------------------------------------------------
  // Construtor: AlunoD(String, char, int, float, float)
  // Esta vers�o do construtor n�o est� aproveitando os
  // construtores anteriormente implementados, fazendo
  // a inicializa��o de todos os atributos no pr�prio construtor.
  //-------------------------------------------------------
  public AlunoD(String n, char s, int i, float n1, float n2) {
    //Lembre que: 
    //Se n�o for chamado explicitamente o construtor da superclasse, o compilador o far�.
    //super(); //Chama o construtor da superclasse (Object). N�o � necess�rio pois j� � o padr�o. 
    
    //Inicializa os atributos do objeto Aluno.
    //Note que n�o est� sendo aproveitado nenhum construtor j� implementado acima.
    setNome(n);
    setSexo(s);
    setIdade(i);
    setNota1(n1);
    setNota2(n2);
  }
  
  //=================================================================
  //===================== M�todos de Inst�ncia ======================
  //=================================================================
    
  //-------------------------------------------------------
  //M�todo: setNome()
  //Atribui o campo nome. N�o deixa atribuir um nome vazio.
  //-------------------------------------------------------
  public void setNome(String nome) {
    if (nome.length() > 0 ) {
      this.nome = nome;
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
  //-------------------------------------------------------
  public void setSexo(char sexo) {
    if ((sexo==MASCULINO) || (sexo==FEMININO)) {
      this.sexo = sexo;
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
  public void setIdade(int idade) {
    if (idade > 0 ) {
      this.idade = idade;
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
  public void setNota1(float nota1) {
    if ((nota1 >= notaMinima) && (nota1 <= notaMaxima)) {
      this.nota1 = nota1;
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
  public void setNota2(float nota2) {
    if ((nota2 >= notaMinima) && (nota2 <= notaMaxima)) {
       this.nota2 = nota2;
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
    return (this.nota1 + this.nota2) / 2;
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
    if (this.media() < notaMinimaRecuperacao ) {
      return "Reprovado";
    }
    else {
      if (this.media() < notaMinimaAprovBom ) {
        return "Recuperacao";
      }
      else {
        if (this.media() < notaMinimaAprovOtimo ) {
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
    return "Nome=" + this.nome +
           ", Sexo=" + this.sexo +
           ", Idade=" + this.idade +
           ", Nota1=" + this.nota1 +
           ", Nota2=" + this.nota2;
  }//toString()  
  
  //-------------------------------------------------------
  //M�todo: mostraDados()
  //Mostra na tela todas as informa��es do aluno.
  //-------------------------------------------------------
  public void mostraDados() {  
    System.out.println("Nome     = " + this.nome);
    System.out.println("Sexo     = " + this.sexo);
    System.out.println("Idade    = " + this.idade);
    System.out.println("Nota 1   = " + this.nota1);
    System.out.println("Nota 2   = " + this.nota2);
    System.out.println("Media    = " + this.media());
    System.out.println("Situacao = " + this.situacao());
  }//mostraDados()
  
}//AlunoD.