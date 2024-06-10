package questao8;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Trabalhador> trabalhadores;

    public Empresa() {
        trabalhadores = new ArrayList<>();
    }

    public void adicionarTrabalhador(Trabalhador trabalhador) {
        trabalhadores.add(trabalhador);
        trabalhador.trabalhar();
    }
}

