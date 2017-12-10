package transportes;

import transportes.qualifiers.Agrupador;
import transportes.qualifiers.Json;

@Json
@Agrupador
public class JsonTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via JSON");		
	}
}
