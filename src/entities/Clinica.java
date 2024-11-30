package entities;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Funcionario> funcionarios;
    private List<Animal> animais;

    public Clinica(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcionarios = new ArrayList<>();
        this.animais = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public void adicionarAnimal(Animal a) {
        animais.add(a);
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f.getDetalhes());
        }
    }

    public void listarAnimais() {
        for (Animal a : animais) {
            System.out.println(a.getDetalhes());
        }
    }
}