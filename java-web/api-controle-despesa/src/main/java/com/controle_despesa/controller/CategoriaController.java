package com.controle_despesa.controller;

import com.controle_despesa.model.entity.Categoria;
import com.controle_despesa.model.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired// injecao de dependencia
    private CategoriaRepository repository;

    @GetMapping
    public List<Categoria> listarTudo(){
        return  repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody  Categoria categoria){
        repository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria existingCategoria = null;
        if(repository.findById(id).isPresent())
            existingCategoria = repository.findById(id).get();
        existingCategoria.setDescricao(categoria.getDescricao());

        repository.save(existingCategoria);
    }
}
