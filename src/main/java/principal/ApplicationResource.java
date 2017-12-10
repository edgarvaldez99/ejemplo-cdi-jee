package principal;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/*
ApplicationPath es la 'direccion base' de los recursos
Por ejemplo:
@ApplicationPath("/path/to/app/")
indicaria que todos los recursos ejecutables se
acceden a traves de /path/to/app

Luego, si un recurso define su path como /recurso1
se está definiendo que el path para acceder al recurso es
en realidad
/path/to/app/recurso1
*/
@ApplicationPath("/")
public class ApplicationResource extends Application {
}