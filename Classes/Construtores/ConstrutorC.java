/* Compila:
  
  A classe Neto n�o possui um construtor, logo,
  o compilador cria um construtor default sem par�metros, que tentar� chamar
  o construtor defaul (sem par�metros) da super classe (Filho). 
  Como a classe Filho n�o possui nenhum construtor, 
  o compilador cria o construtor default para ela
  e tentar� chamar o construtor default da sua superclasse (Pai).
  Como a classe Pai n�o possui nenhum um construtor, 
  o compilador cria o construtor default para ela 
  e tentar� chamar o construtor default da sua superclasse (Object), que existe.
  
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