package transportes;

import transportes.qualifiers.Agrupador;
import transportes.qualifiers.Json;
import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

@Json
@Agrupador
@Transporte(tipo=TipoTransporte.JSON, version=1)
public class JsonTransporte implements CATransporte {

	private int reintentos;

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via JSON con " + this.reintentos + " reintento" + (this.reintentos > 1 ? "s" : ""));		
	}

	public void setReintentos(int reintentos) {
		this.reintentos = reintentos;	
	}
}