/* Exemplo de uma classe para demonstrar os seguintes conceitos:
  - métodos construtores
  - palavra chave this
  - sobrecarga dé métodos (overloading)
*/
public class AlunoD {

  //============= Atributos de Classe (estáticos) ===================
	
  private static float notaMinima            = 0;
  private static float notaMinimaRecuperacao = 3.0f;
  private static float notaMinimaAprovBom    = 7.0f;
  private static float notaMinimaAprovOtimo  = 9.0f;
  private static float notaMaxima            = 10;

  //Constantes.  
  public static final char MASCULINO = 'M';
  public static final char FEMININO  = 'F';
  
  //=============== Atributos de Instância ==========================
  private String nome;  
  private char   sexo;  //M ou F
  private int    idade; //maior que zero
  private float  nota1; //entre 0 e 10
  private float  nota2; //entre 0 e 10
  
  //=================================================================
  //===================== Métodos Construtores ======================
  //=================================================================
  
  //-------------------------------------------------------
  // Construtor padrão (default): AlunoD()
  //-------------------------------------------------------
  public AlunoD() {
    //Chama o construtor default da superclasse (Object).
    //Não é necessário, pois o compilador já o faz por padrão.
    //Mas se for feito explicitamente, tem que ser a primeira linha do construtor.
    super();
    
    //Inicializa os atributos do objeto Aluno.
    nome  = "-----";
    sexo  = '-';
    idade = 0;    //Não é necessário (zero já é o padrão).
    nota1 = 0.0f; //Não é necessário (zero já é o padrão).
    nota2 = 0.0f; //Não é necessário (zero já é o padrão).
  }

  //-------------------------------------------------------
  // Construtor: AlunoD(String)
  //-------------------------------------------------------
  public AlunoD(String n) {
    //Chama o construtor AlunoC(). Deve ser a primeira linha.
    this();     
    
    //Atribui o nome.
    setNome(n);
    //     nome = n; //Não recomendado.
    //this.nome = n; //Não recomendado.
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
  // Esta versão do construtor não está aproveitando os
  // construtores anteriormente implementados, fazendo
  // a inicialização de todos os atributos no próprio construtor.
  //-------------------------------------------------------
  public AlunoD(String n, char s, int i, float n1, float n2) {
    //Lembre que: 
    //Se não for chamado explicitamente o construtor da superclasse, o compilador o fará.
    //super(); //Chama o construtor da superclasse (Object). Não é necessário pois já é o padrão. 
    
    //Inicializa os atributos do objeto Aluno.
    //Note que não está sendo aproveitado nenhum construtor já implementado acima.
    setNome(n);
    setSexo(s);
    setIdade(i);
    setNota1(n1);
    setNota2(n2);
  }
  
  //=================================================================
  //===================== Métodos de Instância ======================
  //=================================================================
    
  //-------------------------------------------------------
  //Método: setNome()
  //Atribui o campo nome. Não deixa atribuir um nome vazio.
  //-------------------------------------------------------
  public void setNome(String nome) {
    if (nome.length() > 0 ) {
      this.nome = nome;
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
  //-------------------------------------------------------
  public void setSexo(char sexo) {
    if ((sexo==MASCULINO) || (sexo==FEMININO)) {
      this.sexo = sexo;
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
  public void setIdade(int idade) {
    if (idade > 0 ) {
      this.idade = idade;
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
  public void setNota1(float nota1) {
    if ((nota1 >= notaMinima) && (nota1 <= notaMaxima)) {
      this.nota1 = nota1;
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
  public void setNota2(float nota2) {
    if ((nota2 >= notaMinima) && (nota2 <= notaMaxima)) {
       this.nota2 = nota2;
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
    return (this.nota1 + this.nota2) / 2;
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
  //Método: toString()
  //Retorna uma String com uma descrição textual do objeto.
  //-------------------------------------------------------
  public String toString() {  
    return "Nome=" + this.nome +
           ", Sexo=" + this.sexo +
           ", Idade=" + this.idade +
           ", Nota1=" + this.nota1 +
           ", Nota2=" + this.nota2;
  }//toString()  
  
  //-------------------------------------------------------
  //Método: mostraDados()
  //Mostra na tela todas as informações do aluno.
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