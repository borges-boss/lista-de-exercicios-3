package questao10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        Carro carro = new Carro();
        Moto moto = new Moto();

        veiculos.add(carro);
        veiculos.add(moto);

        for (Veiculo v : veiculos) {
            v.mover();
        }
    }
}
