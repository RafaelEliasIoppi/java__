// Exemplo de uma classe com membros p�blicos:
//   - propriedades ou atributos
//   - m�todos ou opera��es

public class Aluno {
  //Campos, propriedades ou atributos
  public  String nome;  
  public  char   sexo; /*M ou F*/
  public  int    idade;
  
  public  float  nota1; 
  public  float  nota2; 
  
  //Exemplo de um m�todo para calcular e retornar a
  //m�dia aritm�tica das provas do aluno.
  public float media() {
    return (nota1 + nota2) / 2;
  }//media() 
  
  //Exemplo de um m�todo para calcular a 
  //m�dia aritm�tica das provas e retornar a situa��o do aluno.
  public String situacao() {
    if (media() >= 7) {
      return "Aprovado";
    }
    else {
      return "Reprovado";
    }
  }//situacao()
  
}//Aluno.