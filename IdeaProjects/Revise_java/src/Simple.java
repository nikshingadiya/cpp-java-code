import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Scanner;

public class Simple {

    public static void  main(String[] args)
    {
         System.out.println("nikhil");
        System.out.println("simple message");


        System.err.println("error message");
        try{
            FileOutputStream fout=new FileOutputStream("testout.txt");
            String myname="nikhil";

            byte b[]=myname.getBytes();//converting string into byte array
            fout.write(b);

            fout.close();

            FileInputStream fin=new FileInputStream("testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);

            }

            fin.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}

        try{
            URL url=new URL("http://www.javatpoint.com/java-tutorial");

            System.out.println("Nikhil="+url.toString());
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());

        }catch(Exception e){System.out.println(e);}
    }
}
