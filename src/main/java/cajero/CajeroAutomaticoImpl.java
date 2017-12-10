package cajero;

import java.math.BigDecimal;

import transportes.CATransporte;

public class CajeroAutomaticoImpl implements CajeroAutomatico {

	private CATransporte transporte; 

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
