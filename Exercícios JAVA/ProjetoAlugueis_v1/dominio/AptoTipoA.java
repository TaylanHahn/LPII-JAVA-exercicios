package ProjetoAlugueis_v1.dominio;

public class AptoTipoA extends Apto{

    public AptoTipoA(int n, int an, float ar, boolean al, Edificio e){
        super(n, an, ar, al, e);
    }
    
    @Override
    public float precoExtra() {
        int taxa = getAndar() * 100;
        return taxa;
    }


}
