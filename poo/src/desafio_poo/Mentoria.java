package desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate localData;

    public Mentoria(String titulo, String descricao, LocalDate localData) {
        super(titulo, descricao);
        this.localData = localData;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: " + super.toString() + ", Data: " + localData;
    }

    public LocalDate getLocalData() {
        return localData;
    }
}
