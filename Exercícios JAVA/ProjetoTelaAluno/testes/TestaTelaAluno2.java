package ProjetoTelaAluno_v2.testes;

import ProjetoTelaAluno_v2.telas.TelaAluno;
import ProjetoTelaAluno_v2.dominio.Aluno;

/****************************************************************************
 * TestaTelaAluno2:
 * Programa para testar a classe TelaAluno utilizando a Estratégia 2:
 * - Instancia uma TelaAluno.
 * - Instancia um Aluno (a1) sem nenhum dado.
 * - Solicita à TelaAluno para ler nome, nota 1 e nota2 para o Aluno (a1).
 * - Instancia um Aluno (a2) sem nenhum dado.
 * - Solicita à TelaAluno para ler nome, nota 1 e nota2 para o Aluno (a2).
 * - Solicita à TelaAluno para imprimir os dados dos alunos a1 e a2.
 ***************************************************************************/
public class TestaTelaAluno2 {

  public static void main(String[] args) {
    Aluno a1;
    Aluno a2;
    
    //Instancia uma TelaAluno para fazer a interface (entrada e saída) com o usuário.
    TelaAluno tela;
    tela = new TelaAluno();

    //Instancia um aluno.
    a1 = new Aluno("---"); //Pode ser inadequado ou inválido, dependendo o contexto.
    //Solicita à tela para ler os dados do aluno.
    tela.leNome(a1);
    tela.leNota1(a1);
    tela.leNota2(a1);

    //Instancia outro aluno. 
    a2 = new Aluno("---"); //Pode ser inadequado ou inválido, dependendo o contexto.
    //Solicita à tela para ler os dados do aluno.
    tela.leNome(a2);
    tela.leNota1(a2);
    tela.leNota2(a2);

    //Imprime os dados dos dois alunos.
    tela.imprimeComMoldura(a1);
    tela.imprimeComMoldura(a2);

  }//main()

}//TestaTelaAluno2.