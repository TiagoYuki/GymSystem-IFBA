package org.masuda;

import java.util.Date;

public class Aluno extends Pessoa {
    private String tipoMatricula;
    private Date dataInscricao;

    public Aluno(int id, String nome, String cpf, Date dataNascimento,
                 String tipoMatricula, Date dataInscricao) {
        super(id, nome, cpf, dataNascimento);
        this.tipoMatricula = tipoMatricula;
        this.dataInscricao = dataInscricao;
    }

    public String getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(String tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf
                + ", dataNascimento=" + dataNascimento
                + ", tipoMatricula=" + tipoMatricula
                + ", dataInscricao=" + dataInscricao + "]";
    }
}
