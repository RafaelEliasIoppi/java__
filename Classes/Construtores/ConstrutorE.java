/* N�O COMPILA.
A classe Filho n�o possui um construtor, logo,
  o compilador cria um construtor default sem par�metros, que tentar� chamar
  o construtor sem par�metros da superclasse (PaiE), por�m, essa 
  classe (PaiE) n�o possui um construtor sem par�metros, ela s� possui o
  construtor PaiE(int v). Logo ser� gerado um erro em tempo de compila��o: 
    cannot find symbol symbol  : constructor PaiE()
*/

//----------------------------------
class ConstrutorE {
  public static void main(String[] args){
    //FilhoE f = new FilhoE();
  }
}

//----------------------------------
class PaiE {
  int i;
  //construtor com um par�metro.
  public PaiE(int v) {
    i = v;
  }
}

/*
class FilhoE extends PaiE {
  //<<<<< neste ponto ser� gerado um erro.
  //n�o consegue encontrar o construtor PaiE().
  //cannot find symbol symbol  : constructor PaiE() 
}
*/