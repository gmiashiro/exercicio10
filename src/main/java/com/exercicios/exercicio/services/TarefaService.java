package com.exercicios.exercicio.services;

import com.exercicios.exercicio.model.TarefaModel;
import com.exercicios.exercicio.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;

    public TarefaModel save(TarefaModel tarefaModel) {
        return tarefaRepository.save(tarefaModel);
    }

    public void deleteById(Long id) {
        tarefaRepository.deleteById(id);
    }

    public TarefaModel findById(Long id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    public List<TarefaModel> findAll() {
        return tarefaRepository.findAll();
    }
}
