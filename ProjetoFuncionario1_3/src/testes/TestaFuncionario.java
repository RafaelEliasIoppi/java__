package testes;

import dominio.Funcionario;
import dominio.Residencia;
import telas.telafuncionario;

public class TestaFuncionario {



	public static void main(String[] args) {
	 
        Funcionario a1, a2;	
        telafuncionario tela1, tela2;
        Residencia r1;
        
        r1 = new Residencia("General Pontes, ", 100);
    	a1 = new Funcionario("---", r1);
    	a2= new Funcionario("----",r1);
      	tela1 = new telafuncionario(a1,r1);
      	tela2 = new telafuncionario(a2,r1);
		
		
		tela1.leNome();
		tela1.imprime();
		tela2.leNome();
		tela2.imprime();
		
		if (a1 == a2) {// teste para verificar referencias
		      System.out.println("r1 e r2 sao o mesmo objeto.");
		    }
		    else {
		      System.out.println("r1 e r2 NAO sao o mesmo objeto.");
		    }
		   
		
		
	}



}
