import Configuracion.AppConfig;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        System.out.println("URL del Servidor: " + config.getUrlServer());
        System.out.println("Puerto del servidor: "+config.getPort());
        System.out.println("Nombre de usuario: " + config.getUsername());
        System.out.println("Password: " + config.getPassword());
        System.out.println("Nombre de la base de datos: " + config.getDb());
        System.out.println();
        config.setUrlServer("http://miapi.com");
        config.setPort(80);
        config.setUsername("root");
        config.setPassword("");
        config.setDb("prueba");
        System.out.println("Nueva URL del Servidor: " + config.getUrlServer());
        System.out.println("Nuevo puerto del servidor: "+config.getPort());
        System.out.println("Nuevo nombre de usuario: " + config.getUsername());
        System.out.println("Nueva contraseña: " + config.getPassword());
        System.out.println("Nuevo nombre de la base de datos: " + config.getDb());
    }
}