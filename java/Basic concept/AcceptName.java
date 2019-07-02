
import java.io.*;
public class AcceptName {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a name");
        String name=br.readLine();
        System.out.println("Entred string is "+name);
    }
    
}
