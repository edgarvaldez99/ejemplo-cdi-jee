package transportes;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class TransporteFactory {
	
	@Inject
	CATransporte transporte;

	@Produces
	public CATransporte crearTransporte() {
        System.out.println("CATransporte creado con @Produces");
        return transporte;
    }
}
