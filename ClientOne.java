package socketProgramming;
import java.net.*;  
import java.io.*;  

public class ClientOne {
  
    public static void main(String args[])throws Exception{  
    	
    Socket socket = new Socket("localhost",3332);  
    
    DataInputStream dataInput=new DataInputStream(socket.getInputStream());  
    
    DataOutputStream dataOuptut=new DataOutputStream(socket.getOutputStream());  
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
    String message ="",message2="";  
    
    while(!message.equals("stop")){  
    	
    message = br.readLine();  
    
    dataOuptut.writeUTF(message);  
    
    dataOuptut.flush();  
    
    message2 = dataInput.readUTF();  
    
    System.out.println("Server says: "+message2);  
    }  
      
    dataOuptut.close();  
    
    socket.close();  
    }
    }  
