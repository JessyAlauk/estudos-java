package javacore.polimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário desse mês: " + funcionario.getSalario());
        if (funcionario instanceof Gerente g) {
            System.out.println("Participação nos lucros: " + g.getPnl());
        }
        if (funcionario instanceof Vendedor v) {
            System.out.println("Total de vendas: " + v.getTotalvendas());
        }
    }
}
