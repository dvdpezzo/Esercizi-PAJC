package it.unibs.pajc.clientserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerMain {
	private ServerSocket server_socket;
	private Socket socket;
	private ObjectOutputStream output_stream;
	private ObjectInputStream input_stream;
	
	public ServerMain() throws IOException, ClassNotFoundException{
		try {
			server_socket = new ServerSocket(29999,10);
			while (true) {
				listen();
				createStream();
				initProcessing();
			}
			
		}
		finally {
			close();
		}
	}

	private void listen() throws IOException{
		System.out.println("SERVER -> IN ATTESA DI CONNESSIONI .....");
		socket =  server_socket.accept();
		System.out.println("SERVER -> CONNESSO CON "+ socket.getInetAddress() + " ALLA PORTA REMOTA " + socket.getPort() + " E ALLA PORTA LOCALE " + socket.getLocalPort());
	}
	
	private void createStream () throws IOException {
		output_stream = new ObjectOutputStream (socket.getOutputStream());
		output_stream.flush();
		
		input_stream = new ObjectInputStream(socket.getInputStream());
		System.out.println("SERVER -> STREAM CREATI");
	}
	
	private void initProcessing() throws IOException, ClassNotFoundException{
		String client_msg="";
		client_msg= (String) input_stream.readObject();
		System.out.println(client_msg);
		sendDataToClient("SERVER->"+ new Date().toString());
	}
	
	private void sendDataToClient(String msg) throws IOException{
		output_stream.writeObject(msg);
		output_stream.flush();
	}
	
	private void close() throws IOException{
		System.out.println("SERVER -> CHIUSURA CONNESSIONE SOCKET");
		if(output_stream != null && input_stream != null && socket != null) {
			output_stream.close();
			input_stream.close();
			socket.close();
		}
	}
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		new ServerMain();
	}
}

