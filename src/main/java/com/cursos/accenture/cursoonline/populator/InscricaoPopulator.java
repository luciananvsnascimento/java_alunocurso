package com.cursos.accenture.cursoonline.populator;

import com.cursos.accenture.cursoonline.dto.AlunoDTO;
import com.cursos.accenture.cursoonline.dto.CursoDTO;
import com.cursos.accenture.cursoonline.dto.InscricaoDTO;
import com.cursos.accenture.cursoonline.entity.Aluno;
import com.cursos.accenture.cursoonline.entity.Curso;
import com.cursos.accenture.cursoonline.entity.Inscricao;

public class InscricaoPopulator {
    public static AlunoDTO toAlunoDTO(Aluno aluno) {
        AlunoDTO dto = new AlunoDTO();
        dto.setId(aluno.getId());
        dto.setNome(aluno.getNome());
        dto.setEmail(aluno.getEmail());
        return dto;
    }

    public static CursoDTO toCursoDTO(Curso curso) {
        CursoDTO dto = new CursoDTO();
        dto.setId(curso.getId());
        dto.setNome(curso.getNome());
        dto.setDescricao(curso.getDescricao());
        return dto;
    }

    public static InscricaoDTO toInscricaoDTO(Inscricao inscricao) {
        InscricaoDTO dto = new InscricaoDTO();
        dto.setId(inscricao.getId());
        dto.setAlunoId(inscricao.getAluno().getId());
        dto.setCursoId(inscricao.getCurso().getId());
        dto.setDataInscricao(inscricao.getDataInscricao());
        return dto;
    }
}