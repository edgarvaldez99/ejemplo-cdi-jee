package transportes;

public class JsonTransporte implements CATransporte {

	public void comunicarseConElBanco(byte[] datapacket) {
		System.out.println("Comunicación con el banco via JSON");		
	}
}
