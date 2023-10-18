//----------------------------------
class ConstrutorA {
  public static void main(String[] args){
    PaiA1 p1  = new PaiA1();
    PaiA2 p2  = new PaiA2();
    PaiA3 p3a = new PaiA3();
    PaiA3 p3b = new PaiA3(10);
    PaiA4 p4  = new PaiA4(10);
    FilhoA1 f1 = new FilhoA1();
  }
}

//Classe sem construtor. O compilador criar� um construtor padr�o, 
//que chamar� o construtor padr�o da superclasse (Object).
class PaiA1 {
  int i;
}

//Classe com um construtor padr�o.
class PaiA2 {
  int i;
  
  public PaiA2() {
  }
}

//Classe com dois construtores.
class PaiA3 {
  int i;
  
  public PaiA3() {
  }
  
  public PaiA3(int x) {
    i = x;
  }
}

class PaiA4 {
  int i;
  
  public PaiA4(int x) {
    i = x;
  }
}

/*  A classe Filho1 n�o possui nenhum construtor, logo,
  o compilador cria um construtor default sem par�metros, que tentar� chamar
  o construtor default (sem par�metros) da superclasse (Pai1). 
  Como a classe Pai1 n�o possui nenhum construtor, 
  o compilador cria o construtor default para ela 
  e tentar� chamar o construtor default da sua superclasse (Object), que existe. */  
class FilhoA1 extends PaiA1 {
}