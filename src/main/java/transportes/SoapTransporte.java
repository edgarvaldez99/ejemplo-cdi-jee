package transportes;

import transportes.qualifiers.Agrupador;
import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

@Agrupador
@Transporte(tipo=TipoTransporte.SOAP)
public class SoapTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via SOAP");		
	}
}
