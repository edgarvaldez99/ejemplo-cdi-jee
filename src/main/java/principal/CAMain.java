package principal;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import cajero.CajeroAutomatico;

@Path("/")
public class CAMain {

    @Inject
    CajeroAutomatico ca;

    @GET
    public void main() {
    	ca.depositar(new BigDecimal("100.00"));
    }
}
