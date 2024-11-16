import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

		Conta cc1 = new ContaCorrente(cliente1);
		Conta cp1 = new ContaPoupanca(cliente1);
		
		Conta cc2 = new ContaCorrente(cliente2);
		Conta cp2 = new ContaPoupanca(cliente2);
		
		Banco banco = new Banco();
        banco.setNome("Banco Digital");
        banco.setContas(new ArrayList<>());
        banco.getContas().add(cc1);
        banco.getContas().add(cp1);
        banco.getContas().add(cc2);
        banco.getContas().add(cp2);

		
		cc1.depositar(100);
		cc1.imprimirExtrato();
		cp1.imprimirExtrato();
		
		cc2.depositar(500);
		cc2.imprimirExtrato();
		cc2.imprimirExtrato();
		
		banco.listarClientes();
    }
}
