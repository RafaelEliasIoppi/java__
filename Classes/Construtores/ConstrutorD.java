/* Compila:

  A classe Filho não possui um construtor, logo,
  o compilador cria um construtor default sem parâmetros, que tentará chamar
  o construtor sem parâmetros da superclasse (Pai). Como essa
  classe possui o construtor defaul, o código compila sem erros. */

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
  
  //construtor com um parâmetro.
  public PaiD(int v) {
    i = v;
  }
}

//----------------------------------
class FilhoD extends PaiD {
}