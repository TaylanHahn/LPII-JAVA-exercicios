package ProjetoFuncionario.testes;
import ProjetoFuncionario.dominio.Funcionario;
import ProjetoFuncionario.telas.TelaFuncionario;

public class TestaTelaFuncionario {
    public static void main(String[] args) {
        Funcionario f1;
        f1 = new Funcionario();
        Funcionario f2;
        f2 = new Funcionario();
        
        TelaFuncionario tela;
        tela = new TelaFuncionario();

        // Testes para f1
        tela.leNome(f1);
        tela.leSexo(f1);
        tela.leCPF(f1);
        tela.leSalarioBruto(f1);
        tela.imprime(f1);

        // Testes para f2
        tela.leNome(f2);
        tela.leSexo(f2);
        tela.leCPF(f2);
        tela.leSalarioBruto(f2);
        tela.imprime(f2);
    }
}
