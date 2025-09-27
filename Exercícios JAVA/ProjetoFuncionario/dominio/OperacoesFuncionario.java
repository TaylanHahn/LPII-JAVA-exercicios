package ProjetoFuncionario.dominio;

public class OperacoesFuncionario {
// MÉTODOS
    // AUMENTO DE SALÁRIO 
    public static void aumentaSalario(Funcionario f, double porcentagem){
    // verificações basicas de ZERO e NULL
        if(f == null){
            throw new RuntimeException("Erro: Insira um funcionário válido.");
        }

        if(porcentagem < 0){
            throw new RuntimeException("A porcentagem deve ser maior que zero!");
        }
        
        double salarioAtual = f.getSalarioBruto(); // pegando a info necessária
        double calculoAumento = salarioAtual * (porcentagem / 100.00); // calculo o aumento
        double novoSalario = salarioAtual + calculoAumento; // add ao salario atual
        f.setSalarioBruto(novoSalario); // uso o método para setar o novo salario
    }

    // TROCA DE SALÁRIO
    public static void trocaSalario(Funcionario f1, Funcionario f2){
        if(f1 == null || f2 == null){
            throw new RuntimeException("Erro: Insira um funcionário válido.");
        }
        
        // armazeno o salario de f1, para nao perde-lo
        double salarioTempF1 = f1.getSalarioBruto();

        // uso os getters e setters para inverter os salarios
        f1.setSalarioBruto(f2.getSalarioBruto());
        f2.setSalarioBruto(salarioTempF1);
    }

    // NOVO FUNCIONÀRIO
    // Cria um novo funcionário com o salário sendo a soma dos salários de outros dois.
    public static Funcionario novoFuncionario(String n, char s, String cpf, double sal, Funcionario f1, Funcionario f2, Endereco end){
        double salarioFnovo = f1.getSalarioBruto() + f2.getSalarioBruto();
        Funcionario f3 = new Funcionario(n, s, cpf, salarioFnovo, end);
        return f3;
    }
}
