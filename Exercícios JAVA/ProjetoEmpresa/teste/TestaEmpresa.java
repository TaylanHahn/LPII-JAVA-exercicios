package ProjetoEmpresa.teste;

import java.util.ArrayList;
import java.util.List;

import ProjetoEmpresa.dominio.Empr;
import ProjetoEmpresa.dominio.EmprA;
import ProjetoEmpresa.dominio.EmprX;
import ProjetoEmpresa.dominio.Filial;
import ProjetoEmpresa.dominio.Gerente;
import ProjetoEmpresa.telas.TelaEmpresa;

public class TestaEmpresa {

    public static void main(String[] args) {
    
// Questao 3
    // Gerentes
    Gerente g10 = new Gerente("Ger10", 10.0f);
    Gerente g20 = new Gerente("Ger20", 20.0f);

    // Empresas
    EmprA ea = new EmprA("Abc");
    EmprX ex = new EmprX("Xyz");

    // Filiais 
    Filial f111 = new Filial("Fil100", 1000.0f, g10);
    Filial f112 = new Filial("Fil110", 2000.0f, g10);
    Filial f113 = new Filial("Fil120", 3000.0f, g10);
    Filial f121 = new Filial("Fil120", 4000.0f, g10);
    
    Filial f211 = new Filial("Fil200", 500.0f, g20);
    Filial f221 = new Filial("Fil210", 1000.0f, g20);

    // Adicionando as filiais às empresas
    ea.addFilial(f111);
    ea.addFilial(f112);
    ea.addFilial(f113);
    ea.addFilial(f121);
    ex.addFilial(f211);
    ex.addFilial(f221);

// Questao 4 
    
    List<Empr> lista_empr = new ArrayList<Empr>();
    lista_empr.add(ea);
    lista_empr.add(ex);

    for(Empr e : lista_empr){
        System.out.println("Nome da empresa: " + e.getNome());

        if(e instanceof EmprA){
            System.out.println("Tipo: A");
        } else if(e instanceof EmprX){
            System.out.println("Tipo: X");
        }

        System.out.println("Filial - Fat. - Gerente - Sal. Base");
        for(Filial f : e.getFiliais()){
            System.out.println(f.getNomeFilial() + f.getFaturamentoFilial() + f.getGerente() + f.getGerente().getSalBaseGerente());
        }

        System.out.println("Fat. Total " + e.fatTotal());
        System.out.println("Sal. Tortal " + e.salTotal());
        System.out.println("Taxa Com. " + e.txCom());
        System.out.println("Distribuição: " + e.distr());
        System.out.println("Lucro Total: R$" + e.lucro());
    }

// Questao 5

    TelaEmpresa tela = new TelaEmpresa(); // Instancio a 
    tela.relatorio(lista_empr);


}

}
