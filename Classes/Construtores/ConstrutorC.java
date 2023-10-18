/* Compila:
  
  A classe Neto não possui um construtor, logo,
  o compilador cria um construtor default sem parâmetros, que tentará chamar
  o construtor defaul (sem parâmetros) da super classe (Filho). 
  Como a classe Filho não possui nenhum construtor, 
  o compilador cria o construtor default para ela
  e tentará chamar o construtor default da sua superclasse (Pai).
  Como a classe Pai não possui nenhum um construtor, 
  o compilador cria o construtor default para ela 
  e tentará chamar o construtor default da sua superclasse (Object), que existe.
  
*/
class ConstrutorC {
  public static void main(String[] args){
    NetoC f = new NetoC();
  }
}

class PaiC {
}

class FilhoC extends PaiC {
}

class NetoC extends FilhoC {
}