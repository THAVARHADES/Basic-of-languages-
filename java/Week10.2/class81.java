import java.io.*;
import java.util.*;
import java.net.*;

class class81 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 4000);
        System.out.println("Request send ton server");
        // Sending the message
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a message");
        String msg = scan.nextLine();
        dos.writeUTF(msg);
        // recieving message
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String msg = dis.readUTF();
        System.out.println(msg);
    }
}

class Server {
    public static void main(String[] arsgs) throws IOException {
        ServerSocket ss = new ServerSocket();
        System.out.println("Server is ready");
        Socket s = ss.accept();
        System.out.println("Request accepted by server");
        // recieving the message
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String msg = dis.readUTF();
        System.out.println(msg);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Message");
        String msg = scan.nextLine();
        dos.writeUTF(msg);
    }
}