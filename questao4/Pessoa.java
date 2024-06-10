package questao4;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    
    public class Estudante extends Pessoa {
        private String curso;
    
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
}




