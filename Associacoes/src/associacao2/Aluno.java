package associacao2;

//Esta classe implementa a navegabilidade da associação Aluno(0..*)-->(1..1)Residencia.
//Observe que se trata de uma associação monovalorada obrigatória de Aluno para Residencia, ou seja,
//um objeto Aluno precisa obrigatoriamente estar associado a um objeto Residencia. 
public class Aluno {
  private String nome;
  private float nota1;
  private float nota2;
  private Residencia residencia;//atributo para implementar a navegabilidade da associação.

  //Construtor para implementar a associação obrigatória entre Aluno e Residencia:
  public Aluno(String n, float n1, float n2, Residencia r ) {
    this.setNome(n);
    this.setNota1(n1);
    this.setNota2(n2);
    this.setResidencia(r); //Este método deverá fazer a consistência de Residencia válida (diferente de null).
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome == null) {
      //Lancando um excecao.
      new RuntimeException("Erro Aluno: nome nao pode ser null");
    }
    else if (nome.equals("")) {
      //Lancando um excecao.
      new RuntimeException("Erro Aluno: nome nao pode ser vazio");
    }
    else {
      this.nome = nome;
    }
  }

  public float getNota1() {
    return nota1;
  }

  public void setNota1(float nota1) {
    if ( (nota1 >= 0) && (nota1 <= 10) ) {
      this.nota1 = nota1;
    }
    else {
      //Lancando um excecao.
      throw new RuntimeException("Erro Aluno: Nota 1 invalida="+nota1+".");
    }
  }

  public float getNota2() {
    return nota2;
  }

  public void setNota2(float nota2) {
    if ( (nota2 >= 0) && (nota2 <= 10) ) {
      this.nota2 = nota2;
    }
    else {
      //Lancando um excecao.
      throw new RuntimeException("Erro Aluno: Nota 2 invalida="+nota2+".");
    }
  }

  public Residencia getResidencia() {
    return residencia;
  }

  //Este método deverá fazer a consistência de associação obrigatória entre Aluno e Residencia,
  //ou seja, só deverá aceitar uma instância de Residencia válida (diferente de null).
  public void setResidencia(Residencia residencia) {
    //Não permite atribuir uma residencia null.
    if (residencia == null) {
      //Lancando uma excecao.
      throw new RuntimeException("Erro Aluno: Residencia null");
    }
    else {
      this.residencia = residencia;
    }
  }

  public float media(){
    float m;
    m = (this.nota1 + this.nota2) / 2;
    return m;
  }

  public String situacao() {
    if (media() < 3) {
      return "REPROVADO";
    }
    else if ( media()< 7 ) {
      return "RECUPERACAO";
    }
    else {
      return "APROVADO";
    }
  }

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2
        + ", residencia=" + residencia + "]";
  }

}//Aluno.