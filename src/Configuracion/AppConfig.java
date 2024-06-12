package Configuracion;


public class AppConfig {
    private static AppConfig instance;
    private String UrlServer;
    private int port;
    private String db;
    private String username;
    private String password;

    public AppConfig() {
        UrlServer = "urlDefault";
        this.port = 0;
        this.db = "dbDefault";
        this.username = "usernameDefault";
        this.password = "passwordDefault";
    }

    public static synchronized AppConfig getInstance(){
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }

    public String getUrlServer() {
        return UrlServer;
    }

    public void setUrlServer(String urlServer) {
        UrlServer = urlServer;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
