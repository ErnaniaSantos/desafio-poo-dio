package br.com.dio.desafio.dominio;

import br.com.dio.desafio.Professor;

public class Curso extends Conteudo {
    private int cargaHoraria;
    private Professor professor;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

   
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor=" + professor +
                '}';
    }
}