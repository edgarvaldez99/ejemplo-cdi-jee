package transportes;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;

public class TransporteFactory {

	@Produces
	public CATransporte crearTransporte(InjectionPoint injectionPoint) {
		Annotated annotated = injectionPoint.getAnnotated();
		TransporteConfig transporteConfig = annotated.getAnnotation(TransporteConfig.class);
		CATransporte transporte = new EstandarTransporte();
		transporte.setReintentos((transporteConfig == null) ? TransporteConfig.REINTENTOS_POR_DEFECTO : transporteConfig.reintentos());
        System.out.println("Obtenido el transporte desde el @Produces");
        return transporte;
    }
}
