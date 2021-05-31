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
public class AreaCalculator extends Thread {
    Socket csocket;
    
    AreaCalculator(Socket s){
        this.csocket =s;
    }
    public void run(){
        DataInputStream din;
        DataOutputStream dout;
        System.out.println( "Accepted Client Address - " + csocket.getInetAddress().getHostName());
        try {
            din = new DataInputStream(csocket.getInputStream());
            dout =  new DataOutputStream(csocket.getOutputStream());
            int r = din.readInt();
            double area = 3.14*r*r;
            System.out.println("The area for this client is "+ area);
            dout.writeDouble(area);
            
        } catch (IOException ex) {
            Logger.getLogger(AreaCalculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
