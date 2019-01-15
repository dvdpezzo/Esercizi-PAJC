package it.unibs.pajc.clientserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client{
	private Socket socket;
	private ObjectOutputStream output_stream;
	private ObjectInputStream input_stream;
	
	public Client() throws IOException, ClassNotFoundException{
		try {
			attemptToConnect();
			createStreams();
			initProcessing();
		}
		finally {
			close();
		}
	}
	
	private void attemptToConnect() throws IOException {
		System.out.println("CLIENT -> CONNESSIONE VERSO UN SERVER .....");
		socket = new Socket("localhost",29999);
		System.out.println("CLIENT -> CONNESSIONE AVVENUTA VERSO "+ socket.getInetAddress()+" ALLA PORTA REMOTA "+socket.getPort() + " E ALLA PORTA LOCALE " + socket.getLocalPort());
	}
	
	private void createStreams() throws IOException{
		output_stream = new ObjectOutputStream (socket.getOutputStream());
		output_stream.flush();
		
		input_stream = new ObjectInputStream(socket.getInputStream());
		System.out.println("CLIENT -> STREAM CREATI");
	}
	
	private void initProcessing() throws IOException{
		String server_msg = "...";
		sendDataToServer("CLIENT -> DAMMI IL TEMPO CORRENTE");
		try {
			server_msg = (String) input_stream.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(server_msg);
	}
	
	private void close() throws IOException{
		System.out.println("CLIENT -> CHIUSURA CONNESSIONE SOCKET");
		if(output_stream != null && input_stream != null && socket != null) {
			output_stream.close();
			input_stream.close();
			socket.close();
		}
	}
	
	private void sendDataToServer (String msg) throws IOException{
		output_stream.writeObject(msg);
		output_stream.flush();
	}
	
	public static void main (String args[]) throws IOException, ClassNotFoundException{
		new Client();
	}

}
