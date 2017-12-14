package transportes;

import transportes.qualifiers.Agrupador;
import transportes.qualifiers.Json;
import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

@Json
@Agrupador
@Transporte(tipo=TipoTransporte.JSON)
public class JsonTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via JSON");		
	}
}
