/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaClientServer;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author kmpatel
 */
public class MyClient {
    public static void main(String args[]) throws IOException{
        Socket s =  new Socket("localhost",8000);
        System.out.println("Client connected");
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while(str.compareTo("Bye")!=0){
        str = br.readLine(); 
        out.writeUTF(str);  
        }
        System.out.println("Server received " + in.readUTF() );
               
    }
}
