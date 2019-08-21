package socketP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * A java program that establishes a simple client connection using stream sockets
 * author : Chiruhas
 * date : 16-8-19
 * program name : socketP.DSender.java
 * lab cycle : 4
 * Description : socketP.Client class which acts as a socketP.Client for udp connection
 * topics: SocketProgramming
 */

// Importing required packages
public class DSender {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        DatagramSocket socket = new DatagramSocket();

        System.out.println("Enter message to be send");
        String s = sc.nextLine();
        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(s.getBytes(),s.length(),ip,3000);

        socket.send(packet);
        socket.close();



    }
}
