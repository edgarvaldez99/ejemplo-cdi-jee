package cajero;

import java.math.BigDecimal;

import javax.inject.Inject;

import transportes.CATransporte;
import transportes.TransporteConfig;

@TransporteConfig(reintentos=17)
public class CajeroAutomaticoImpl implements CajeroAutomatico {

	@TransporteConfig(reintentos=9)
	@Inject
	CATransporte transporte;

	public CATransporte getTransporte() {
		return transporte;
	}

	public void depositar(BigDecimal bd) {
		System.out.println("Para depositar");
		transporte.comunicarseConElBanco(null);
	}

	public void extraer(BigDecimal bd) {
		System.out.println("Para extraer");
		transporte.comunicarseConElBanco(null);
	}
}