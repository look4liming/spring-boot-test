package lee.bright.netty.nettytest.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Bright Lee
 */
public class EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		for (int i = 1; i <= 30000; i++) {
			new Thread() {
				public void run() {
					Socket socket = null;
					try {
						socket = new Socket("127.0.0.1", 6666);
						OutputStream out = socket.getOutputStream();
						out.write("Hello!!!".getBytes("UTF-8"));
						out.flush();
						InputStream in = socket.getInputStream();
						InputStreamReader r = new InputStreamReader(in, "UTF-8");
						StringBuilder buf = new StringBuilder();
						int c = -1;
						while ((c = r.read()) != -1) {
							buf.append((char) c);
						}
						System.out.println(buf);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (socket != null) {
							try {
								socket.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}.start();
			if (i % 2000 == 0) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
