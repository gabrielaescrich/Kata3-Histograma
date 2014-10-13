package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailReader {

    private final String filePath;

    public MailReader(String filePath) {
        this.filePath = filePath;
    }
    
    public String[] realDomains(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            ArrayList<String> domainList = new ArrayList<>();
            return null;
        } catch (FileNotFoundException ex) {
            return new String[0];
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(MailReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
