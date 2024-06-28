import java.io.File;


public class Main {
static File CONFIG_FILE_PATH = new File("settings.properties");


    public static void main(){
        ConfigSettings discogConfig = new ConfigSettings();

        discogConfig.loadConfigsFromFile(CONFIG_FILE_PATH);
    }

}
