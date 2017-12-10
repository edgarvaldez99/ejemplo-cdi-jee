package cajero;

import java.math.BigDecimal;

import javax.inject.Inject;

import transportes.CATransporte;
import transportes.qualifiers.Soap;

public class CajeroAutomaticoImpl implements CajeroAutomatico {

	CATransporte transporte;

	@Inject
    public CajeroAutomaticoImpl(@Soap CATransporte transporte) {
        this.transporte = transporte;
    }

	public CATransporte getTransporte() {
		return transporte;
	}

	public void setTransporte(CATransporte transporte) {
		this.transporte = transporte;
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
