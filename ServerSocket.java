
package serversocket;

import com.sun.javafx.print.PrintHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSocket {

    public static void main(String[] args) throws IOException {

        ServerSockett ss =new ServerSockett   (8000);
        Socket s = ss.accept();
        
        System.out.println(" Bağlantı sağlandı");    
       
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        String str = bf.readLine();
        
        System.out.println("Client : " + str);
        
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("evet");
        pr.flush();
        
        
        
        
    }
    
}
