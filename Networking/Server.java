import java.io.*;
import java.net.*;

class Server
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Server of Marvellous chat messanger is running...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is in the Listening of mode at port no : 2100");

        Socket sobj = ssobj.accept();
        System.out.println("Client and Server connection is succcesful...");

        printStream ps = new printStream(sobj.getoutputStream());

        BufferReader br1 = new BufferedReader(new InputStream(sobj.getInputStream()));
        BuffeReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Marvellous chat Messanger started...");

        string str1, str2;

        while((str1 = br1.readLine())!= null)
        {
            System.out.println("client says :"+str1);
            System.out.println("Enter message for client :");
            str2 = br2.readLine();
            ps.println(str2);
        }
        System.out.println("thank you for using chat messanger..");

        ssobj.close();
        sobj.close();
        ps.close();
        br1.close();
        br2.close();

    }
}