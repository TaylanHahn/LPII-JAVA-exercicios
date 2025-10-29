package ProjetoAlugueis_v1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private String nome;
    private List<Apto> listaAptos;


// GETTERS E SETTERS
    public String getNomeEdificio() {
        return nome;
    }

    public void setNomeEdificio(String nome) {
        this.nome = nome;
    }

// MÉTODOS
    public void adicionaApto(Apto a){
        listaAptos.add(a);
    }

    public List<Apto> getAptos(){
        return listaAptos;
    }
    
    public List<Apto> getAptosAlugados(){
        List<Apto> listaAptosAlugados = new ArrayList<Apto>();

        for(Apto ap : listaAptos){
            if(ap.isAlugado()){
                listaAptosAlugados.add(ap);
            }
        }
        return listaAptosAlugados;
    }
}
