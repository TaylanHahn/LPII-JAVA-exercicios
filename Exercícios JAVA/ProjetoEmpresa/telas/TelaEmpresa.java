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
        System.out.println("Sal. Total " + e.salTotal());
        System.out.println("Taxa Com. " + e.txCom());
        System.out.println("Distribuição: " + e.distr());
        System.out.println("Lucro Total: R$" + e.lucro());
        }
    }

    public void relatorioGerente(List<Empr> lista, Gerente g){

        // variaveis locais
        float tx_com;
        float fat;
        float distr;
        float tot_distr=0;
        float sal_base;
        float tot_sal=0;

        System.out.println("===== Relatório de Gerente =====");
        System.out.println("Nome do Gerente: " + g.getNomeGerente());
        System.out.println("Salário Base: " + g.getSalBaseGerente());

        System.out.println("Emp - Filial - Fat. - Sal. B. - Tx Com - Distr.");
        for(Empr e : lista){
            for(Filial f : e.getFiliais()){
                if(f.getGerente() == g){
                    tx_com = e.txCom();
                    fat = f.getFaturamentoFilial();
                    distr = tx_com * fat;
                    sal_base = f.getGerente().getSalBaseGerente();
                    tot_distr = tot_distr + distr;
                    tot_sal = tot_sal + g.getSalBaseGerente();

                    System.out.println(e.getNome() + f.getNomeFilial() + fat + sal_base + tx_com + distr);
                } // if Gerente
            } // for Filiais
        } // for Empr
            System.out.printf("Totais: %.0f %.0f\n", tot_sal, tot_distr);
            System.out.printf("Total Recebido = %.0f+%.0f=%.0f\n", tot_sal, tot_distr, tot_sal+tot_distr);
    }
    
}
