package questao6;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
    }
}
