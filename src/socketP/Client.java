package socketP; /**
 * A java program that establishes a simple client connection using stream sockets
 * author : Chiruhas
 * date : 13-8-19
 * program name : socketP.Client.java
 * lab cycle : 4
 * Description : socketP.Client class which acts as a socketP.Client
 * topics: SocketProgramming
 */

// Importing required packages

import java.net.*;
import java.io.*;
import java.util.Scanner;


// java program to initiate client connection
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 3000);

        System.out.println("Connection initiating");

        DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());

        while(true) {
            if (s.isConnected()) {
                System.out.println("Connected");
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the message you want to send to server : ");

                String msg = scanner.nextLine();

                dataOutputStream.writeUTF(msg);
            } else {
                System.out.println("NOT connected");
                break;
            }


            s.close();
        }


    }
}
