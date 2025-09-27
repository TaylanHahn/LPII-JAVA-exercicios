package ProjetoTelaAluno_v2.testes;

import ProjetoTelaAluno_v2.dominio.Aluno;

/****************************************************************************
 * TestaAluno1:
 * Programa para testar a classe Aluno.
 * Instancia dois Alunos e depois imprime na tela os dados desses objetos.
 ***************************************************************************/
public class TestaAluno1 {

  public static void main(String[] args) {
    //Declara dois objetos Aluno.
    Aluno a1, a2;

    //Instancia aluno somente com nome.
    a1 = new Aluno("Joao");
    //a1.setNome("Alex");
    //Atribui notas.
    a1.setNota1(8);
    a1.setNota2(9);

    //Instancia Aluno com nome e notas.
    a2 = new Aluno("Joao", 7, 8);

    //----------------------- Imprime dados dos Alunos ---------------------- 
    
    System.out.printf("----------------------------------\n");
    System.out.printf("-------- Dados do Aluno ----------\n");
    System.out.printf("Nome     : %s\n",   a1.getNome());
    System.out.printf("Nota 1   = %.2f\n", a1.getNota1());
    System.out.printf("Nota 2   = %.2f\n", a1.getNota2());
    System.out.printf("Média    = %.2f\n", a1.media());
    System.out.printf("Situação : %s\n",   a1.situacao());
    System.out.printf("----------------------------------\n");

    System.out.printf("----------------------------------\n");
    System.out.printf("-------- Dados do Aluno ----------\n");
    System.out.printf("Nome     : %s\n",   a2.getNome());
    System.out.printf("Nota 1   = %.2f\n", a2.getNota1());
    System.out.printf("Nota 2   = %.2f\n", a2.getNota2());
    System.out.printf("Média    = %.2f\n", a2.media());
    System.out.printf("Situação : %s\n",   a2.situacao());
    System.out.printf("----------------------------------\n");

  }//main()

}//TestaAluno1.