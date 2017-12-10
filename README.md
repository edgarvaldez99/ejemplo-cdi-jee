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

