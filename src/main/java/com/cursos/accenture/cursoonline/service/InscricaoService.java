package com.cursos.accenture.cursoonline.service;

import com.cursos.accenture.cursoonline.entity.Inscricao;
import com.cursos.accenture.cursoonline.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    public Inscricao save(Inscricao inscricao) {
        inscricao.setDataInscricao(new Date());
        return inscricaoRepository.save(inscricao);
    }

    public List<Inscricao> findByAlunoId(Long alunoId) {
        return inscricaoRepository.findByAlunoId(alunoId);
    }

    public List<Inscricao> findByCursoId(Long cursoId) {
        return inscricaoRepository.findByCursoId(cursoId);
    }
}