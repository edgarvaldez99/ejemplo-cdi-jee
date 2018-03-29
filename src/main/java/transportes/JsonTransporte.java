package transportes;

public class JsonTransporte {//implements CATransporte {

	private int reintentos;

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via JSON con " + this.reintentos + " reintento" + (this.reintentos > 1 ? "s" : ""));		
	}

	public void setReintentos(int reintentos) {
		this.reintentos = reintentos;	
	}
}