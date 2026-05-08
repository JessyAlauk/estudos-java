package javacore.polimorfismo.classes;

public class Vendedor extends Funcionario {

    private double totalvendas;

    public Vendedor(String nome, double salario, double totalvendas) {
        super(nome, salario);
        this.totalvendas = totalvendas;
    }

    public double getTotalvendas() {
        return totalvendas;
    }

    public void setTotalvendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (totalvendas * 0.5);
    }
}
