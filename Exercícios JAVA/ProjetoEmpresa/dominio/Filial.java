package ProjetoEmpresa.dominio;

public class Filial {
    private String nome;
    private float faturamento;
    
    public Filial(Gerente g){
        if(g!=null){
            throw new RuntimeException("Filial sem gerente!");
        } 
    }

    public String getNome() {
        return nome;
    }

    public float getFaturamento() {
        return faturamento;
    }

}
