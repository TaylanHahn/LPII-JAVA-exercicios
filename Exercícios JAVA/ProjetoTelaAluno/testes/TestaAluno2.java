package ProjetoTelaAluno_v2.testes;

import java.util.Scanner;

import ProjetoTelaAluno_v2.dominio.Aluno;

/****************************************************************************
 * TestaAluno2:
 * Programa para testar a classe Aluno e leitura de dados pelo teclado.
 * Solicita ao usuário que digite os dados dos alunos, 
 * instancia dois Alunos com esses dados e depois imprime na tela os dados desses objetos.
 ***************************************************************************/
public class TestaAluno2 {

  public static void main(String[] args) {
    //Declara dois objetos Aluno.
    Aluno a1, a2;

    try (//Variável local (temporária) para fazer leitura pelo teclado.
    Scanner scan = new Scanner(System.in)) {
      //Variáveis locais (temporárias) para efetuar a leitura dos dados dos alunos.
      //Note que foram utilizados nomes diferentes dos atributos das classes e dos parâmetros dos métodos 
      //para enfatizar que não há relação entre esses nomes e nem obrigatoriedade 
      //que esses nomes sejam idênticos. 
      String nome_aluno;
      float nota_1;
      float nota_2;

      //Solicita os dados para o aluno a1.
      System.out.printf("Digite os dados para o Aluno 1: \n");
      System.out.print("Digite o nome: ");
      nome_aluno = scan.nextLine();
      
      System.out.print("Digite a Nota 1: ");
      nota_1 = scan.nextFloat();
      scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).

      System.out.print("Digite a Nota 2: ");
      nota_2 = scan.nextFloat();
      scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).

      //Instancia um Aluno com os dados que foram lidos.
      a1 = new Aluno(nome_aluno, nota_1, nota_2);

      //----------------------------------------------------------------
      //-------------------- Outra Forma -------------------------------
      //----------------------------------------------------------------
      
      //Solicita os dados para o aluno a2.
      System.out.printf("Digite os dados para o Aluno 2: \n");
      System.out.print("Digite o nome: ");
      nome_aluno = scan.nextLine();
      
      //Instancia um Aluno com o nome que foi lido.
      a2 = new Aluno(nome_aluno);
      
      System.out.print("Digite a Nota 1: ");
      nota_1 = scan.nextFloat();
      scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).
      //Atribui a nota1.
      a2.setNota1(nota_1);

      System.out.print("Digite a Nota 2: ");
      nota_2 = scan.nextFloat();
      scan.nextLine(); //Necessário sempre depois que lê um número, para limpar o ENTER (caractere de nova linha).
      //Atribui a nota1.
      a2.setNota2(nota_2);
    }
    
    

    
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

}//TestaAluno2.
