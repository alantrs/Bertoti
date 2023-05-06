public class App {
    public static void main(String[] args) {
        // Obtém a instância Singleton de AppConfig
        AppConfig config = AppConfig.getInstance();

        // Obtém as configurações do aplicativo
        String appName = config.getAppName();
        String appVersion = config.getAppVersion();

        // Usa as configurações do aplicativo
        System.out.println("Nome do aplicativo: " + appName);
        System.out.println("Versão do aplicativo: " + appVersion);
    }
}
