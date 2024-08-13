public class ContaPopança extends Conta {

    public ContaPopança(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("Extrato conta Poupanca");
        super.imprimirInfonsComuns();

    }
}
