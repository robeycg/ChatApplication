package ist311group5.ist311group5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginCntl {
    public boolean authenticate(String userName, String password) {
        String file = "userList.txt";
        try {
            File accountFile = new File(file);
            Scanner reader = new Scanner(accountFile);
            while(reader.hasNextLine()) {
                String[] line = reader.nextLine().split(" ");
                if (line[0].equals(userName) && line[1].equals(password)) {
                    return true;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file found.");
        }

        return false;
    }
}