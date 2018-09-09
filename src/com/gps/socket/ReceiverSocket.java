package com.gps.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ReceiverSocket {

	public static void main(String[] args) {
		ServerSocketChannel serverSocketChannel;
		try {
			serverSocketChannel = ServerSocketChannel.open();
			serverSocketChannel.socket().bind(new InetSocketAddress(8888));
			System.out.println("Server is listening");

			while (true) {
				SocketChannel socketChannel = serverSocketChannel.accept();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
