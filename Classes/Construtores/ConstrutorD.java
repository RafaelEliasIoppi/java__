/* Compila:

  A classe Filho n�o possui um construtor, logo,
  o compilador cria um construtor default sem par�metros, que tentar� chamar
  o construtor sem par�metros da superclasse (Pai). Como essa
  classe possui o construtor defaul, o c�digo compila sem erros. */

//----------------------------------
class ConstrutorD {
  public static void main(String[] args){
    FilhoD f = new FilhoD();
  }
}

//----------------------------------
class PaiD {
  int i;
  
  public PaiD() {
  }
  
  //construtor com um par�metro.
  public PaiD(int v) {
    i = v;
  }
}

//----------------------------------
class FilhoD extends PaiD {
}