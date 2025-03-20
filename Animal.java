package Animais;

public class Animal {
    protected String nome;
    protected int idade;
    protected double peso;

    // Construtor
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    // Método para emitir som
    public void emitirSom() {
        System.out.println("O animal emite um som");
    }

    // Método para reconhecer perigo
    public void reconhecerPerigo() {
        System.out.println("O animal sabe reconhecer se está em perigo");
    }
}
