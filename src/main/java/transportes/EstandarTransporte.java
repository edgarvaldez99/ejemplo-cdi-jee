package transportes;

import javax.enterprise.inject.Default;

@Default
public class EstandarTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via Estandar");		
	}	
}
