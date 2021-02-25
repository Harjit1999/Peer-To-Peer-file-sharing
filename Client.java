import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class Client {

	public static void main(String[] args)throws Exception {
		
		int port=Integer.parseInt(args[0]);
		Scanner sc=new Scanner(System.in);
		System.out.println("PRESS 1 to search file from database \n  PRESS 2 for directly connected to client at known port");
		int choice=sc.nextInt();
	
		if(choice==1)
		{
		
           Socket socket = new Socket("localhost",port); 
            System.out.println("Connected"); 
            BufferedReader us=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a file name");
            String file=us.readLine();
            PrintWriter write=new PrintWriter(socket.getOutputStream(),true);
             write.println(file);
             BufferedReader read=new BufferedReader(new InputStreamReader(socket.getInputStream()));
           System.out.println(read.readLine());
            socket.close();
        } 
		else
		{
			byte []b=new byte[2002];
			Socket socket=new Socket("localhost",port);
	        InputStream is=socket.getInputStream();
	        FileOutputStream fr=new FileOutputStream("F:\\recieve.txt");
	        is.read(b,0,b.length);
	        fr.write(b,0,b.length);
	        socket.close();
		}
        
        	}

}
