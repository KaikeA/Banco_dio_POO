import javax.swing.plaf.synth.SynthOptionPaneUI;

public  abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia =  AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        if(valor > saldo){
            throw new RuntimeException("Valor Indisponivel");

        }else{
            saldo -= valor; // saldo = saldo + valor

        }
    }

    @Override
    public void depositar(double valor) {
        if(valor <=0){
            throw new RuntimeException("Valor precisa ser maior que 0");
        }else{
            saldo += valor; // saldo = saldo + valor
        }
    }

    @Override
    public void transfeir(double valor, Conta contaDestino) {
        if(saldo < valor){
            throw new RuntimeException("Voce nao tem saldo");

        }else{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }

    }

    protected void imprimirInfonsComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
