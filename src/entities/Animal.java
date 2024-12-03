package entities;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String raca;

    public Animal(String nome, String especie, int idade, String raca) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
    }

    public String getDetalhes() {
        return "Nome: " + nome + ", Espécie: " + especie + ", Idade: " + idade + " anos" + ", Raça: " + raca;
    }
}
