package com.profiles2.profiles2.Service;

import com.profiles2.profiles2.Pessoa;
import com.profiles2.profiles2.PessoaRepo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    PessoaRepo pessoaRepo;

    public List<Pessoa> getPessoaByName(String pessoaNome) {
        List<Pessoa> list = new ArrayList<>();
        pessoaRepo.getTurma().forEach((pessoa) -> list.add(pessoa));

        if (!pessoaNome.equals("")) {
            return list
                    .stream()
                    .filter(pessoa -> pessoa.getNome().equals(pessoaNome))
                    .collect(Collectors.toList());
        }
        return list;
    }
}
