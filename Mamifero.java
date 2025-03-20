package Animais;

public class Mamifero extends Animal {
    protected boolean temPelos;

    // Construtor
    public Mamifero(String nome, int idade, double peso, boolean temPelos) {
        super(nome, idade, peso);
        this.temPelos = temPelos;
    }

    // Método para amamentar
    public void amamentar() {
        System.out.println(nome + " está amamentando seus filhotes.");
    }

    // Sobrescrevendo o método emitirSom
    @Override
    public void emitirSom() {
        System.out.println(nome + " emite um som característico de mamífero.");
    }
}
