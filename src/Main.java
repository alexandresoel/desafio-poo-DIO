import br.com.alexandresoel.desafio.dominio.Curso;
import br.com.alexandresoel.desafio.dominio.Mentoria;

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

        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Mentoria em Java");
        mentoria.setTitulo("Mentoria de POO");
        System.out.println(curso);
        System.out.println(mentoria);
        }
    }
