package questao9;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa("João", 30);
        Estudante estudante = new Estudante("Maria", 20, "Engenharia");

        pessoas.add(pessoa);
        pessoas.add(estudante);

        for (Pessoa p : pessoas) {
            p.exibirInformacoes();
        }
    }
}

