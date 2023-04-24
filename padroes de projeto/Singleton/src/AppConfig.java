public class AppConfig {

    // A instância Singleton é armazenada neste campo estático
    private static AppConfig instance;

    // As configurações são armazenadas nestes campos
    private String appName;
    private String appVersion;

    // O construtor é declarado privado para evitar que outras classes instanciem AppConfig diretamente
    private AppConfig() {
        // Aqui, lemos as configurações do aplicativo de um arquivo de propriedades ou do sistema de configuração do aplicativo e armazenamos em cache nos campos 'appName' e 'appVersion'
        appName = "Minha Aplicação";
        appVersion = "1.0";
    }

    // O método getInstance() retorna a instância AppConfig existente ou cria uma nova, se ainda não existir
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    // Métodos para obter as configurações do aplicativo
    public String getAppName() {
        return appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
}
