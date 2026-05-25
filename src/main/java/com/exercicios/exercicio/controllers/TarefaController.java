package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.model.TarefaModel;
import com.exercicios.exercicio.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/produtos")
public class TarefaController {

    @Autowired
    TarefaService tarefaService;

    @PostMapping
    public TarefaModel salvar(@RequestBody TarefaModel tarefaModel) {
        return tarefaService.save(tarefaModel);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tarefaService.deleteById(id);
    }

    @GetMapping
    public List<TarefaModel> listar() {
        return tarefaService.findAll();
    }

    @GetMapping("/{id}")
    public TarefaModel buscar(@PathVariable Long id) {
        return tarefaService.findById(id);
    }
}
