package entities;

import java.time.LocalDateTime;

public class Consulta {
    private Veterinario veterinario;
    private Animal animal;
    private LocalDateTime dataHora;

    public Consulta(Veterinario veterinario, Animal animal, LocalDateTime dataHora) {
        this.veterinario = veterinario;
        this.animal = animal;
        this.dataHora = dataHora;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
