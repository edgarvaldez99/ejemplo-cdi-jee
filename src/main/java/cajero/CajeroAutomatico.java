package cajero;

import java.math.BigDecimal;

public interface CajeroAutomatico {
	public abstract void depositar(BigDecimal bd);
    public abstract void extraer(BigDecimal bd);
}
