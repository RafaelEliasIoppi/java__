//----------------------------------
class ConstrutorB {
  public static void main(String[] args){
    FilhoB f1 = new FilhoB(5, 6, 7);
    FilhoB f2 = new FilhoB(6, 7, 'A');
    PaiB   p = new PaiB(10);
    
    System.out.println("Valores de f1:");
    System.out.println(f1.i);
    System.out.println(f1.j);
    System.out.println(f1.k);
    System.out.println(f1.m);
    System.out.println();
    
    System.out.println("Valores de f2:");
    System.out.println(f2.i);
    System.out.println(f2.j);
    System.out.println(f2.k);
    System.out.println(f2.m);
  }
}//ConstrutorB.

//----------------------------------
class PaiB {
  int i;
  
  public PaiB() {
    this.i = 99;
  }
  
  //construtor com um parâmetro.
  public PaiB(int v) {    
    this.i = v;
  }
}//PaiB.

//----------------------------------
class FilhoB extends PaiB {
  int j;
  int k;
  char m;
  
  public FilhoB(int i1, int j1, int k1) {
    //Chamando explicitamente um construtor da superclasse.
    //Tem que ser a primeira linha de código do método.
    super(i1);
    this.j = j1;
    this.k = k1;
    this.m = 'X';
  }
  
  public FilhoB(int j1, int k1, char m1) {  
    //Automaticamente chamará o construtor padrão Pai()
    //da super classe 
    this.j = j1;
    this.k = k1;
    this.m = m1;
  }
  
}//FilhoB.