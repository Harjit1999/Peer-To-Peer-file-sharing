import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("waiting...");
		try
		{
		ServerSocket ss=new ServerSocket(848);
		Socket soc=ss.accept();
		System.out.println("connected...");
		BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
		String str=in.readLine();
		PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
		out.println("server says:"+str);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	}


