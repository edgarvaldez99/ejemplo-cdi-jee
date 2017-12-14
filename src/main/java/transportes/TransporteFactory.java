package transportes;

import javax.enterprise.inject.Produces;

import transportes.qualifiers.Agrupador;
import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

public class TransporteFactory {

	//Datos utilizados para mostrar el ejemplo de @PostConstruct
	//Estos bien podrían traerse de base de datos o de algún properties pero para el ejemplo los inicializamos ya con valores
	private boolean usarJSON = true;
    private boolean detrasDelFirewall = true;

	@Produces
	public CATransporte crearTransporte(@Transporte(tipo=TipoTransporte.SOAP) @Agrupador CATransporte soapTransporte, @Transporte(tipo=TipoTransporte.JSON) @Agrupador CATransporte jsonTransporte) {
        System.out.println("CATransporte creado con @Produces");
        if (detrasDelFirewall) {
            if (usarJSON) {
            	System.out.println("Retornado transporte tipo Json desde el @Produces");
            	return jsonTransporte;
            } else {
            	System.out.println("Retornado transporte tipo Soap desde el @Produces");
            	return soapTransporte;
            }
        }
        System.out.println("Retornado transporte tipo Estandar desde el @Produces");
        return new EstandarTransporte();
    }
}
