package transportes;

import transportes.qualifiers.Soap;

@Soap
public class SoapTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via SOAP");		
	}
}
