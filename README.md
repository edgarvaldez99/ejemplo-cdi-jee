**Este es un proyecto donde se cubre los ejemplo de CDI de JEE**

Los ejemplos están divididos en ramas. Los nombres de las ramas comprenden los num de 01 al 12:

01 - En el primer ejemplo vemos el caso de uso sin usar CDI

02 - En este ejemplo introducimos el concepto de CDI para ello necesitamos hacer lo siguiente:

	Crear un archivo vacio llamado bean.xml dentro de la carpeta META-INF que a su vez debe estar en la carpeta resource
	Usar la anotación @Inject para anotar al método setTransport en la clase CajaAutomáticaImpl
	Usar la anotación @Default para anotar a la clase EstandarTransporte
	Usar la anotación  @Alternative para anotar a las clases SoapTransporte y JsonTransporte
	Usar la anotación @Named para hacer que CajaAutomaticaImpl sea facil de buscar, usando el nombre "ca".
	Cambiar el contenido de la clase CAMain para que funcione como un Recurso web. Esto se hace para que podamos usar Wildfly como contenedor de CDI y las Injectiones puedan funcionar, para luego hacer depositos y extraciones y ver que pasa en la consola.

03 - En este ejemplo quitamos el @Alternative a las clases SoapTransporte y JsonTransporte, para probar que pasa.

	Al hacer esto la aplicación tira el siguiente error:
			Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-001409: Ambiguous dependencies for type CATransporte with qualifiers @Default
	  at injection point [BackedAnnotatedParameter] Parameter 1 of [BackedAnnotatedMethod] @Inject public cajero.CajeroAutomaticoImpl.setTransporte(CATransporte)
	  at cajero.CajeroAutomaticoImpl.setTransporte(CajeroAutomaticoImpl.java:19)
	  Possible dependencies: 
	  - Managed Bean [class transportes.JsonTransporte] with qualifiers [@Any @Default],
	  - Managed Bean [class transportes.EstandarTransporte] with qualifiers [@Default @Any],
	  - Managed Bean [class transportes.SoapTransporte] with qualifiers [@Any @Default]

	Esto se debe a que CDI no sabe cual de las tres implementaciones de CATransporte va a inyectar


04 - Probar que al sacarle @Default a la clase EstandarTransporte siga instanciandola de igual forma, en vez de instanciar los que tengan @Alternative

	Funcionó, Se instanció de igual forma el EstandarTransporte


05 - Al poner el tag alternatives en el archivo beans.xml, probar si este es o no instanciado en vez del @Default, es decir, reemplazar por ejemplo el EstandarTransporte por la instancia del JsonTransporte (Esta es una forma de seleccionar otra instancia sin el uso de @Qualifier).
	
	Funciona. El transporte indicado en el tag alternatives es el instanciado. Esto se puede utilizar cuando lo que se va a instanciar depende de la situación, por ejemplo, el metodo de transporte depende de la ciudad donde se instala el cajero: simplemente se cambia el transporte en el beans.xml


06 - Trasladar el @Inject a nivel de construnctor.

	En este caso la inyección también funcionó a la perfección


07 - Probar el uso de @Produces, ver que pasa con la obtención de instancias de una de las implementaciones de CATransporte si la clase factory es creada, en caso de error describir la solución.

	Ocurre el error de Ambiguedad, puesto que al agregar @Produces es como si fuera que se agregó una implementación más de la interface CATransporte, por ende, para que el error deje de saltar hay que poner @Alternative a la clase que anteriormente era la instancia por defecto, en este caso a EstandarTransporte debemos de anotarlo con @Alternative.