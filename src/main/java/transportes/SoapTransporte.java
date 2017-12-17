package transportes;

import transportes.qualifiers.Agrupador;
import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

@Agrupador
@Transporte(tipo=TipoTransporte.SOAP)
public class SoapTransporte implements CATransporte {

	private int reintentos;

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via SOAP con" + this.reintentos + " reintento" + (this.reintentos > 1 ? "s" : ""));		
	}

	public void setReintentos(int reintentos) {
		this.reintentos = reintentos;
	}
}