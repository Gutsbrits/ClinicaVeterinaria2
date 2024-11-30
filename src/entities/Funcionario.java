package entities;

public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;

    public Funcionario(String nome, String cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public String getDetalhes() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Cargo: " + cargo;
    }
}
