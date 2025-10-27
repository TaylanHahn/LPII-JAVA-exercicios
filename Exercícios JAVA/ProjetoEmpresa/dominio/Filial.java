package ProjetoEmpresa.dominio;

public class Filial {
    private String nome;
    private float faturamento;
    private Gerente gerente;
    
    public Filial(Gerente g){
        if(g!=null){
            throw new RuntimeException("Filial sem gerente!");
        } 
    }

    public String getNomeFilial() {
        return nome;
    }

    public float getFaturamentoFilial() {
        return faturamento;
    }

    public Gerente getGerente() {
        return this.gerente;
    }

}
