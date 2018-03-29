package transportes;

public class SoapTransporte implements CATransporte {

	private int reintentos;

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via SOAP con " + this.reintentos + " reintento" + (this.reintentos > 1 ? "s" : ""));
	}

	public void setReintentos(int reintentos) {
		this.reintentos = reintentos;
	}
}