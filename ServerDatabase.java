
public class ServerDatabase {
 
	private String[] file=new String[] {"file1","file2","client"};
	private String[] port=new String[] {"300","400","500"};
   public String getFile(String name)
   {
	   for(int i=0;i<file.length;i++)
	   {
		   if(file[i].equals(name))
		   {
			   return port[i] ;
		   }
	   }
	   return "file not Found";
   }
	
}
