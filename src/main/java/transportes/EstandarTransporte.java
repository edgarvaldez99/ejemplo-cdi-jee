package transportes;

import transportes.qualifiers.TipoTransporte;
import transportes.qualifiers.Transporte;

@Transporte(tipo=TipoTransporte.ESTANDAR)
public class EstandarTransporte implements CATransporte {

	private int reintentos;

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via Estandar con " + this.reintentos + " reintento" + (this.reintentos > 1 ? "s" : ""));		
	}

	public void setReintentos(int reintentos) {
		this.reintentos = reintentos;
	}	
}
