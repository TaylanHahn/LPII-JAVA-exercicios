package ProjetoAlugueis_v1.dominio;

public class AptoTipoB extends Apto {

    AptoTipoB(int n, int an, float ar, boolean al, Edificio e){
        super(n, an, ar, al, e);
    }
   
    @Override
    public float precoExtra() {
        if(getAndar() <= 1){
            return 0.00f;
        } else {
            return 50.00f;
        }
    }
}
