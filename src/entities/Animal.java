package entities;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getDetalhes() {
        return "Nome: " + nome + ", Espécie: " + especie + ", Idade: " + idade + " anos";
    }
}
