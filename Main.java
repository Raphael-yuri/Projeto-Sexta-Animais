public class Main {
    public static void main(String[] args) {
        // Criando um Tigre
        Tigre tigre = new Tigre("Rajah", 5, 150.0);
        System.out.println("=== TIGRE ===");
        System.out.println("Nome: " + tigre.getNome());
        System.out.println("Idade: " + tigre.getIdade() + " anos");
        System.out.println("Peso: " + tigre.getPeso() + " kg");
        tigre.emitirSom();
        tigre.cacar();
        tigre.reconhecerPerigo();

        // Criando um Leão
        Leao leao = new Leao("Simba", 7, 190.0);
        System.out.println("\n=== LEÃO ===");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Idade: " + leao.getIdade() + " anos");
        System.out.println("Peso: " + leao.getPeso() + " kg");
        leao.emitirSom();
        leao.cacar();
        leao.reconhecerPerigo();
    }
}
