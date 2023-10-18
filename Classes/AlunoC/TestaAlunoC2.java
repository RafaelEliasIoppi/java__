public class TestaAlunoC2{
  public static void main(String[] args){

    System.out.println("--------- Acessando atributos de Classe ----------");
    System.out.println("textoReprovado   = " + AlunoC.textoReprovado);
    System.out.println("textoRecuperacao = " + AlunoC.textoRecuperacao);
    System.out.println("textoAprovBom    = " + AlunoC.textoAprovBom);
    System.out.println("textoAprovOtimo  = " + AlunoC.textoAprovOtimo);

    System.out.println();
    System.out.println("----- Modificando atributos de classe para -------");
    AlunoC.textoReprovado   = "Voce foi REPROVADO";
    AlunoC.textoRecuperacao = "Voce est� em RECUPERA��O";
    AlunoC.textoAprovBom    = "Voce foi aprovado com BOM";
    AlunoC.textoAprovOtimo  = "Voce foi aprovado com �TIMO";
    
    System.out.println("textoReprovado   = " + AlunoC.textoReprovado);
    System.out.println("textoRecuperacao = " + AlunoC.textoRecuperacao);
    System.out.println("textoAprovBom    = " + AlunoC.textoAprovBom);
    System.out.println("textoAprovOtimo  = " + AlunoC.textoAprovOtimo);
    
    System.out.println();
    System.out.println("--- Chamando m�todos de classe (faixas de notas) ---");
    System.out.println("Nota M�nima            = " + AlunoC.getNotaMinima());
    System.out.println("Nota Min. Recuperacao  = " + AlunoC.getNotaMinimaRecuperacao());    
    System.out.println("Nota Min. Aprov. Bom   = " + AlunoC.getNotaMinimaAprovBom());
    System.out.println("Nota Min. Aprov. Otimo = " + AlunoC.getNotaMinimaAprovOtimo());
    System.out.println("Nota M�xima            = " + AlunoC.getNotaMaxima());

    System.out.println();
    System.out.println("--------- Modificando Faixas de Notas para ---------");
    AlunoC.setFaixas(0, 30, 70, 90, 100);
    System.out.println("Nota M�nima            = " + AlunoC.getNotaMinima());
    System.out.println("Nota Min. Recuperacao  = " + AlunoC.getNotaMinimaRecuperacao());    
    System.out.println("Nota Min. Aprov. Bom   = " + AlunoC.getNotaMinimaAprovBom());
    System.out.println("Nota Min. Aprov. Otimo = " + AlunoC.getNotaMinimaAprovOtimo());
    System.out.println("Nota M�xima            = " + AlunoC.getNotaMaxima());
    
    System.out.println();
    System.out.println("Acessando atributos de Classe finais (constantes):");
    System.out.println("Masculino = " + AlunoC.MASCULINO);
    System.out.println("Feminino  = " + AlunoC.FEMININO);
    
    //Erro de compila��o. N�o � poss�vel modificar um atributo final.
    //AlunoC.MASCULINO = 'H';

    //Declara e instancia objetos.
    AlunoC a1 = new AlunoC();    
    AlunoC a2 = new AlunoC();

    System.out.println();
    System.out.println("****************************************************************");
    System.out.println("Testando objetos");
    System.out.println("****************************************************************");
    System.out.println();

    //N�o utilizar esta forma para acessar membros de classe (est�ticos)!!!
    System.out.println("Nota Maxima = a1.getNotaMaxima() = " + a1.getNotaMaxima());//N�O USAR!!!
    System.out.println();
    
    a1.setNome("Joao");
    a1.setSexo(AlunoC.MASCULINO);     
    a1.setIdade(30);     
    a1.setNota1(60); 
    a1.setNota2(70);

    a2.setNome("Maria");
    a2.setSexo(AlunoC.FEMININO);
    a2.setIdade(20);
    a2.setNota1(90);
    a2.setNota2(100);
   
    a1.mostraDados();
    System.out.println();
    a2.mostraDados();
    System.out.println();
    
  }//main()
}//TestaAlunoC2.