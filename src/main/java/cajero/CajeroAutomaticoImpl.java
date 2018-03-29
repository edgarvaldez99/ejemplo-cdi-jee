package cajero;

import java.math.BigDecimal;

import javax.inject.Inject;

import transportes.CATransporte;
import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

public class CajeroAutomaticoImpl implements CajeroAutomatico {

	@Inject
	@Transporte(tipo=TipoTransporte.JSON, version=1, reintentos=5)
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