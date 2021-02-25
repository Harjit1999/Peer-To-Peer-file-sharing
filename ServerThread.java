import java.net.*;
import java.io.*;
public class ServerThread extends Thread{

	private Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket=socket;
		
	}
	
	public void run() {
		
		try {
			BufferedReader read=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String file =read.readLine();
			PrintWriter write=new PrintWriter(socket.getOutputStream(),true);
			ServerDatabase sb=new ServerDatabase();
			String fname=sb.getFile(file);
			write.println(fname);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
