package com.controle_despesa.controller;

import com.controle_despesa.model.dto.ProdutoDTO;
import com.controle_despesa.model.entity.Produto;
import com.controle_despesa.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired// injecao de dependencia
    private ProdutoRepository repository;

    @GetMapping
    public List<ProdutoDTO> listarTudo(){
        return ProdutoDTO.converter(repository.findAll());
    }

    @PostMapping
    public void salvar(@RequestBody  Produto produto){
        repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id, @RequestBody Produto produto){
        Produto existingProduto = null;
        if (repository.findById(id).isPresent())
            existingProduto = repository.findById(id).get();
        existingProduto = produto;
        repository.save(existingProduto);
    }
}
