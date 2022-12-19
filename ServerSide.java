package socketProgramming;

import java.net.*;  
import java.io.*;

public class ServerSide {
	
    public static void main(String args[])throws Exception{  
    	
    ServerSocket serverSocket =new ServerSocket(3332);  
	System.out.println("S : server is started");
    
	System.out.println("S : server is waiting for client request");
    Socket socket=serverSocket.accept();  
    
	System.out.println("S : client connected");
    DataInputStream dataInput =new DataInputStream(socket.getInputStream());  
    
    DataOutputStream dataOuptut =new DataOutputStream(socket.getOutputStream());  
    
    BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));  
      
    String message ="",message2 = "";
    
    while(!message.equals("stop")){  
    	
    	message=dataInput.readUTF();  
    
  	System.out.println("S : client says"+message);
    
    message2=buffer.readLine();  
    
    dataOuptut.writeUTF(message2);  
    
    dataOuptut.flush();  
    }  
    dataInput.close();  
    
    socket.close();  
    
    serverSocket.close();  
    }
    }  


