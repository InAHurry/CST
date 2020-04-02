package tes;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(6000);
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer,buffer.length);
        datagramSocket.receive(datagramPacket);


        String info = new String(buffer,0,datagramPacket.getLength());
        //获取客户端地址端口号
        InetAddress address = datagramPacket.getAddress();
        int port = datagramPacket.getPort();
        //向客户端响应数据
        byte[] sendToClient = "ni shi ge sha b".getBytes();
        datagramSocket.send(new DatagramPacket(sendToClient,sendToClient.length,address,port));


    }
}
