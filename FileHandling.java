package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("//home//arun//Documents//fileHandling//files//demo.txt");
		
		file.mkdirs();
		
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file,true);
		BufferedWriter Bwriter = new BufferedWriter(writer);
		
		Bwriter.write("hi dude");
		Bwriter.newLine();
		
		Bwriter.write("bruh");
		Bwriter.newLine();
		
		Bwriter.write("hello world");
		
		Bwriter.flush();
		
		Bwriter.close();
	
		
		FileReader reader = new FileReader(file);
		BufferedReader Breader = new BufferedReader(reader);
		
		String lines = Breader.readLine();
		
		while(lines != null) {
			System.out.println(lines);
			lines = Breader.readLine();
		}		
		
		
		
	}

	
	
}
