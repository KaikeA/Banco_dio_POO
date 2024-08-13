public interface iConta {

    void sacar(double valor);



   void depositar(double valor);
   void transfeir(double valor ,  Conta contaDestino);
   void imprimirExtrato();
}
