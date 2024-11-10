package edu.desafio.gof.factorymethod;

public class CartaoCredito implements Pagamento{

    @Override
    public void efetuarPagamento(double total) {
        System.out.printf("Pago em Cartao de crédito: %.2f\n", total);
    }

}
