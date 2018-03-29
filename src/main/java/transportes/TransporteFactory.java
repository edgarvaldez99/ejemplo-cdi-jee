package transportes;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class TransporteFactory {

	@Produces
	public CATransporte crearTransporte(InjectionPoint injectionPoint) {
		CATransporte transporte = new EstandarTransporte();
        System.out.println("Obtenido el transporte desde el @Produces");
        return transporte;
    }
}
