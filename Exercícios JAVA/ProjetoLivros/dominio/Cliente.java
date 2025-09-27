package ProjetoLivros.dominio;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Livro> livros = new ArrayList<Livro>();

    // Construtor
    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public List<Livro> getLivros(){
        return livros;
    }

    public void locaLivro(Livro livro){
        // checa se o livro está disponivel
        if(livro.getDisponivel()){
            // checa se o cliente ainda nao esta com este livro locado
            if (this.livros.indexOf(livro) == -1){
                this.livros.add(livro);
                livro.setDisponivel(false);
        }
        

        }
    }



}
