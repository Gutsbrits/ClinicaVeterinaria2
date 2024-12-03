package aplication;

import entities.*;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        // Criando clínica
        Clinica clinica = new Clinica("Pet Vida", "Rua das Flores, 123", "(86) 1234-5678");

        // Criando veterinários
        Veterinario vet1 = new Veterinario("Dr. João", "123.456.789-00", "CRMV-1234");
        Veterinario vet2 = new Veterinario("Dra. Maria", "987.654.321-00", "CRMV-5678");

        // Adicionando funcionários (veterinários) na clínica
        clinica.adicionarFuncionario(vet1);
        clinica.adicionarFuncionario(vet2);

        // Criando animais
        Animal animal1 = new Animal("Bobby", "Cachorro", 5, "Pitbull");
        Animal animal2 = new Animal("Mingau", "Gato", 2, "Siamês");

        // Adicionando animais na clínica
        clinica.adicionarAnimal(animal1);
        clinica.adicionarAnimal(animal2);

        // Listando funcionários e animais
        System.out.println("Funcionários da Clínica:");
        clinica.listarFuncionarios();

        System.out.println("\nAnimais na Clínica:");
        clinica.listarAnimais();

        // Criando uma consulta
        Consulta consulta = new Consulta(vet1, animal1, LocalDateTime.now());

        // Realizando consulta e emitindo receita
        vet1.realizarConsulta(consulta);
        vet1.emitirReceita(consulta);
    }
}
