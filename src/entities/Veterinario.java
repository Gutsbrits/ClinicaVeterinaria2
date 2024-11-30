package entities;

public class Veterinario extends Funcionario {
    private String crmv;

    public Veterinario(String nome, String cpf, String crmv) {
        super(nome, cpf, "Veterinário");
        this.crmv = crmv;
    }

    public void realizarConsulta(Consulta consulta) {
        System.out.println("Consulta realizada por " + super.getDetalhes());
    }

    public void emitirReceita(Consulta consulta) {
        System.out.println("Receita emitida para " + consulta.getAnimal().getDetalhes());
    }
}
