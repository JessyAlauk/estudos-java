package dominio;

public class Pessoa {

    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }
}
