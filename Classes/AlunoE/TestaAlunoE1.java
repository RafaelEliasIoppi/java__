public class TestaAlunoE1{
  public static void main(String[] args){
    //Declara objetos.
    AlunoE a1=null;

    System.out.println("****************************************************************");
    System.out.println("Testando objetos, campos, construtores e metodos");
    System.out.println("****************************************************************");
    System.out.println();

    //Tenta instanciar objetos.
    try {
      a1 = new AlunoE("");
      //a1 = new AlunoE("");
      //Atribui valores para a1:
      a1.setSexo(AlunoE.MASCULINO);    
      a1.setIdade(30);     
      a1.setNota1(6);  
      a1.setNota2(7);
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
    
    AlunoE a2 = new AlunoE("Maria", AlunoC.FEMININO, 20);
    //Atribui valores para a2:
    a2.setNota1(9);
    a2.setNota2(10);

    //Mostra dados dos alunos:
    if (a1 != null)
      a1.mostraDados();
    
    System.out.println();
    
    if (a2 != null)
      a2.mostraDados();
  }//main()
  
}//TestaAlunoE1.