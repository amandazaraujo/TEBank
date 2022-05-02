public class ContaCorrente {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

}