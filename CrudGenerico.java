package org.masuda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class CrudGenerico<T extends Identificavel> implements ICrud<T> {
    private List<T> entidades = new ArrayList<>();

    @Override
    public void salvar(T entidade) {
        entidades.add(entidade);
        System.out.println("Entidade salva: " + entidade);
    }

    @Override
    public void atualizar(T entidade) {
        try {
            T existente = buscarPorId(entidade.getId());
            int index = entidades.indexOf(existente);
            entidades.set(index, entidade);
            System.out.println("Entidade atualizada: " + entidade);
        } catch (Exception e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        }
    }

    @Override
    public void excluir(int id) {
        try {
            T existente = buscarPorId(id);
            entidades.remove(existente);
            System.out.println("Entidade excluída: " + existente);
        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e.getMessage());
        }
    }

    @Override
    public T buscarPorId(int id) throws Exception {
        Optional<T> entidade = entidades.stream().filter(e -> e.getId() == id).findFirst();
        return entidade.orElseThrow(() -> new Exception("Entidade com id " + id + " não encontrada."));
    }

    @Override
    public List<T> listar() {
        return entidades;
    }
}