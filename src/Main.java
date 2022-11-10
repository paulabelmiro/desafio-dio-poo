import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ devPaula.getNome() + ": " + devPaula.getConteudosInscritos());
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos "+ devPaula.getNome() + ": " + devPaula.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ devPaula.getNome() + ": " + devPaula.getConteudosConcluidos());
        System.out.println("XP: " + devPaula.calcularTotalXp());

        System.out.println(">--------------------------------<");

        Dev devLilica = new Dev();
        devLilica.setNome("Lilica");
        devLilica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+ devLilica.getNome() + ": " + devLilica.getConteudosInscritos());
        devLilica.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos "+ devLilica.getNome() + ": " + devLilica.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+ devLilica.getNome() + ": " + devLilica.getConteudosConcluidos());
        System.out.println("XP: " + devLilica.calcularTotalXp());
    }
}
