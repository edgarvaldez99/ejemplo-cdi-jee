package transportes;

public class EstandarTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via Estandar");		
	}	
}
