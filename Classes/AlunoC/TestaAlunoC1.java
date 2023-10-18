public class TestaAlunoC1{
  public static void main(String[] args){
    //Declara e instancia objetos.
    AlunoC a1 = new AlunoC();    
    AlunoC a2 = new AlunoC();

    System.out.println("****************************************************************");
    System.out.println("Testando constantes (atributos estáticos e finais)");
    System.out.println("****************************************************************");
    System.out.println();
    
    a1.setNome("Joao");
    a1.setSexo(AlunoC.MASCULINO);     
    a1.setIdade(30);     
    a1.setNota1(6);  
    a1.setNota2(7);

    a2.setNome("Maria");
    a2.setSexo(AlunoC.FEMININO);
    a2.setIdade(20);
    a2.setNota1(9);
    a2.setNota2(10);
   
    a1.mostraDados();
    System.out.println();
    a2.mostraDados();
    System.out.println();
  }//main()
}//TestaAlunoC1.