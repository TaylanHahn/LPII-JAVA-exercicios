package ProjetoFuncionario.dominio;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

// CONSTRUTOR
    public Endereco(String rua, String numero, String bairro, String cidade, String cep){
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setCep(cep);
    }

// GETTERS e SETTERS
    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }
//
    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
//
    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
//
    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
//
    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    
    @Override
    public String toString() {
    return rua + ", " + numero + " - " + bairro + ", " + cidade + " - CEP: " + cep;
}



}
