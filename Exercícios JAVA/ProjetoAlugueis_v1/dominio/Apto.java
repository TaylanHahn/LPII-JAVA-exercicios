package ProjetoAlugueis_v1.dominio;

public abstract class Apto {
    private int numero;
    private int andar;
    private float area;
    private boolean alugado;
    private Inquilino inquilino;

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
        return 10.00f * getArea() + precoExtra();
    }

    // Método ABSTRATO
    public abstract float precoExtra();


    public void aluga(Inquilino i){
        this.inquilino = i;
        this.alugado = true;
    }

    public void desaluga(){
       this.inquilino = null;
       this.alugado = false;
    }


}
