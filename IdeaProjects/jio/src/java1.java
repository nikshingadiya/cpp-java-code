import java.io.IOException;

public class java1 {
    public static void main(String[] args) throws IOException {
        Character inChar;

        try {

            System.out.print("You entered ");

            String str1 = "";
            Character c;
            while ((c = (char) System.in.read()) != '\n') {
                str1 =str1+c;
            }
            System.out.println(str1);
        } catch (IOException e)
        {
            System.out.println("Error reading from user");
        }
    }


}
