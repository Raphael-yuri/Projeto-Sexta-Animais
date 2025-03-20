package Animais;

public class Tigre extends Mamifero {
    private boolean temListras;

    // Construtor
    public Tigre(String nome, int idade, double peso, boolean temPelos, boolean temListras) {
        super(nome, idade, peso, temPelos);
        this.temListras = temListras;
    }

    // Método específico para o tigre
    public void rugir() {
        System.out.println(nome + " solta um rugido poderoso!");
    }

    // Sobrescrevendo emitirSom para o Tigre
    @Override
    public void emitirSom() {
        System.out.println(nome + " ruge ferozmente.");
    }
}
