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
        Apto a101 = new AptoTipoA(101, 1, 50, false, a);
        Apto a102 = new AptoTipoB(102, 1, 60, false, a);
        Apto a201 = new AptoTipoA(201, 2, 70, false, a);
        Apto a202 = new AptoTipoB(202, 2, 80, false, a);
        Apto a301 = new AptoTipoA(301, 3, 90, false, a);
        Apto a302 = new AptoTipoA(302, 3, 90, false, a);

        // add os aptos do edificio A
        a.adicionaApto(a101);
        a.adicionaApto(a102);
        a.adicionaApto(a201);
        a.adicionaApto(a202);
        a.adicionaApto(a301);
        a.adicionaApto(a302);

        // criando o edificio e os aptos
        Edificio b = new Edificio("Estelar");
        Apto b2001 = new AptoTipoA(2001, 2, 70, false, b);
        Apto b2002 = new AptoTipoB(2002, 2, 70, false, b);
        Apto b3001 = new AptoTipoA(3001, 3, 80, false, b);
        Apto b3002 = new AptoTipoB(3002, 3, 80, false, b);
        Apto b4001 = new AptoTipoA(4001, 4, 90, false, b);
        Apto b4002 = new AptoTipoB(4002, 4, 90, false, b);

        // add os aptos do edficio B
        b.adicionaApto(b2001);
        b.adicionaApto(b2002);
        b.adicionaApto(b3001);
        b.adicionaApto(b3002);
        b.adicionaApto(b4001);
        b.adicionaApto(b4002);

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


        // Instancio os inquilinos
        Inquilino iJoao = new Inquilino("João");
        Inquilino iMaria = new Inquilino("Maria");
        Inquilino iPedro = new Inquilino("Pedro");
        Inquilino iPaula = new Inquilino("Paula");

        // Relaciona os aptos aos inquilinos
        a101.aluga(iJoao);
        a302.aluga(iMaria);
        b3001.aluga(iPedro);
        b3002.aluga(iPaula);


        for(Edificio ed : listaEdificios){
            System.out.println("Edificio: " + ed.getNomeEdificio());
            for(Apto ap : ed.getAptos()){
                if(ap.isAlugado() == true){
                    System.out.print("Numero: " + ap.getNumero());
                    System.out.print("Inquilino: " + ap.getInquilino().getNomeInquilino());
                }
            }
        }
    }
}
