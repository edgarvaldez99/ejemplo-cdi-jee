package transportes;

import transportes.qualifiers.Agrupador;
import transportes.qualifiers.Soap;

@Soap
@Agrupador
public class SoapTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via SOAP");		
	}
}
