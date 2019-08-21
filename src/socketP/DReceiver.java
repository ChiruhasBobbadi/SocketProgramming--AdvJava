package socketP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DReceiver {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(3000);
        byte buff[] = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buff, buff.length);

        socket.receive(packet);

        String message = new String(packet.getData());

        System.out.println(message);

        socket.close();

    }
}
