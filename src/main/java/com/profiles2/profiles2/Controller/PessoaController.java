package com.profiles2.profiles2.Controller;

import com.profiles2.profiles2.Pessoa;
import com.profiles2.profiles2.Service.PessoaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@Profile("pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("/pessoa/")
    @ResponseBody
    public List<Pessoa> listPessoaByName(@RequestParam(required = false, defaultValue = "") String name) {
        return pessoaService.getPessoaByName(name);
    }
}
