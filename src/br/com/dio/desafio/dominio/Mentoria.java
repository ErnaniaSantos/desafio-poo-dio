package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import br.com.dio.desafio.Professor;

public class Mentoria extends Conteudo {
    private LocalDate data;
    private Professor professor;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ", professor=" + professor +
                '}';
    }
}
