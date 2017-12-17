package transportes;

public interface CATransporte {
	public void comunicarseConElBanco(byte[] datapacket);
	public void setReintentos(int reintentos);
}
