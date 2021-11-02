package org.serratec.backend.principal;

import java.util.ArrayList;
import java.util.List;
import org.serratec.backend.principal.domain.Aluno;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private static List<Aluno> alunos = new ArrayList<Aluno>();

    static {
        alunos.add(new Aluno(1, "João", "(24)98787777"));
        alunos.add(new Aluno(2, "Maria", "(24)98773312"));
        alunos.add(new Aluno(3, "José", "(24)98727378231"));
    }

    @GetMapping
    public List<Aluno> todosOsAlunos(){
        return alunos;
    }
}