package com.cursos.accenture.cursoonline.controller;

import com.cursos.accenture.cursoonline.entity.Aluno;
import com.cursos.accenture.cursoonline.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
        Aluno savedAluno = alunoService.save(aluno);
        return ResponseEntity.status(201).body(savedAluno);
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.findAll();
    }
}