package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile  {

    public String valueOf(String parameter) throws IOException{
        FileReader filereader =new FileReader("src/test/resources/configfiles/config.properties");
        Properties properties = new Properties();
        properties.load(filereader);
        return properties.getProperty(parameter);
    }


    }


