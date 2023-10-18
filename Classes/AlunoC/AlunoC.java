/* Exemplo de uma classe para demonstrar os seguintes conceitos:
  - atributos de classe e atributos de instância
  - métodos de classe e métodos de instância  
  - constantes (atributos estáticos e finais)
  - palavra chave this
*/
public class AlunoC {

  //============= Atributos de Classe (est�ticos) ===================

  public static String textoReprovado   = "Reprovado";
  public static String textoRecuperacao = "Recuperacao";
  public static String textoAprovBom    = "Aprovado - Bom";
  public static String textoAprovOtimo  = "Aprovado - Otimo";

  private static float notaMinima            = 0;
  private static float notaMinimaRecuperacao = 3.0f;
  private static float notaMinimaAprovBom    = 7.0f;
  private static float notaMinimaAprovOtimo  = 9.0f;
  private static float notaMaxima            = 10;

  //Constantes.  
  public static final char MASCULINO = 'M';
  public static final char FEMININO  = 'F';
  public static final char NAOBINARIO = 'X';

  //=============== Atributos de Inst�ncia ==========================
  private String nome;  
  private char   sexo;  //M ou F
  private int    idade; //maior que zero
  private float  nota1; //entre 0 e 10
  private float  nota2; //entre 0 e 10
  
  //=================================================================
  //===================== M�todo Construtor =========================
  //=================================================================  
  public AlunoC() {
    //Inicializa os atributos do objeto Aluno.
    nome  = "-----";
    sexo  = '-';
    idade = 0;    //N�o � necess�rio (zero j� � o padr�o).
    nota1 = 0.0f; //N�o � necess�rio (zero j� � o padr�o).
    nota2 = 0.0f; //N�o � necess�rio (zero j� � o padr�o).
  }
  
  //=================================================================
  //============== M�todos de Classe (est�ticos) ====================
  //=================================================================

  //-------------------------------------------------------
  //M�todo: getNotaMinima()
  //Retorna o valor da vari�vel de classe notaMinima.
  //-------------------------------------------------------    
  public static float getNotaMinima() {
    return notaMinima;
  }//getNotaMinima()

  //-------------------------------------------------------
  //M�todo: getNotaMinimaRecuperacao()
  //Retorna o valor da vari�vel de classe notaMinimaRecuperacao.
  //-------------------------------------------------------    
  public static float getNotaMinimaRecuperacao() {
    return notaMinimaRecuperacao;
  }//getNotaMinimaRecuperacao()

  //-------------------------------------------------------
  //M�todo: getNotaMinimaAprovBom()
  //Retorna o valor da vari�vel de classe notaMinimaAprovBom.
  //-------------------------------------------------------    
  public static float getNotaMinimaAprovBom() {
    return notaMinimaAprovBom;
  }//getNotaMinimaAprovBom()

  //-------------------------------------------------------
  //M�todo: getNotaMinimaAprovOtimo()
  //Retorna o valor da vari�vel de classe notaMinimaAprovOtimo.
  //-------------------------------------------------------    
  public static float getNotaMinimaAprovOtimo() {
    return notaMinimaAprovOtimo;
  }//getNotaMinimaAprovOtimo()
  
  //-------------------------------------------------------
  //M�todo: getNotaMaxima()
  //Retorna o valor da vari�vel de classe notaMaxima.
  //-------------------------------------------------------    
  public static float getNotaMaxima() {
    return notaMaxima;
  }//getNotaMaxima()

  //-------------------------------------------------------
  //M�todo: setFaixas()
  //Atribui valores para as vari�veis de classe:
  // - notaMinima
  // - notaMinimaRecuperacao 
  // - notaMinimaAprovBom    
  // - notaMinimaAprovOtimo
  // - notaMaxima
  // Aten��o: Este m�todo dever� ser chamado antes de se
  // instanciar qualquer objeto AlunoC. Caso j� tenha
  // sido instanciado algum objeto AlunoC ent�o este
  // m�todo n�o dever� ser chamado, pois poder� tornar
  // inconsistente as notas dos alunos j� instanciados.
  //-------------------------------------------------------    
  public static void setFaixas(float min, float rec, float bom, float ot, float max) {
    if ( (max>ot) && (ot>bom) && (bom>rec) && (rec>min) ) {
      notaMinima            = min;
      notaMinimaRecuperacao = rec;
      notaMinimaAprovBom    = bom;
      notaMinimaAprovOtimo  = ot;
      notaMaxima            = max;
    }
  }//setFaixas()

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
  //Calcula a m�dia aritm�tica das notas 1 e 2 e retorna a situa��o do aluno:
  // - Reprovado        
  // - Recuperacao      
  // - Aprovado - Bom   
  // - Aprovado - Otimo 
  //-------------------------------------------------------
  //--- Situacao ---
  public String situacao() {
    if (this.media() < notaMinimaRecuperacao ) {
      return textoReprovado;
    }
    else {
      if (this.media() < notaMinimaAprovBom ) {
        return textoRecuperacao;
      }
      else {
        if (this.media() < notaMinimaAprovOtimo ) {
          return textoAprovBom;
        }
        else {
          return textoAprovOtimo;
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
  
}//AlunoC.