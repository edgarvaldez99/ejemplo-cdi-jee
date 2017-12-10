package transportes;

import javax.enterprise.inject.Produces;

public class TransporteFactory {
	
	@Produces
	public CATransporte crearTransporte() {
        System.out.println("CATransporte creado con @Produces");
        return new EstandarTransporte();
    }
}
