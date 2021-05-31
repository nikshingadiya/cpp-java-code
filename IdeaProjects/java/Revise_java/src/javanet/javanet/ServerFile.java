package javanet;

import java.net.*;
import java.io.*;
public class ServerFile {
    public static void main(String[] args) throws Exception {

        try{

            ServerSocket server=new ServerSocket(8050);
            Socket serverClient=server.accept();
            DataInputStream inStream=new DataInputStream(serverClient.getInputStream());
            DataOutputStream outStream=new DataOutputStream(serverClient.getOutputStream());
            FileInputStream fin=new FileInputStream("C:\\Users\\nikhil\\IdeaProjects\\Revise_java\\src\\javanet\\javanet\\Send.txt");

            int r;
            while((r=fin.read())!=-1)
            {
                outStream.write(r);

            }
            System.out.println("\nFiletranfer Completed");
            inStream.close();
            outStream.close();
            serverClient.close();
            server.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}