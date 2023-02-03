package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static final int PORT = 8000;
	
	public EchoServer() {
		try {
			int cnt = 0;
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("EchoServer Start........");
			while(true) {
				//Client�� ���� �Ҷ����� ��� ����
				Socket sock = server.accept();
				EchoThread et = new EchoThread(sock);
				et.start();
				cnt++;
				System.out.println("Client" + cnt + "Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Client�� ���� �����ϱ� ���� Thread ��� ���� Ŭ���� ����
	
	class EchoThread extends Thread{
		BufferedReader in;
		PrintWriter out;
		Socket sock;
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			try {
				//Client�� �����ϸ� ó������ �޴� �޼���
				out.println("Hello Enter BYE to Exit");
				while (true) {
					//Client�� �޼��� ���������� ���
					String line = in.readLine();
					if(line==null)
						break;
					else {
						out.println("Echo : " + line);
						if(line.equalsIgnoreCase("BYE"))
							break;
					}
				}//while
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		EchoServer server = new EchoServer();
	}

}
