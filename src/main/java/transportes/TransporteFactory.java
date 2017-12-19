package transportes;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.InjectionPoint;

public class TransporteFactory {

	@Produces
	public CATransporte crearTransporte(InjectionPoint injectionPoint) {
		/* Con annotated obtenemos una referencia a las anotaciones del bean 
		 * inyectado, ya sea a nivel de campo, constructor o método
		 */
		Annotated annotated = injectionPoint.getAnnotated();
		TransporteConfig transporteConfigNivelCampo = annotated.getAnnotation(TransporteConfig.class);
		System.out.println(transporteConfigNivelCampo);
		/* Con el método getBean se obtiene objeto que posee una referencia 
		 * a la clase donde se está haciendo la inyección.
		 * A este objeto se lo conoce como Bean Manejado o ManagedBean
		 */
		Bean<?> bean = injectionPoint.getBean();
		/*
		 * Para obtener la referencia directa de la clase se utiliza el método getBeanClass
		 */
		Class<?> clazz = bean.getBeanClass();
		/*
		 * Al poseer clazz una referencia a la clase en donde se está haciendo la inyection,
		 * el método getAnnotation solo puede traernos referencia de anotaciones a nivel de clases.
		 */
		TransporteConfig transporteConfigNivelClase = clazz.getAnnotation(TransporteConfig.class);
		CATransporte transporte = new EstandarTransporte();
		transporte.setReintentos((transporteConfigNivelClase == null) ? TransporteConfig.REINTENTOS_POR_DEFECTO : transporteConfigNivelClase.reintentos());
        System.out.println("Obtenido el transporte desde el @Produces");
        return transporte;
    }
}
