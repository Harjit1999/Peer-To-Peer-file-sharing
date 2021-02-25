import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
	  	public static void main(String[] args) {
		    int port=Integer.parseInt(args[0]);
		    
	  		try
	        { 
	            ServerSocket server = new ServerSocket(port); 
             System.out.println("Server started at port no  "+ port);
             while(true)
             {
            	 Socket socket=server.accept();
            	 System.out.println("new client is connected");
            	new ServerThread(socket).start();
             }
//	            Socket socket=server.accept();
//	            BufferedReader us=new BufferedReader(new InputStreamReader(socket.getInputStream()));
//	            String file=us.readLine();
//	            PrintWriter write=new PrintWriter(socket.getOutputStream(),true);
//	            write.println("aaja ajaaa");
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	    }

	}


