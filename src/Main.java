public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cliente kaike = new Cliente();
        kaike.setNome("Kaike");

        Cliente joao = new Cliente();
        joao.setNome("joao");

        Conta cc = new ContaCorrente(kaike);
        cc.depositar(200);

        cc.sacar(100);
        cc.imprimirExtrato();

        Conta pp = new ContaPopança(joao);
        cc.transfeir(100,pp);
        pp.depositar(4);
        pp.imprimirExtrato();

    }
}