package cajero;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import transportes.CATransporte;
import transportes.qualifiers.Json;
import transportes.qualifiers.Soap;

public class CajeroAutomaticoImpl implements CajeroAutomatico {

	@Inject @Soap
	private Instance<CATransporte> soapTransporte;

	@Inject @Json
	private Instance<CATransporte> jsonTransporte;

	@Inject @Default
	private Instance<CATransporte> defaultTransporte;

	private CATransporte transporte;

	@PostConstruct
	protected void init() {
		if (!defaultTransporte.isUnsatisfied()) {
			System.out.println("Elegido el Default");
			transporte = defaultTransporte.iterator().next();
		} else if (!jsonTransporte.isUnsatisfied()) {
			System.out.println("Elegido JSON");
			transporte = jsonTransporte.iterator().next();
		} else if (!soapTransporte.isUnsatisfied()) {
			System.out.println("Elegido SOAP");
			transporte = soapTransporte.iterator().next();
		}
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