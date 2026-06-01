package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.model.TarefaModel;
import com.exercicios.exercicio.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller // Gerenciar o fluxo de navegação
@RequestMapping(path = "/produtos") // Definir uma rota base da url
public class TarefaController {

    @Autowired // Injetar dependecias automaticamente
    TarefaService tarefaService;

    @PostMapping // mapear requisições http do tipo POST
    public TarefaModel salvar(@RequestBody /* Converte o body do json em um objeto java */TarefaModel tarefaModel) {
        return tarefaService.save(tarefaModel);
    }

    @DeleteMapping("/{id}") // mapear requisições http do tipo DELETE
    public void deletar(@PathVariable /* extrair um valor diretamente da url  */ Long id) {
        tarefaService.deleteById(id);
    }

    @GetMapping // mapear requisições http do tipo GET
    public List<TarefaModel> listar() {
        return tarefaService.findAll();
    }

    @GetMapping("/{id}")
    public TarefaModel buscar(@PathVariable Long id) {
        return tarefaService.findById(id);
    }
}
