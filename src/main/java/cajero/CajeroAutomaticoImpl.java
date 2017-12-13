package cajero;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import transportes.CATransporte;
import transportes.qualifiers.Agrupador;
import transportes.qualifiers.Json;
import transportes.qualifiers.Soap;

public class CajeroAutomaticoImpl implements CajeroAutomatico {

	CATransporte transporte;
	CATransporte estandarTransporte;
	CATransporte soapTransporte;
	CATransporte jsonTransporte;

	//Datos utilizados para mostrar el ejemplo de @PostConstruct
	//Estos bien podrían traerse de base de datos o de algún properties pero para el ejemplo los inicializamos ya con valores
	private boolean usarJSON = true;
    private boolean detrasDelFirewall = true;

	@Inject
    public CajeroAutomaticoImpl(CATransporte estandarTransporte, @Soap @Agrupador CATransporte soapTransporte, @Json @Agrupador CATransporte jsonTransporte) {
        this.estandarTransporte = estandarTransporte;
		this.soapTransporte = soapTransporte;
		this.jsonTransporte = jsonTransporte;
    }

	@PostConstruct
	protected void init() {
		if (!detrasDelFirewall) {
			transporte = estandarTransporte;
        } else {
            if (usarJSON) {
            	transporte = jsonTransporte;
            } else {
            	transporte = soapTransporte;
            }
        }
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
