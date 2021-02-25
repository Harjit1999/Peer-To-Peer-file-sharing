import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");// TODO Auto-generated method stub
	       try
	       {
	    	    Socket soc=new Socket("172.168.95.39",848);
	            BufferedReader us=new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("enter a string");
	            String str=us.readLine();
	            PrintWriter out=new PrintWriter(soc.getOutputStream(),true);
	            out.println(str);
	            BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()));
	            System.out.println(in.readLine());
	       }
	        catch(Exception e)
	       {
	        	e.printStackTrace();
	       }
	        
	        
		}
	}


