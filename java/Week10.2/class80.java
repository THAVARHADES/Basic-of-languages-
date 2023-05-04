
import java.net.*;
import java.io.*;
import java.util.*;
import java.io.OutputStream;

/*class client {
    public static void main(String []args) throws Exception{
        Socket s=new Socket("192.16.8.01");
        System.out.println("RequestSend to Server");
        OutputStream os=new OutputStream();s
        DataOutputStream dos=new DataOutputStream();
        String msg="Hello Server";
        das.writeUTF(msg);
    }   
}*/
class server {
    public static void main(String[] args) {
        ServerSocket ss = new ServerSocket(4000);
        System.out.println("Server is ready");
        Socket s = ss.accept();
        System.out.println("Request accepted by server");
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String msg = dis.readUTF();
        System.out.println(msg);
        // Sernding the Message
        OutputStream os = new OutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner scan = new Scanner(System.in);
        msg = scan.nextLine();
        dos.writeUTF(msg);
    }
}