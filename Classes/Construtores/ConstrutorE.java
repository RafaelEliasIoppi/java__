/* NÃO COMPILA.
A classe Filho não possui um construtor, logo,
  o compilador cria um construtor default sem parâmetros, que tentará chamar
  o construtor sem parâmetros da superclasse (PaiE), porém, essa 
  classe (PaiE) não possui um construtor sem parâmetros, ela só possui o
  construtor PaiE(int v). Logo será gerado um erro em tempo de compilação: 
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
  //construtor com um parâmetro.
  public PaiE(int v) {
    i = v;
  }
}

/*
class FilhoE extends PaiE {
  //<<<<< neste ponto será gerado um erro.
  //não consegue encontrar o construtor PaiE().
  //cannot find symbol symbol  : constructor PaiE() 
}
*/