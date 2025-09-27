package ProjetoFuncionario.testes;
import ProjetoFuncionario.dominio.Endereco;
import ProjetoFuncionario.dominio.Funcionario;
import ProjetoFuncionario.dominio.OperacoesFuncionario;

public class TestaFuncionario {
    public static void main(String[] args) {

        // Primeiro instancio um endereço e depois atribuo ao funcionário (teste de Endereco.java)
        Endereco endJoao = new Endereco("Rua Braille", "362", "Santa Fé", "Porto Alegre", "91340-403");

        Funcionario f1;
        f1 = new Funcionario("João Silva", 'M', "123.456.789-99", 10000.00, endJoao);
        // Para testar se funciona, apenas alterar os valores acima :)

        System.out.println("--------------------------------------");
        System.out.println("Dados do Funcionario");
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("CPF: " + f1.getCPF());
        System.out.println("Sexo: " + f1.getSexo());
        System.out.println(".................................");
        System.out.println("Salario Bruto: R$ " + f1.getSalarioBruto());
        System.out.println("Taxa do INSS: " + f1.txINSS());
        System.out.println("Valor INSS: R$ " + f1.valorINSS());
        System.out.println("--------------------------------------");
        System.out.println("Salario Base IR: R$ " + f1.salarioBaseIR());
        System.out.println("IR: " + f1.txIR());
        System.out.println("--------------------------------------");
        System.out.println("Salario Liquido: R$ " + f1.salarioLiquido());


       
        System.out.println("\n\n==============================================");

        // Criando um segundo funcionário para os testes
        System.out.println("\n> Endereço criado para Maria <");
        Endereco endMaria = new Endereco("Rua Papai Noel", "2512", "Natalina", "Natal", "20251225");
        Funcionario f2 = new Funcionario("Maria Souza", 'F', "987.654.321-00", 5000.00, endMaria);
        System.out.println("\n>>> Funcionários criados para teste <<<");
        System.out.printf("F1: %s - Salário: R$ %.2f\n", f1.getNome(), f1.getSalarioBruto());
        System.out.printf("F2: %s - Salário: R$ %.2f\n", f2.getNome(), f2.getSalarioBruto());


        // Aumento de Salário
        System.out.println("\n--- Aumento de Salário ---");
        System.out.printf("Salário ANTES: R$ %.2f\n", f2.getSalarioBruto());
        OperacoesFuncionario.aumentaSalario(f2, 10.0); // Aumentando o salário da Maria em 10%
        System.out.printf("Salário DEPOIS: R$ %.2f\n", f2.getSalarioBruto());


        // Doação de Salário
        System.out.println("\n--- Doação de Salário ---");
        System.out.printf("Salário João ANTES: R$ %.2f\n", f1.getSalarioBruto());
        System.out.printf("Salário Maria ANTES: R$ %.2f\n", f2.getSalarioBruto());
        f1.doaSalario(f2); // João (f1) está chamando o método para doar para Maria (f2)
        System.out.printf("Salário João DEPOIS: R$ %.2f\n", f1.getSalarioBruto());
        System.out.printf("Salário Maria DEPOIS: R$ %.2f\n", f2.getSalarioBruto());


        // Troca de Salário
        System.out.println("\n>>> Funcionários criados para teste limpo <<<");
        System.out.println("\n> Endereço criado para o Pedro <");
        Endereco endPedro = new Endereco("Rua Blabla", "989", "Higienopolis", "Porto Alegre", "91345678");
        Funcionario f_troca1 = new Funcionario("Pedro", 'M', "111", 2000.00, endPedro);

        System.out.println("\n> Endereço criado para a Carla <");
        Endereco endCarla = new Endereco("Av Sertorio", "245", "Floresta", "Porto Alegre", "91000234");
        Funcionario f_troca2 = new Funcionario("Carla", 'F', "222", 8000.00, endCarla);

        System.out.println("\n--- Troca de Salário ---");
        System.out.printf("Salário Pedro ANTES: R$ %.2f\n", f_troca1.getSalarioBruto());
        System.out.printf("Salário Carla ANTES: R$ %.2f\n", f_troca2.getSalarioBruto());
        OperacoesFuncionario.trocaSalario(f_troca1, f_troca2);
        System.out.printf("Salário Pedro DEPOIS: R$ %.2f\n", f_troca1.getSalarioBruto());
        System.out.printf("Salário Carla DEPOIS: R$ %.2f\n", f_troca2.getSalarioBruto());
        
        // Trocando os salarios de volta
        System.out.println("\n - Trocando os salários de volta - ");
        f_troca1.trocaSalario(f_troca2); // Pedro (f_troca1) chama o método para trocar com Carla (f_troca2)
        System.out.printf("Salário Pedro FINAL: R$ %.2f\n", f_troca1.getSalarioBruto());
        System.out.printf("Salário Carla FINAL: R$ %.2f\n", f_troca2.getSalarioBruto());


        // --- Novo Funcionário ---
        // Usado os salários de Pedro e Carla
        System.out.println("\n--- Novo Funcionário com a soma de salários ---");
        System.out.printf("Salário de Pedro base: R$ %.2f\n", f_troca1.getSalarioBruto());
        System.out.printf("Salário de Carla base: R$ %.2f\n", f_troca2.getSalarioBruto());

        Endereco endLucas = new Endereco("Rua Heuheuheu", "823", "Tristeza", "Porto Alegre", "00111222");
        Funcionario f3 = OperacoesFuncionario.novoFuncionario("Lucas", 'M', "333", 0, f_troca1, f_troca2, endLucas);
        System.out.printf("Novo funcionário criado: %s, com salário de R$ %.2f\n", f3.getNome(), f3.getSalarioBruto());

        System.out.println("Endereço do Lucas: " + f3.getEndereco());
    }
}