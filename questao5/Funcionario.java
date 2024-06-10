package questao5;

public class Funcionario {
    protected double salario;
    protected String departamento;

    public Funcionario(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
