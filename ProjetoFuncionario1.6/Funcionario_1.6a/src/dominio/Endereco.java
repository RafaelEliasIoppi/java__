package dominio;
public class Endereco {
  private String rua;
  private int    numero;
  private String complemento;
  private String bairro;
  
  //----- Construtor -----
  public Endereco(String r, int n, String c, String b) {
    setRua(r);
    setNumero(n);
    setComplemento(c);
    setBairro(b);
  }  
  
  //--- Rua ---
  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  //--- Numero ---
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  //--- Complemento ---
  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  //--- Bairro ---
  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  //--- toString() ---
  public String toString(){
    return this.rua + "," + this.numero + "," + this.complemento + "," + this.bairro;  
  }

    
}//Endereco.