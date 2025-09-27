package ProjetoTelaAluno_v2.telas;

import java.util.Scanner;

import ProjetoTelaAluno_v2.dominio.Aluno;

/****************************************************************************
 * Esta classe tem o intuito de simular uma interface gráfica
 * que é responsável por efetuar a leitura dos dados de um objeto Aluno
 * bem como mostrar na tela os dados de um objeto Aluno.
 * 
 * Nesta classe foram implementadas 3 estratégias diferentes:
 * 
 * Estratégia 1: Métodos que efetuam a leitura de um único dado e retornam esse dado
 * para quem efetuou a chamada, ficando sob responsabilidade de quem efetuou
 * a chamada atribuir esse dado ao objeto Aluno. Quem chama esse método também tem a 
 * a responsabilidade de instanciar o Aluno.
 * São os seguintes métodos:
 * - public String leNome();
 * - public float leNota1();
 * - public float leNota2();
 * 
 * Estratégia 2: Métodos que recebem um objeto Aluno como parâmetro, 
 * efetuam a leitura de um ou mais dados e atribuem para o objeto que foi passado. 
 * Nessa estratégia, quem chama o método fica com a responsabilidade de instanciar um Aluno,
 * mas não fica  com a responsabilidade de atribuir o dado ao Aluno,
 * pois o método já faz isso.
 * São os seguintes métodos:
 * - public void leNome(Aluno a);
 * - public void leNota1(Aluno a);
 * - public void leNota2(Aluno a);
 * - public void leNotas(Aluno a);
 * - public void leTodosDados(Aluno a);
 * 
 * Estratégia 3: Nessa estratégia o método faz a leitura dos dados,
 * cria o objeto (instancia a clase) e atribui os dados ao objeto.
 * É o seguinte método:
 * - public Aluno leTodosDadosEInstancia();
 * 
 * 
 ***************************************************************************/
public class TelaAluno {

  //Atributo interno utilizao para fazer leitura pelo teclado.
  private Scanner scan = new Scanner(System.in);

  //Construtor.
  public TelaAluno() {
  }

  /***************************** Estratégia 1 ******************************/
  // A aplicação dessa estratégia está no TestaAluno1.java
  
  public String leNome() {
    System.out.print("Digite o nome: ");
    String s = scan.nextLine();
    return s;
  }

  public float leNota1() {
    System.out.print("Digite a Nota 1: ");
    float f = scan.nextFloat();
    scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).
    return f;
  }

  public float leNota2() {
    System.out.print("Digite a Nota 2: ");
    float f = scan.nextFloat();
    scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).
    return f;
  }

  /***************************** Estratégia 2 ******************************/
  // A aplicação dessa estratégia está no TestaAluno2.java
  // Essa estratégia meio que automatiza a leitura (GET) e a inserção (SET) nos atributos desejados.
  
  public void leNome(Aluno a) { // Quando passo um objeto como parâmetro em JAVA, faço uma passagem por referência. È semelhante a um ponteiro em C. 
    System.out.print("Digite o nome: ");
    String s = scan.nextLine();
    a.setNome(s);
  }

  public void leNota1(Aluno a) {
    System.out.print("Digite a Nota 1: ");
    float f = scan.nextFloat();
    scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).
    a.setNota1(f);
  }
  
  public void leNota2(Aluno a) {
    System.out.print("Digite a Nota 2: ");
    Float f = scan.nextFloat();
    scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).
    a.setNota2(f);
  }

  public void leNotas(Aluno a) {
    leNota1(a);
    leNota2(a);
  }

  public void leTodosDados(Aluno a) {
    leNome(a);
    leNota1(a);
    leNota2(a);
  }

  /***************************** Estratégia 3 ******************************/
  // A aplicação dessa estratégia está no TestaAluno3.java
  // Neste método, ele próprio faz a leitura e ainda instancia o objeto.
  // Apenas semelhante a "factory", que é um objeto criando outro objeto.
  
  public Aluno leTodosDadosEInstancia() {
    String s = leNome();
    float n1 = leNota1();
    float n2 = leNota2();
    Aluno a = new Aluno(s, n1, n2);
    return a;
  }

  /***************************** Impressão *********************************/
  
  public void imprime(Aluno a) {
    System.out.printf("Nome     : %s\n",   a.getNome());
    System.out.printf("Nota 1   = %.2f\n", a.getNota1());
    System.out.printf("Nota 2   = %.2f\n", a.getNota2());
    System.out.printf("Média    = %.2f\n", a.media());
    System.out.printf("Situação : %.2f\n", a.situacao());
  }

  public void imprimeComMoldura(Aluno a) {
    System.out.printf("----------------------------------\n");
    System.out.printf("-------- Dados do Aluno ----------\n");
    System.out.printf("Nome     : %s\n",   a.getNome());
    System.out.printf("Nota 1   = %.2f\n", a.getNota1());
    System.out.printf("Nota 2   = %.2f\n", a.getNota2());
    System.out.printf("Média    = %.2f\n", a.media());
    System.out.printf("Situação : %s\n",   a.situacao());
    //Ao invés das 5 linhas acima, poderia chamar assim:
    //imprime(a);
    System.out.printf("----------------------------------\n");
  }


}//TelaAluno.



