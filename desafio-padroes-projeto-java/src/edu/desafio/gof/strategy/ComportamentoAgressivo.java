package edu.desafio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movimiento agressivo");
		
	}

}
