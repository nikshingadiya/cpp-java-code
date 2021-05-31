/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaClientServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmpatel
 */
public class StringCalc extends Thread {
    Socket csocket;
    
    StringCalc(Socket s){
        this.csocket =s;
    }
    public void run(){
        DataInputStream din;
        DataOutputStream dout;
        System.out.println( "Accepted Client Address - " + csocket.getInetAddress().getHostName());
        try {
            dout = new DataOutputStream(csocket.getOutputStream());
            //BufferedReader br = new BufferedReader(new InputStreamReader(csocket.getInputStream()));
            din = new DataInputStream(csocket.getInputStream());
            String str="";
            String rcvdstr = "";
            while(str.compareTo("Bye")!=0){
                str = din.readUTF() ;
                rcvdstr += str;
            }
            dout.writeUTF("Length of the string is" + rcvdstr.length());
        } catch (IOException ex) {
            Logger.getLogger(StringCalc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
