package com.cursos.accenture.cursoonline.controller;

import com.cursos.accenture.cursoonline.entity.Inscricao;
import com.cursos.accenture.cursoonline.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscricoes")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping
    public ResponseEntity<?> inscreverAluno(@RequestBody Inscricao inscricao) {
        if (inscricao.getAluno() == null) {
            return ResponseEntity.badRequest().body("Aluno é obrigatório");
        }
        inscricaoService.save(inscricao);
        return ResponseEntity.ok().body("Inscrição realizada com sucesso");
    }

    @GetMapping("/aluno/{alunoId}")
    public ResponseEntity<List<Inscricao>> listarInscricoesPorAluno(@PathVariable Long alunoId) {
        List<Inscricao> inscricoes = inscricaoService.findByAlunoId(alunoId);
        return ResponseEntity.ok(inscricoes);
    }

    @GetMapping("/curso/{cursoId}")
    public ResponseEntity<List<Inscricao>> listarInscricoesPorCurso(@PathVariable Long cursoId) {
        List<Inscricao> inscricoes = inscricaoService.findByCursoId(cursoId);
        return ResponseEntity.ok(inscricoes);
    }
}
