package socketP; /**
 * A java program that establishes a simple server using ServerSocket
 * <p>
 * author : Chiruhas
 * date : 13-8-19
 * program name : socketP.Server.java
 * lab cycle : 4
 * Description : Sever class which acts as a server
 * topics: SocketProgramming
 */

//importing requiring package

import java.net.*;
import java.io.*;

//ServerSocket from net package to accept communication requested by client
//accept(),getInputStream().

// define the driver class
public class Server {

    // defining main method
    public static void main(String[] args) throws IOException {
        //  create a serverSocket Object

        ServerSocket serverSocket = new ServerSocket(3000);

        //accept a connection initiated by a client

        Socket socket = serverSocket.accept();
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
    while(true) {
        if (socket.isConnected()) {
            System.out.println("Connected on server side");


            // store the data into inputStream


            String msg = inputStream.readUTF();

            System.out.println("socketP.Client :" + msg);


        } else {
            System.out.println("connection failure");
            break;
        }
    }
        //closing connection

        serverSocket.close();
        socket.close();

    }
}
