package org.masuda;

import java.util.List;

public interface ICrud<T> {
    void salvar(T entidade);
    void atualizar(T entidade);
    void excluir(int id);
    T buscarPorId(int id) throws Exception;
    List<T> listar();
}