package com.profiles2.profiles2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Profile("hello")
@EnableAutoConfiguration
@RestController
public class HelloPessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("/pessoa/")
    @ResponseBody
    public String listPessoaByName(@RequestParam(required = false, defaultValue = "") String name) {
        return String.format("Olá %s, tudo bem com você?", name);
    }
}