package ProjetoTelaAluno_v2.testes;

import ProjetoTelaAluno_v2.dominio.Aluno;
import ProjetoTelaAluno_v2.telas.TelaAluno;

/****************************************************************************
 * TestaTelaAluno3:
 * Programa para testar a classe TelaAluno utilizando a Estratégia 2:
 * - Instancia uma TelaAluno.
 * - Solicita à TelaAluno para ler todos os dados e instanciar um Aluno,
 *   atribuindo-o à variável a1.
 * - Solicita à TelaAluno para ler todos os dados e instanciar um Aluno,
 *   atribuindo-o à variável a2.
 * - Solicita à TelaAluno para imprimir os dados dos alunos a1 e a2.
 ***************************************************************************/
public class TestaTelaAluno3 {

  public static void main(String[] args) {
    Aluno a1;
    Aluno a2;
    
    //Instancia uma TelaAluno para fazer a interface (entrada e saída) com o usuário.
    TelaAluno tela1;
    tela1 = new TelaAluno();

    //Solicita à tela1 para ler todos os dados e instanciar um Aluno.
    a1 = tela1.leTodosDadosEInstancia();    
    
    //Solicita à tela1 para ler todos os dados e instanciar um Aluno.
    a2 = tela1.leTodosDadosEInstancia();

    //Imprime os dados dos dois alunos.
    tela1.imprimeComMoldura(a1);
    tela1.imprimeComMoldura(a2);

  }//main()

}//TestaTelaAluno3.
