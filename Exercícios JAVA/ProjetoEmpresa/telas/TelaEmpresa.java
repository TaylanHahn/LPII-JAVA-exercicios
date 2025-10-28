package ProjetoEmpresa.telas;

import java.util.List;

import ProjetoEmpresa.dominio.EmprA;
import ProjetoEmpresa.dominio.EmprX;
import ProjetoEmpresa.dominio.Empr;
import ProjetoEmpresa.dominio.Filial;
import ProjetoEmpresa.dominio.Gerente;

public class TelaEmpresa {
    
    public void relatorio(List<Empr> lista){
        System.out.println("===== Relatório =====");

        for(Empr e: lista){
            System.out.println("Nome da empresa: " + e.getNome());

        if(e instanceof EmprA){
            System.out.println("Tipo: A");
        } else if(e instanceof EmprX){
            System.out.println("Tipo: X");
        }

        System.out.println("Filial - Fat. - Gerente - Sal. Base");
        for(Filial f : e.getFiliais()){
            System.out.println(f.getNomeFilial() + f.getFaturamentoFilial() + f.getGerente().getNomeGerente() + f.getGerente().getSalBaseGerente());
        }

        System.out.println("Fat. Total " + e.fatTotal());
        System.out.println("Sal. Tortal " + e.salTotal());
        System.out.println("Taxa Com. " + e.txCom());
        System.out.println("Distribuição: " + e.distr());
        System.out.println("Lucro Total: R$" + e.lucro());
        }
    }

    public void relatorioGerente(List<Empr> lista, Gerente g){
        System.out.println("===== Relatório de Gerente =====");

        // a implementar 
    }
    
}
