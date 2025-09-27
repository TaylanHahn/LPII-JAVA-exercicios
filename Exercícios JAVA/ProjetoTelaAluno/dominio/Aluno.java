package ProjetoTelaAluno_v2.dominio;

/*
 * Classe Aluno com getters, setters e construtores.
 */

public class Aluno {

  //-----------------------------------------
  //-------------- Atributos ----------------
  //-----------------------------------------

  //Normalmente, todos os atributos sao privados.
  private String nome;
  private float nota1;
  private float nota2;

  //-----------------------------------------
  //-------------- Construtores -------------
  //-----------------------------------------

  //As notas foram explicitamente inicializadas com zero somente para exemplificação,
  //pois neste caso não precisaria, ja que na linguagem Java, os atributos do tipo float
  //são sempre incializados com zero.
  public Aluno(String n) {
    setNome(n);
    setNota1(0);
    setNota2(0);
  }//Aluno(n)

  //Outro metodo construtor, agora com a passagem dos parametros n(nome), n1(nota1) e n2(nota2).
  public Aluno(String n, float n1, float n2) {
    setNome(n);
    setNota1(n1);
    setNota2(n2);
  }//Aluno(n, n1, n2)

  //-----------------------------------------
  //-------------- Metodos ------------------
  //-----------------------------------------

  //Metodo para retornar o nome do Aluno.
  public String getNome() {
    return nome;
  }//getNome()
  
  //Metodo para atribuir o nome do Aluno.
  public void setNome(String nome) {
    if (nome.length() >= 2) {
      this.nome = nome;
    } 
    else {
      throw new RuntimeException("Erro: nome deve ter pelo menos dois caracteres");  
    }
  }//setNome()

  //Metodo para retornar a nota 1 do Aluno.
  public float getNota1() {
    return nota1;
  }//getNota1()

  //Metodo para atribuir a nota 1 do Aluno.
  public void setNota1(float n1) {
    if ( n1 >=0 && n1<=10) {
      nota1 = n1;
    }
    else {
      throw new RuntimeException("Erro: nota1 deve estar entre 0 e 10");  
    }
  }//setNota1()
  
  //Metodo para retornar a nota 2 do Aluno.
  public float getNota2() {
    return nota2;
  }//getNota2()

  //Metodo para atribuir a nota 2 do Aluno.
  public void setNota2(float n2) {
    if (n2 >=0 && n2<=10) {
      nota2 = n2;
    }
    else {
      throw new RuntimeException("Erro: nota2 deve estar entre 0 e 10");  
    }
  }//setNota2()
  
  //Metodo para retornar a media das notas do Aluno.
  public float media(){
    return (nota1 + nota2) /2;
  }//media()

  //Metodo para retornar a situacao do Aluno.
  public String situacao(){
    float m = media();
    if (m < 3) {
      return "Reprovado"; 
    }
    else if (m < 7) {
      return "Recuperacao";
    }
    else {
      return "Aprovado";
    }
  }//situacao()

}//Final da classe Aluno.