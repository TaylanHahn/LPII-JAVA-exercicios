package ProjetoEmpresa.dominio;

public class EmprX extends Empr {

    public EmprX(String n){
        super(n);
    }
    
    @Override
    public float txCom(){
        if(fatTotal()<=1000.00){
            return 0.01f;
        } else if(fatTotal() <= 2000.00){
            return 0.02f;
        } else {
            return 0.03f;
        }
    }
}
