import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import edu.desafio.bootcamp.dominio.Bootcamp;
import edu.desafio.bootcamp.dominio.Conteudo;
import edu.desafio.bootcamp.dominio.Curso;
import edu.desafio.bootcamp.dominio.Desafio;
import edu.desafio.bootcamp.dominio.Dev;
import edu.desafio.bootcamp.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("descricao curso JS");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Github");
        curso3.setDescricao("descricao curso Github");
        curso3.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descricao mentoria Java");
        mentoria1.setData(LocalDate.now());

        Desafio desafio1 = new Desafio();
        desafio1.setTitulo("Desafio java poo");
        desafio1.setDescricao("descricao desafio Java poo");
        desafio1.setRepositorio("http://github.com/dio/java/desafiojavapoo");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        Set<Conteudo> listaConteudos = new LinkedHashSet<>();
        listaConteudos.add(curso1);
        listaConteudos.add(curso2);
        listaConteudos.add(curso3);
        listaConteudos.add(mentoria1);
        listaConteudos.add(desafio1);
        bootcamp.setConteudos(listaConteudos);

        System.out.println("=====Test 1======");
        Dev dev1 = new Dev();
        dev1.setNome("Maria");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + dev1.getNome());
        System.out.println("Conteudos inscritos : " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("-> Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("-> Conteudos pendencia: " + dev1.getConteudosInscritos());
        System.out.println("XP: "+ dev1.calcularTotalXP());

        System.out.println("=====Test 2======");
        Dev dev2 = new Dev();
        dev2.setNome("Juan");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + dev2.getNome());
        System.out.println("Conteudos inscritos : " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("-> Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("-> Conteudos pendencia: " + dev2.getConteudosInscritos());
        System.out.println("XP: "+ dev2.calcularTotalXP());

        System.out.println("=====Test 3======");
        Dev dev3 = new Dev();
        dev3.setNome("Fernando");
        System.out.println("Dev: " + dev3.getNome());
        dev3.progredir();

    }
}
