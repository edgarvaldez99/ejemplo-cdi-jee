package principal;

import java.math.BigDecimal;

import cajero.CajeroAutomatico;
import cajero.CajeroAutomaticoImpl;
import transportes.CATransporte;
import transportes.EstandarTransporte;

public class CAMain {

	public static void main(String[] args) {
		CajeroAutomatico ca = new CajeroAutomaticoImpl();
		CATransporte t = new EstandarTransporte();
		((CajeroAutomaticoImpl) ca).setTransporte(t);
		ca.depositar(new BigDecimal("100.00"));
	}
}
