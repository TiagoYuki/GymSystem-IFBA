package org.masuda;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO implements IDAO<Aluno> {
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void salvar(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno salvo: " + aluno);
    }

    @Override
    public void atualizar(Aluno aluno) {
        try {
            Aluno existente = buscarPorId(aluno.getId());
            int index = alunos.indexOf(existente);
            alunos.set(index, aluno);
            System.out.println("Aluno atualizado: " + aluno);
        } catch (AlunoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }

    @Override
    public void excluir(Aluno aluno) {
        try {
            Aluno existente = buscarPorId(aluno.getId());
            alunos.remove(existente);
            System.out.println("Aluno excluído: " + aluno);
        } catch (AlunoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao excluir aluno: " + e.getMessage());
        }
    }

    @Override
    public Aluno buscarPorId(int id) throws AlunoNaoEncontradoException {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        throw new AlunoNaoEncontradoException("Aluno com id " + id + " não encontrado.");
    }

    @Override
    public List<Aluno> listar() {
        return alunos;
    }
}
