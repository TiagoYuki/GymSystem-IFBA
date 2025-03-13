package org.masuda;

import java.util.Date;

public class Aluno extends Pessoa implements Identificavel {
    private String plano;
    private Date dataMatricula;

    public Aluno(int id, String nome, String cpf, Date dataNascimento, String plano, Date dataMatricula) {
        super(id, nome, cpf, dataNascimento);
        this.plano = plano;
        this.dataMatricula = dataMatricula;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Aluno{id=" + id + ", nome='" + nome + "', plano='" + plano + "'}";
    }
}