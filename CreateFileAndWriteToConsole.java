import java.io.*; 
class CreateFileAndWriteToConsole
 {
	 public static void main(String[]args) 
	 { 
	 try {
		 FileWriter fw=new FileWriter("co6exp2.txt");
		 fw.write("this is experimenmt 2 of co6.this is my file content"); 
		 fw.close();
		 System.out.println("\nFile Write done");
		 char c;
		 FileReader fr=new FileReader("co6exp2.txt");
		 BufferedReader in=new BufferedReader(fr); 
		 String line=in.readLine(); 
		 while(line!=null)
			 {
				 System.out.println(line);
				 line=in.readLine(); 
		 } in.close();
		 fr.close();
		 }
		 catch(IOException e)

	{
		System.out.println("there are some IOException");
	}
	}
	}