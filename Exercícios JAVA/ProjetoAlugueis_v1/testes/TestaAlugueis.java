package ProjetoAlugueis_v1.testes;

import java.util.ArrayList;
import java.util.List;

import ProjetoAlugueis_v1.dominio.Apto;
import ProjetoAlugueis_v1.dominio.AptoTipoA;
import ProjetoAlugueis_v1.dominio.AptoTipoB;
import ProjetoAlugueis_v1.dominio.Edificio;
import ProjetoAlugueis_v1.dominio.Inquilino;

public class TestaAlugueis {
    public static void main(String[] args) {

        // criando as listas 
        List<Edificio> listaEdificios = new ArrayList<Edificio>();
        List<Inquilino> listaInquilinos = new ArrayList<Inquilino>();

        // criando o edificio e os aptos
        Edificio a = new Edificio("Porta do Sol");
        Apto a1 = new AptoTipoA(101, 1, 50, false, a);
        Apto a2 = new AptoTipoB(102, 1, 60, false, a);
        Apto a3 = new AptoTipoA(201, 2, 70, false, a);
        Apto a4 = new AptoTipoB(202, 2, 80, false, a);
        Apto a5 = new AptoTipoA(301, 3, 90, false, a);
        Apto a6 = new AptoTipoA(302, 3, 90, false, a);

        // add os aptos do edificio A
        a.adicionaApto(a1);
        a.adicionaApto(a2);
        a.adicionaApto(a3);
        a.adicionaApto(a4);
        a.adicionaApto(a5);
        a.adicionaApto(a6);

        // criando o edificio e os aptos
        Edificio b = new Edificio("Estelar");
        Apto b1 = new AptoTipoA(2001, 2, 70, false, b);
        Apto b2 = new AptoTipoB(2002, 2, 70, false, b);
        Apto b3 = new AptoTipoA(3001, 3, 80, false, b);
        Apto b4 = new AptoTipoB(3002, 3, 80, false, b);
        Apto b5 = new AptoTipoA(4001, 4, 90, false, b);
        Apto b6 = new AptoTipoB(4002, 4, 90, false, b);

        // add os aptos do edficio B
        b.adicionaApto(b1);
        b.adicionaApto(b2);
        b.adicionaApto(b3);
        b.adicionaApto(b4);
        b.adicionaApto(b5);
        b.adicionaApto(b6);

        // Add os edificios na lista de edificios
        listaEdificios.add(a);
        listaEdificios.add(b);
        
        for(Edificio ed : listaEdificios){
            System.out.println("Nome do Edificio: " + ed.getNomeEdificio());
            for(Apto ap : ed.getAptos()){
                System.out.println("Andar: " + ap.getAndar());
                System.out.println("Numero " + ap.getNumero());
                System.out.println("Area: " + ap.getArea());
                System.out.println("Alugado? " + ap.isAlugado());
            }
        }
    }
}
