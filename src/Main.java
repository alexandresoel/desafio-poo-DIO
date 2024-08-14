import br.com.alexandresoel.desafio.dominio.*;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setCargaHoraria(200);
        curso.setTitulo("Java poo");
        curso.setDescricao("Curso em java");

        Conteudo conteudo1 = new Mentoria();
        Conteudo conteudo2 = new Curso();

        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Mentoria em Java");
        mentoria.setTitulo("Mentoria de POO");
//        System.out.println(curso);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descricao bootcamp Java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        dev1.setNome("Camila");
        System.out.println(dev1.getConteudoInscritos());
        dev2.setNome("Charlotte");
        System.out.println(dev2.getConteudoInscritos());

        dev1.inscreverBootCamp(bootcamp);
        System.out.println(dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println(dev1.getConteudoConcluidos());
        System.out.println(dev1.calcularXP());

        dev2.inscreverBootCamp(bootcamp);
        System.out.println(dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println(dev2.getConteudoConcluidos());
        System.out.println(dev2.calcularXP());






        }
    }
