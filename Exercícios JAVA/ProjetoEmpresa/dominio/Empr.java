package ProjetoEmpresa.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Empr {
    private String nome;
    protected List<Filial> filiais;

// CONSTRUTOR
    public Empr(){
        this.filiais = new ArrayList<>();
    }

// MÉTODOS
    // faturamento total
    public float fatTotal(){
        float fTotal = 0.00f;
        for(Filial f : this.filiais){
            fTotal = fTotal + f.getFaturamentoFilial();
        }
        return fTotal;
    }

    // salario base total
    public float salTotal(){
       float totalSalario = 0.00f;
       for(Filial f : this.filiais){
           totalSalario = totalSalario + f.getGerente().getSalBaseGerente();
       }
       return totalSalario;
    }

    // valor total distribuído pela empresa
    public float distr(){
        float totalDistribuido = txCom() * fatTotal();
        return totalDistribuido;
    }

    // lucro líquido da empresa
    public float lucro(){
        float lucroLiquido = fatTotal() - salTotal() - distr();
        return lucroLiquido;
    }

    // taxa de comissão abstrata
    public abstract float txCom();

    // adiciona uma filial a empresa
    public void addFilial(Filial f){
        this.filiais.add(f);
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }


}
