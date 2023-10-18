/* Exemplo para demonstrar os blocos de inicialização (estáticos e não-estáticos).
*/
class BlocosInicializa {
  public static void main(String[] args){

    System.out.println("----- Variáveis de Classe, antes de criar um objeto -----");
    System.out.println("a = " + ClasseA.a);
    System.out.println("b = " + ClasseA.b);
    System.out.println("c = " + ClasseA.c);

    System.out.println("----- Variáveis de Classe após criar um objeto -----");
    ClasseA o = new ClasseA();
    System.out.println("a = " + ClasseA.a);
    System.out.println("b = " + ClasseA.b);
    System.out.println("c = " + ClasseA.c);
    System.out.println("----- Variáveis do objeto -----");    
    System.out.println("x = " + o.x);
    System.out.println("y = " + o.y);
    System.out.println("z = " + o.z);
    System.out.println("w = " + o.w);	
    System.out.println("h = " + o.h);
  }//main()
}//BlocosInicializa.

/*Sequencia de inicialização das variáveis de classe:
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
// Classe para demonstrar os blocos de inicialização
//---------------------------------------------------
class ClasseA {
	
  ClasseA() {
    //x = 1000;	//é a última atribuição realizada. 
  }
  
  //Bloco estático.
  static {
    b = 1;
  }
  
  //Bloco para inicializar variáveis de instância.
  {
    x = 10;
  }
  
  //variáveis de instância.
  public int x = 1;
  public int y = 1;
  public int z = b + 1; //z é inicializado com (111 + 1) = 112
  public int w = x; 
  //Variável inicializada pelo método de instância final initVarH().
  public int h = initVarH(); 
  
  //Cuidado, as variáveis de classe são inicializadas antes das variáveis de instância, 
  //não importa sua ordem na declaração da classe. 
  //Elas foram colocadas aqui de proprósito.
  
  //variáveis de classe (estáticas)  
  public static int a = 10; 
  public static int b = a + 1;  
  //Variável inicializada pelo método estático initVarC().  
  public static int c = initVarC(); 
  //public static int c = x + 1; //Não funciona pois x não é estática.

  //Método estático para inicializar a variável estática C.
  private static int initVarC() {
    return 1;
  }
  
  //Método para inicializar variável de instância. Tem que usar final.
  public final int initVarH() {
    return 1;
  }

  //Outro bloco estático.
  static {
    b = b + 100;
  }

  //Outro bloco para inicializar variáveis de instância.
  {
  y = 10;
  b = 113; //também podem ser modificadas variáveis de classe.
  }
  
}//ClasseA.