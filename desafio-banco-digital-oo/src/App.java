public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Banco Digital");

        //cliente 1
        System.out.println("=>  Test 1");
        Cliente cliente1 = new Cliente();
		cliente1.setNome("Ana Mendo");
		
		Conta ccorriente1 = new ContaCorrente(cliente1);
		Conta cpoupanca1 = new ContaPoupanca(cliente1);

		ccorriente1.depositar(500);
		ccorriente1.transferir(200, cpoupanca1);
		
		ccorriente1.imprimirExtrato();
		cpoupanca1.imprimirExtrato();

        //cliente 2
        System.out.println("=> Test 2");
        Cliente cliente2 = new Cliente();
		cliente2.setNome("Mario Torres");
		
		Conta ccorriente2 = new ContaCorrente(cliente2);
		ccorriente2.depositar(400);		
		ccorriente2.imprimirExtrato();
        ccorriente2.sacar(50);
        ccorriente2.imprimirExtrato();

        //cliente 3
        System.out.println("=> Test 3");
        Cliente cliente3 = new Cliente();
		cliente3.setNome("Braulio Nu");
		
		Conta cpoupanca2 = new ContaPoupanca(cliente3);	
		cpoupanca2.depositar(500);			
		cpoupanca2.imprimirExtrato();


        System.out.println("=> Test 4");
        if (ccorriente2.transferir(700, cpoupanca2)==false) 
        System.out.println("No se pudo realizar la Transferencia");

    }
}
