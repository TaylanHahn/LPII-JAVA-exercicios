package ProjetoAlugueis_v1.dominio;

public abstract class Apto {
    private int numero;
    private int andar;
    private float area;
    private boolean alugado;

    // CONSTRUTOR
    public Apto(int n, int an, float ar, boolean al, Edificio e){
        if(e != null){
            this.setNumero(n);
            this.setAndar(an);
            this.setArea(ar);
            this.setAlugado(al);
        } else {
            throw new RuntimeException("Informe um edificio válido.");
        }
    }
    

// GETTERS E SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    // get inquilino

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

// MÉTODOS

    public float precoFinal(){
        // implementar e remover o 0;
        return 0;
    }

    // Método ABSTRATO
    public abstract float precoExtra();

    public void aluga(Inquilino i){
        // implementar lógica
    }

    public void desaluga(){
        // implementar lógica
    }


}
