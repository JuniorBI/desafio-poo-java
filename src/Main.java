import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso Mentoria JAVA");
        mentoria.setDescricao("Descrição do curso de Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);
    }
}