package telas;

import java.util.Scanner;

import dominio.Funcionario;

import dominio.Residencia;



	public class telafuncionario {

	 public telafuncionario(Funcionario a, Residencia b) { // construtor que define: o funcionario e uma residencia
		    setFuncionario(a);
		    setResidencia(b);
		  }
	 	 
	 
	private Funcionario funcionario; // atributo que faz referência ao objeto funcionario
	private Residencia residencia; // atributo que faz referência ao objeto residencia

    private  Scanner scan = new Scanner(System.in);//Atributo para fazer leitura pelo teclado.
	   
  
   
	public Residencia getResidencia() {
	return residencia;
	}

	public void setResidencia(Residencia residencia) {
	this.residencia = residencia;
	}

	public void setFuncionario(Funcionario a){
	    if (a == null) {
	      throw new RuntimeException("Erro: aluno null.");
	    }
	    else {
	      this.funcionario = a;
	    }
	  }

	  public Funcionario getFuncioario() {
	    return funcionario;
	  }

	  public void leNome() {
	    System.out.print("Digite o nome: ");
	    String s = scan.nextLine();
	    funcionario.setNome(s);
	  }
	  
	  public void leTodosDados() {
		    leNome();
		    
		  }
	  public void imprime() {
		    System.out.println("Nome   : " + funcionario.getNome()+ " "+ residencia);
		    
		  }
}
