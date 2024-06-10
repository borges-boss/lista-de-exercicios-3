package questao8;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario funcionario = new Funcionario(2000, "Marketing");
        Gerente gerente = new Gerente(5000, "Vendas", 1000);

        empresa.adicionarTrabalhador(funcionario);
        empresa.adicionarTrabalhador(gerente);
    }
}
