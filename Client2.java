import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client2 {

	public static void main(String[] args) {
		int port=Integer.parseInt(args[0]);
	
	
		try
        {   ServerSocket server=null;
		
            server=new ServerSocket(port);
            System.out.println("client at port " +port);
            Socket socket = server.accept(); 
            
            System.out.println("Connected"); 

            FileInputStream fr=new FileInputStream("D:\\client.txt");
            byte []b=new byte[2002];
            fr.read(b,0,b.length);
            OutputStream os=socket.getOutputStream();
            os.write(b,0,b.length);
            } 
        catch(IOException i) 
        { 
            System.out.println(i); 
        } 

	}
}
