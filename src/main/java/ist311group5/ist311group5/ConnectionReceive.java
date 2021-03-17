package ist311group5.ist311group5;
import java.io.*;
import java.net.*;
/**
 *
 * @author Christopher Robey
 */
public class ConnectionReceive {
    
    public static void receiveConnection() throws IOException { 
        //Application uses port 4000 to listen for connection requests
        ServerSocket receive = new ServerSocket(4000);
        
        //This loops infinitely for requests
        while (true)
        {
            Socket socket = null;
            
            try {
                //recieves incoming requests
                socket = receive.accept();
                
                //TODO: remove this after testing
                //for testing purposes
                System.out.println("Client connected at " + socket);
                
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                
                //create thread
                Thread thread = new ConnectionThread(socket, inputStream, outputStream);
                thread.start(); 
                
                //For testing purposes
                //TODO Delete this
                System.out.println("Thread created and started.");
            }
            catch (IOException e){
                socket.close();
            }
        } 
    }
    
}
