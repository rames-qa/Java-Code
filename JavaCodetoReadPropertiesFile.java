package Interview;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaCodetoReadPropertiesFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fis =
                new FileInputStream("config.properties");

        Properties prop = new Properties();

        prop.load(fis);

        System.out.println("URL : " + prop.getProperty("url"));
        System.out.println("Username : " + prop.getProperty("username"));
        System.out.println("Password : " + prop.getProperty("password"));
        System.out.println("Name : " + prop.getProperty("name"));

        fis.close();
    }
}