package utilities;

import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {
@DataProvider(name= "jsondata")
    public String [] jsonReader() throws IOException, ParseException {

       JSONParser Parser = new JSONParser();
        FileReader reader =new FileReader("src/test/resources/testdata/loginData.json");
        Object obj =  Parser.parse(reader);

        JSONObject jobj = (JSONObject) obj;
        JSONArray arr =(JSONArray) jobj.get("loginCredentials");

        String array[] =new String [arr.size()];

        for(int i= 0;i<=arr.size();i++){
            JSONObject users =(JSONObject) arr.get(i);
            String username =(String)users.get("username");
            String password =(String)users.get("password");
            array[i] = username +","+password;
        }

        return array;
    }
}
