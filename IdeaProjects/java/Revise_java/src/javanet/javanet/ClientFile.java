package javanet;

import java.io.*;
import java.net.*;

public class ClientFile {


    public static void main(String[] args) throws Exception {
        try{
            Socket socket=new Socket("127.0.0.1",8050);
            DataInputStream inStream=new DataInputStream(socket.getInputStream());
            DataOutputStream outStream=new DataOutputStream(socket.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            if(socket.isConnected())
            {
                System.out.println("Connected to server");
            }
            FileOutputStream fout= new FileOutputStream(
                    "C:\\Users\\nikhil\\IdeaProjects\\Revise_java\\src" +
                            "\\javanet\\javanet\\received.txt");
            DataInputStream din=new DataInputStream(socket.getInputStream());
            int r;
            while((r=din.read())!=-1)
            {
                fout.write((char)r);
            }
            socket.close();
            inStream.close();
            outStream.close();
            socket.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}