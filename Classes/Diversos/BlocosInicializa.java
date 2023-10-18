/* Exemplo para demonstrar os blocos de inicializa��o (est�ticos e n�o-est�ticos).
*/
class BlocosInicializa {
  public static void main(String[] args){

    System.out.println("----- Vari�veis de Classe, antes de criar um objeto -----");
    System.out.println("a = " + ClasseA.a);
    System.out.println("b = " + ClasseA.b);
    System.out.println("c = " + ClasseA.c);

    System.out.println("----- Vari�veis de Classe ap�s criar um objeto -----");
    ClasseA o = new ClasseA();
    System.out.println("a = " + ClasseA.a);
    System.out.println("b = " + ClasseA.b);
    System.out.println("c = " + ClasseA.c);
    System.out.println("----- Vari�veis do objeto -----");    
    System.out.println("x = " + o.x);
    System.out.println("y = " + o.y);
    System.out.println("z = " + o.z);
    System.out.println("w = " + o.w);	
    System.out.println("h = " + o.h);
  }//main()
}//BlocosInicializa.

/*Sequencia de inicializa��o das vari�veis de classe:
b = 1
a = 10
b = a + 1      >>>>> (b=11)
b = b + 100  >>>>> (b=111)
c = initVarC() >>> (c=1)
*/

/* Ao criar um objeto, ocorrem as seguintes inicializacoes:
x = 10
x = 1 
y = 1
z = b + 1 (z=112)
w = x (w=1)
h = initVarH() (h=1)
y = 10
*/

//---------------------------------------------------
// Classe para demonstrar os blocos de inicializa��o
//---------------------------------------------------
class ClasseA {
	
  ClasseA() {
    //x = 1000;	//� a �ltima atribui��o realizada. 
  }
  
  //Bloco est�tico.
  static {
    b = 1;
  }
  
  //Bloco para inicializar vari�veis de inst�ncia.
  {
    x = 10;
  }
  
  //vari�veis de inst�ncia.
  public int x = 1;
  public int y = 1;
  public int z = b + 1; //z � inicializado com (111 + 1) = 112
  public int w = x; 
  //Vari�vel inicializada pelo m�todo de inst�ncia final initVarH().
  public int h = initVarH(); 
  
  //Cuidado, as vari�veis de classe s�o inicializadas antes das vari�veis de inst�ncia, 
  //n�o importa sua ordem na declara��o da classe. 
  //Elas foram colocadas aqui de propr�sito.
  
  //vari�veis de classe (est�ticas)  
  public static int a = 10; 
  public static int b = a + 1;  
  //Vari�vel inicializada pelo m�todo est�tico initVarC().  
  public static int c = initVarC(); 
  //public static int c = x + 1; //N�o funciona pois x n�o � est�tica.

  //M�todo est�tico para inicializar a vari�vel est�tica C.
  private static int initVarC() {
    return 1;
  }
  
  //M�todo para inicializar vari�vel de inst�ncia. Tem que usar final.
  public final int initVarH() {
    return 1;
  }

  //Outro bloco est�tico.
  static {
    b = b + 100;
  }

  //Outro bloco para inicializar vari�veis de inst�ncia.
  {
  y = 10;
  b = 113; //tamb�m podem ser modificadas vari�veis de classe.
  }
  
}//ClasseA.