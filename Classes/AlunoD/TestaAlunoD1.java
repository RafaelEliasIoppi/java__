public class TestaAlunoD1{
  public static void main(String[] args){
    //Declara e instancia objetos.
    AlunoD a1 = new AlunoD("Joao");    
    AlunoD a2 = new AlunoD("Maria", AlunoC.FEMININO, 20);

    System.out.println("****************************************************************");
    System.out.println("Testando objetos, campos, construtores e metodos");
    System.out.println("****************************************************************");
    System.out.println();

    //Atribui valores para a1:
    a1.setSexo(AlunoC.MASCULINO);    
    a1.setIdade(30);     
    a1.setNota1(6);  
    a1.setNota2(7);

    //Atribui valores para a2:
    a2.setNota1(9);
    a2.setNota2(10);

    //Mostra dados dos alunos:
    a1.mostraDados();
    System.out.println();
    a2.mostraDados();
  }//main()
  
}//TestaAlunoD1.