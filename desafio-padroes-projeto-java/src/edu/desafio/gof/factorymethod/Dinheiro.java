package edu.desafio.gof.factorymethod;

public class Dinheiro implements Pagamento{

    @Override
    public void efetuarPagamento(double total) {
        System.out.printf("Pago em dinheiro: %.2f\n", total);
    }

}
