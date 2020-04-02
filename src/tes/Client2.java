package tes;

import java.io.IOException;
import java.net.*;

public class Client2 {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 6000;
        byte[] data = "i am  a client2222222".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length,address,port);
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(datagramPacket);
        /**
         * 接收服务器的响应
         */
        byte[] res = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(res,res.length);
        datagramSocket.receive(datagramPacket1);
        String reply = new String(res,0,res.length);
        System.out.println(reply);
        int a = 0;


    }
}
