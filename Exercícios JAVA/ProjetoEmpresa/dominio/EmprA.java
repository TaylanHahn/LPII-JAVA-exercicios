package ProjetoEmpresa.dominio;

public class EmprA extends Empr {

    @Override
    public float txCom(){
        int numeroFiliais = this.filiais.size();

        if(numeroFiliais == 0){
            return 0.00f;
        }
        
        float txPercentual = numeroFiliais / 100.0f;
        float faturamentoTotal = fatTotal();

        return faturamentoTotal * txPercentual;
    }
}
