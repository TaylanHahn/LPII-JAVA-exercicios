package ProjetoLivros.dominio;

public class Prateleira {
    private int numero;
    private Armario armario;

    public Prateleira(int numero, Armario a){
        this.getNumero();
        // teste de associação obrigatória
        if(a != null){
            this.getArmario();
        } else {
            throw new RuntimeException("Erro! Armario nulo.");
        }  
    }

    public int getNumero(){
        return numero;
    }

    public Armario getArmario(){
        return armario;
    }
}
