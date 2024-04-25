import java.io.*;
import java.net.*;
class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client of Marvellous chat messanger is running...");

        Socket sobj = new Socket("localhost",2100);
        System.out.println("Client is waiting for server to accept the request...");

        printStream ps = new printStream(sobj.getOutputStream());

        BufferReader br1 = new BufferedReader(new InputStream(sobj.getInputStream()));
        BuffeReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Marvellous chat messanger started...");

        string str1,str2;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.println("Enter message for server : ");
            str2 = br1.readLine();
            System.out.println("server says :"+str2);
        }

        System.out.println("Thank you for using Marvellous chat messanger...");

    }
}