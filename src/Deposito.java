public class Deposito extends Operacao {

    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return "Depósito:\t" + this.valor;
    }
}
