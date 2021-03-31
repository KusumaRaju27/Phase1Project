package IODemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws IOException 
	{
		// creating file using file.CreateNewFile()
		File file=new File("desktop://file1.txt");
		boolean status=file.createNewFile();
		if(status) {
			System.out.println("file created");
		}
		else {
			System.out.println("file not created");
		}
		//using FileoutputStream
		String str="Hello evryone";
		FileOutputStream fout=new FileOutputStream("d:/file1.txt");
		fout.write(str.getBytes());
		fout.close();
		
		//create file using java.nio.io.file
		List<String> lines =Arrays.asList("line1","line2");
		Files.write(Paths.get("d:/file3.txt"),lines,StandardCharsets.UTF_8,
				StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		

	}

}
