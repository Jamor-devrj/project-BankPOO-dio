public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Jaime");

        Conta corrente = new ContaCorrente(cliente);
        corrente.depositar(100);


        Conta poupanca = new ContaPoupanca(cliente);
        poupanca.depositar(80);

        corrente.transferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
