package ProjetoTelaAluno_v2.testes;

import ProjetoTelaAluno_v2.dominio.Aluno;
import ProjetoTelaAluno_v2.telas.TelaAluno;

/****************************************************************************
 * TestaTelaAluno1:
 * Programa para testar a classe TelaAluno utilizando a Estratégia 1:
 * - Instancia uma TelaAluno.
 * - Solicita à TelaAluno para ler nome, nota 1 e nota2 para o Aluno 1.
 * - Instancia um Aluno (a1) com os dados lidos.
 * - Solicita à tela o nome para Aluno.
 * - Instancia um Aluno (a2) com o nome que foi lido.
 * - Solicita à TelaAluno as notas para o Aluno a2.
 * - Atribui para o Aluno a2 as notas que foram lidas.
 * - Solicita à TelaAluno para imprimir os dados dos alunos a1 e a2.
 ***************************************************************************/
public class TestaTelaAluno1 {

  public static void main(String[] args) {
    Aluno a1;
    Aluno a2;
    
    //Variáveis locais (temporárias) para efetuar a leitura dos dados dos alunos.
    //Note que foram utilizados nomes diferentes dos atributos das classes e dos parâmetros dos métodos 
    //para enfatizar que não há relação entre esses nomes e nem obrigatoriedade 
    //que esses nomes sejam idênticos. 
    String nome_aluno;
    float nota_1;
    float nota_2;

    //Instancia uma TelaAluno para fazer a interface (entrada e saída) com o usuário.
    TelaAluno tela;
    tela = new TelaAluno();

    //Solicita à tela os dados para o aluno a1.
    System.out.printf("Digite os dados para o Aluno 1: \n");
    nome_aluno = tela.leNome();
    nota_1 = tela.leNota1();
    nota_2 = tela.leNota2();
    //Instancia um Aluno com os dados que foram lidos.
    a1 = new Aluno(nome_aluno, nota_1, nota_2);

    //Solicita à tela os dados para o aluno a2.
    System.out.printf("Digite os dados para o Aluno 2: \n");
    //Solicita à tela o nome para Aluno.
    nome_aluno = tela.leNome();
    //Instancia um Aluno com o nome que foi lido.
    a2 = new Aluno(nome_aluno);
    //Solicita à tela as notas do Aluno.
    nota_1 = tela.leNota1();
    nota_2 = tela.leNota2();
    //Atribui para o Aluno a2 as notas que foram lidas.
    a2.setNota1(nota_1);
    a2.setNota2(nota_2);

    //Solicita à tela para imprimir os dados dos dois alunos.
    tela.imprimeComMoldura(a1);
    tela.imprimeComMoldura(a2);

  }//main()

}//TestaTelaAluno1.