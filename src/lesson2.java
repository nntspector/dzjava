import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class lesson2 {
    public static void main(String[] args){
        String jsonString = "[{ \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":" +
                "\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\"," +
                "\"предмет\":\"Физика\"}]";
        JSONArray jsonArray = new JSONArray(jsonString);
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i <jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String surname =obj.getString("фамилия");
            String mark = obj.getString("оценка");
            String object = obj.getString("предмет");
            String result = String.format ("Студент %s получил по предмету %s оценку %s",surname,object,mark);
            str1.append (result);
            str1.append (System.lineSeparator());
        }
        String resultString = str1.toString();
        System.out.println(resultString);
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("itog.txt"));
            writer.write(resultString);
            writer.close();
        } catch (IOException e){
            Logger logger = Logger.getLogger("MyLog");
            FileHandler fh;
            try {
                fh = new FileHandler("errors.log");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);
                logger.severe("Exception occurred: " + e.getMessage());
            } catch (IOException | SecurityException ex) {
                logger.severe("Exception occurred: " + ex.getMessage());
            }
        }

    }
}
