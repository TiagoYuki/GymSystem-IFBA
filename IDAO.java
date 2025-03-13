package org.masuda;

import java.util.List;

public interface IDAO<T> {
    void salvar(T entidade);
    void atualizar(T entidade);
    void excluir(T entidade);
    T buscarPorId(int id) throws Exception;
    List<T> listar();
}
