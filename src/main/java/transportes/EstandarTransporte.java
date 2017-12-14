package transportes;

import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

@Transporte(tipo=TipoTransporte.ESTANDAR)
public class EstandarTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via Estandar");		
	}	
}
