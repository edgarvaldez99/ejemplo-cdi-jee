package transportes;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class TransporteFactory {

	@Produces
	public CATransporte crearTransporte(InjectionPoint injectionPoint) {
		System.out.println("Anotado " + injectionPoint.getAnnotated());
        System.out.println("bean " + injectionPoint.getBean());
        System.out.println("Miembro " + injectionPoint.getMember());
        System.out.println("Qualifiers " + injectionPoint.getQualifiers());
        System.out.println("Tipo " + injectionPoint.getType());
        System.out.println("Es Delegado " + injectionPoint.isDelegate());
        System.out.println("Es Transitorio " + injectionPoint.isTransient());
        return new EstandarTransporte();
    }
}
