package ProjetoEmpresa.dominio;

public class Gerente {
    private String nome;
    private float salBase;

    // Construtor
    public Gerente(String n, float sal){
        this.setNome(n);
        this.setSalBase(sal);
    }

    // Getters e Setters
    public String getNomeGerente() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalBaseGerente() {
        return salBase;
    }

    public void setSalBase(float salBase) {
        this.salBase = salBase;
    }
    
}
