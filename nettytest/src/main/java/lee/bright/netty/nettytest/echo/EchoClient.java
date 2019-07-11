package lee.bright.netty.nettytest.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 6666);
		OutputStream out = socket.getOutputStream();
		out.write("Hello!!!".getBytes("UTF-8"));
		out.flush();
		InputStream in = socket.getInputStream();
		InputStreamReader r = new InputStreamReader(in, "UTF-8");
		int c = -1;
		while ((c = r.read()) != -1) {
			System.out.print((char) c);
		}
		socket.close();
	}

}
