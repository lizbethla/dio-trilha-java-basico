package edu.desafio.gof.factorymethod;

public class PagamentoFactory {
    public static Pagamento criarPagamento(TipoPagamento tipoPagamento) {
        switch (tipoPagamento) {
            case DINHEIRO:
                return new Dinheiro();
            case CARTAOCREDITO:
                return new CartaoCredito();
            default:
                return null;
        }
    }
}
