package ProjetoEmpresa.dominio;

public class Filial {
    private String nome;
    private float faturamento;
    private Gerente gerente;
    
    public Filial(String n, float fat, Gerente g){
       this.setNomeFilial(n);
       this.setFaturamentoFilial(fat);
       this.setGerente(g);

        if(g==null){
            throw new RuntimeException("Filial sem gerente!");
        } 
    }

    // Getters e Setters
    public String getNomeFilial() {
        return nome;
    }

    public void setNomeFilial(String nome) {
        this.nome = nome;
    }

    public float getFaturamentoFilial() {
        return faturamento;
    }

    public void setFaturamentoFilial(float faturamento) {
        this.faturamento = faturamento;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    public Gerente getGerente() {
        return this.gerente;
    }

}
