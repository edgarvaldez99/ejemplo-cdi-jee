package cajero;

import java.math.BigDecimal;

import javax.inject.Inject;

import transportes.CATransporte;
import transportes.qualifiers.Agrupador;
import transportes.qualifiers.Soap;

public class CajeroAutomaticoImpl implements CajeroAutomatico {

	CATransporte estandarTransporte;
	CATransporte soapTransporte;

	@Inject
    public CajeroAutomaticoImpl(CATransporte estandarTransporte, @Soap @Agrupador CATransporte soapTransporte) {
        this.estandarTransporte = estandarTransporte;
		this.soapTransporte = soapTransporte;
    }

	public CATransporte getTransporte() {
		return estandarTransporte;
	}

	public void setTransporte(CATransporte transporte) {
		this.estandarTransporte = transporte;
	}

	public void depositar(BigDecimal bd) {
		System.out.println("Para depositar");
		estandarTransporte.comunicarseConElBanco(null);
		soapTransporte.comunicarseConElBanco(null);
	}

	public void extraer(BigDecimal bd) {
		System.out.println("Para extraer");
		estandarTransporte.comunicarseConElBanco(null);
		soapTransporte.comunicarseConElBanco(null);
	}
}
