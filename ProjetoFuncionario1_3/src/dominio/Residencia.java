package dominio;

public class Residencia {

	  private String rua;
	  private int numero;

	  
	   
	  public Residencia(String rua, int numero) { // construtor para que cada residencia tenha  uma rua e um numero
	    this.setRua(rua);
	    this.setNumero(numero);
	  }

	  public String getRua() {
	    return rua;
	  }

	  public void setRua(String rua) {
	    if (rua==null) {
	      //Lancando uma excecao.
	      throw new RuntimeException("Erro Residencia: rua não pode ser null");
	    }
	    else if (rua.equals("")) {
	      //Lancando uma excecao.
	      throw new RuntimeException("Erro Residencia: rua não pode ser vazio");
	    }
	    else {
	      this.rua = rua;
	    }
	  }

	  public int getNumero() {
	    return numero;
	  }

	  public void setNumero(int numero) {
	    this.numero = numero;
	  }

	  @Override
	  public String toString() {
	    return "Residência: [Rua = " + this.rua + "Número = " + this.numero + "]";
	  }

} 