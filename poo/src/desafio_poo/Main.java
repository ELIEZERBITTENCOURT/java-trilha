package desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso Java", "Aprenda Java do básico ao avançado", 8);
        Curso cursoPython = new Curso("Curso Python", "Aprenda Python", 6);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Tire suas dúvidas sobre Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java", LocalDate.now(), LocalDate.now().plusMonths(2));
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devMaria = new Dev("Maria");
        devMaria.inscrever(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());

        devMaria.progredir();
        System.out.println("Conteúdos concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Total: " + devMaria.calcularTotalXp());
    }
}
