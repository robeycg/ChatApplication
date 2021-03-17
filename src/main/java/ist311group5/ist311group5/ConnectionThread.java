package ist311group5.ist311group5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Christopher Robey
 */
public class ConnectionThread extends Thread{
    
    final DataInputStream inputStream;
    final DataOutputStream outputStream;
    final Socket socket;
    
    public ConnectionThread(Socket socket, DataInputStream inputStream, DataOutputStream outputStream){
        this.socket = socket;
        this.inputStream = inputStream;
        this.outputStream = outputStream;
    }
    
    public void CloseConnectionThread() throws IOException{
        this.inputStream.close();
        this.outputStream.close();
        this.socket.close();
    }
    
}
