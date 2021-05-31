package javanet;

import java.net.*;
import java.io.*;
public class MyServer {
    public static void main(String[] args) throws Exception {
        int flag=0;
        try{

            ServerSocket server=new ServerSocket(8050);
            Socket serverClient=server.accept();
            DataInputStream inStream=new DataInputStream(serverClient.getInputStream());
            DataOutputStream outStream=new DataOutputStream(serverClient.getOutputStream());
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String clientMessage="";
            while(!clientMessage.equals("bye")){
                if(flag==1) {
                    String serverMessage="";

                    clientMessage = inStream.readUTF();
                    System.out.println("From Client: " + clientMessage);

                    System.out.println("please enter meassage");
                    serverMessage = reader.readLine();
                    outStream.writeUTF(serverMessage);
                    outStream.flush();
                }
                else {
                    clientMessage = inStream.readUTF();
                    System.out.println("From Client: " + clientMessage);
                    String serverMessage="welcome to this server";
                    outStream.writeUTF(serverMessage);
                    flag=1;
                }
            }
            inStream.close();
            outStream.close();
            serverClient.close();
            server.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}