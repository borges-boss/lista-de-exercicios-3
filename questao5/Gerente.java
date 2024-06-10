package questao5;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salario, String departamento, double bonus) {
        super(salario, departamento);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
