package com.controle_despesa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //essa class vai ser um controller
@RequestMapping("/hello") // path ou endereco do recurso
public class HelloController {
    @GetMapping // o tipo de verbo que a api irá receber
    public String getHello() {
        return "Hello Spring! Tudo bem?";
    }
    @GetMapping("/nome_completo")
    public String nomeCompleto(){
        return  "Palloma Ruysa";
    }
}
