/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaClientServer;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author kmpatel
 */
public class ConcurrentServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServerSocket ss =  new ServerSocket(8000);
        System.out.println("Server started");
        DataOutputStream dout;
        while(true){
        Socket s = ss.accept();
        
        
        AreaCalculator t = new AreaCalculator(s);
//        StringCalc t= new StringCalc(s);


        t.start();
        
        }

        // TODO code application logic here
    }
    
}
