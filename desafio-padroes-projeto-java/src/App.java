import edu.desafio.gof.facade.facade.Facade;
import edu.desafio.gof.factorymethod.Pagamento;
import edu.desafio.gof.factorymethod.PagamentoFactory;
import edu.desafio.gof.factorymethod.TipoPagamento;
import edu.desafio.gof.singleton.SingletonEager;
import edu.desafio.gof.singleton.SingletonLazy;
import edu.desafio.gof.singleton.SingletonLazyHolder;
import edu.desafio.gof.strategy.Comportamento;
import edu.desafio.gof.strategy.ComportamentoAgressivo;
import edu.desafio.gof.strategy.ComportamentoDefensivo;
import edu.desafio.gof.strategy.ComportamentoNormal;
import edu.desafio.gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Singleton
        System.out.println("Singleton");
		System.out.println("-------------------");
		SingletonLazy lazy= SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy= SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager=SingletonEager.getInstancia();
		System.out.println(eager);
		eager=SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder=SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder =SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		System.out.println("-------------------");

        //Strategy
        System.out.println("Strategy");
		System.out.println("-------------------");
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		System.out.println("-------------------");
		
		//Facade	
		System.out.println("Facade");		
		System.out.println("-------------------");
		Facade facade = new Facade();
		facade.migrarCliente("Juan", "123456789");
		System.out.println("-------------------");

		//FactoryMethod
		System.out.println("FactoryMethod");	
		System.out.println("-------------------");	
		Pagamento pagamento = PagamentoFactory.criarPagamento(TipoPagamento.DINHEIRO);
        pagamento.efetuarPagamento(2000.50);
    }

}
