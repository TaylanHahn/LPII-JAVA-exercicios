package ProjetoAlugueis_v1.dominio;

public class Inquilino {
    private String nome;

    public Inquilino(String n){
        this.setNome(n);
    }

    public String getNomeInquilino() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
