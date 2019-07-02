package college;

import java.io.PrintStream;
import java.net.InetAddress;

public class Ip {
	public Ip() {
	}

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("localhost");
			System.out.println("ip:" + ip.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}