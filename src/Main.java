import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descriçaõ do curso de JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descriçaõ do curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Mentoria JAVA");
        mentoria.setDescricao("Descrição do curso de Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp Java Developer");
        bootcamp.setDescricao("Descrição curso.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAntonio = new Dev();
        devAntonio.setNome("Antonio");
        devAntonio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devAntonio.getConteudosInscritos());
        devAntonio.progredir();
        System.out.println("Conteudos Concluidos " + devAntonio.getConteudosConcluidos());

        System.out.println("------------------------------------------------------------------");

        Dev devSilva = new Dev();
        devSilva.setNome("Silva");
        devSilva.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devSilva.getConteudosInscritos());
        devSilva.progredir();
        System.out.println("Conteudos Concluidos " + devSilva.getConteudosConcluidos());

    }
}
