package com.profiles2.profiles2;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Repository;

@Getter
@Repository
public class PessoaRepo {

    private List<Pessoa> turma = new ArrayList<>();

    public PessoaRepo() {
        turma.add(new Pessoa("Andreo", 24, ""));
        turma.add(new Pessoa("Jose", 70, ""));
        turma.add(new Pessoa("Edgar", 50, ""));
        turma.add(new Pessoa("Gabriel", 29, ""));
        turma.add(new Pessoa("Andressa", 27, ""));
    }

}
