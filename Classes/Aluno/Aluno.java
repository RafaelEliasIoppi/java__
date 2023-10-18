// Exemplo de uma classe com membros públicos:
//   - propriedades ou atributos
//   - métodos ou operações

public class Aluno {
  //Campos, propriedades ou atributos
  public  String nome;  
  public  char   sexo; /*M ou F*/
  public  int    idade;
  
  public  float  nota1; 
  public  float  nota2; 
  
  //Exemplo de um método para calcular e retornar a
  //média aritmética das provas do aluno.
  public float media() {
    return (nota1 + nota2) / 2;
  }//media() 
  
  //Exemplo de um método para calcular a 
  //média aritmética das provas e retornar a situação do aluno.
  public String situacao() {
    if (media() >= 7) {
      return "Aprovado";
    }
    else {
      return "Reprovado";
    }
  }//situacao()
  
}//Aluno.