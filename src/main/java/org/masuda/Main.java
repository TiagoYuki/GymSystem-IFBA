package org.masuda;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CrudGenerico<Aluno> alunoCrud = new CrudGenerico<>();

        Aluno aluno1 = new Aluno(1, "João Silva", "12345678901", new Date(), "Mensal", new Date());
        Aluno aluno2 = new Aluno(2, "Maria Souza", "10987654321", new Date(), "Anual", new Date());

        alunoCrud.salvar(aluno1);
        alunoCrud.salvar(aluno2);

        System.out.println("\nLista de alunos:");
        alunoCrud.listar().forEach(System.out::println);

        Aluno alunoAtualizado = new Aluno(1, "João Silva Atualizado", "12345678901", new Date(), "Semestral", new Date());
        alunoCrud.atualizar(alunoAtualizado);

        try {
            Aluno busca = alunoCrud.buscarPorId(1);
            System.out.println("\nAluno encontrado: " + busca);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        alunoCrud.excluir(2);

        System.out.println("\nLista de alunos após exclusão:");
        alunoCrud.listar().forEach(System.out::println);
    }
}