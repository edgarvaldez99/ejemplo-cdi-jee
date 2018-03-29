package cajero;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import transportes.CATransporte;


public class CajeroAutomaticoImpl implements CajeroAutomatico {

	@Inject
	private Instance<CATransporte> todosLosTransportes;

	@PostConstruct
	protected void init() {

		System.out.println("Encontró varias instancias de CATransporte? " + todosLosTransportes.isAmbiguous() );
		System.out.println("No encontró instancia de CATransporte ? " + todosLosTransportes.isUnsatisfied() );
	}

	public void depositar(BigDecimal bd) {
		System.out.println("Para depositar");
		for (CATransporte transporte : this.todosLosTransportes) {
			transporte.comunicarseConElBanco(null);
		}
	}

	public void extraer(BigDecimal bd) {
		System.out.println("Para extraer");
		for (CATransporte transporte : this.todosLosTransportes) {
			transporte.comunicarseConElBanco(null);
		}
	}
}