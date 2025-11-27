public class Saque extends Operacao {

    public Saque(double valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return "Saque:\t" + this.valor;
    }
}
