package ProjetoFuncionario.telas;
import ProjetoFuncionario.dominio.Funcionario;
import java.util.Scanner; // importação do  Scanner

public class TelaFuncionario {
    
//Atributo interno utilizao para fazer leitura pelo teclado.
private Scanner scan = new Scanner(System.in);

// Construtor
public TelaFuncionario(){}


// Métodos de Leitura
public void leNome(Funcionario f){
    System.out.println("Digite o nome do funcionário: ");
    String n = scan.nextLine();
    f.setNome(n);
}

public void leSexo(Funcionario f){
    System.out.println("Sexo (M ou F): ");
    String s = scan.nextLine(); // Para ler char, defino uma String e peço para pegar o primeiro caractere
    char c = s.charAt(0); // Após, crio uma nova variável do tipo char e passo a função charAt(0) e coloco o indice do caractere que quero, no caso é ZERO (o primeiro)
    f.setSexo(c);
}

public void leCPF(Funcionario f){
    System.out.println("Digite o CPF do funcionário: ");
    String cpf = scan.nextLine();
    f.setCPF(cpf);
}

public void leSalarioBruto(Funcionario f){
    System.out.println("Digite o salário bruto: ");
    double s = scan.nextDouble();
    f.setSalarioBruto(s);
}

// IMPRESSÃO

public void imprime(Funcionario f) {
    System.out.printf("Nome: %s\n",   f.getNome());
    System.out.printf("Sexo: %c\n", f.getSexo());
    System.out.printf("CPF: %s\n", f.getCPF());
    System.out.printf("Salário Bruto: R$ %.2f\n", f.getSalarioBruto());
  }

}
