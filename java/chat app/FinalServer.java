package college;

import javax.swing.JTextArea;

public class FinalServer extends javax.swing.JFrame implements java.awt.event.ActionListener {
	static java.net.ServerSocket server;
	static java.net.Socket conn;
	javax.swing.JPanel panel;
	JTextArea NewMsg;
	JTextArea ChatHistory;
	javax.swing.JButton Send;
	java.io.DataInputStream dis;
	java.io.DataOutputStream dos;
	javax.swing.JScrollPane s;
	javax.swing.JScrollPane s1;

	public FinalServer() throws java.net.UnknownHostException, java.io.IOException {
		panel = new javax.swing.JPanel();
		NewMsg = new JTextArea();
		ChatHistory = new JTextArea();
		Send = new javax.swing.JButton("Send");
		s = new javax.swing.JScrollPane(ChatHistory, 22, 32);
		s1 = new javax.swing.JScrollPane(NewMsg, 22, 32);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(3);
		panel.setLayout(null);
		add(panel);
		s.setBounds(20, 20, 450, 300);
		panel.add(s);
		s1.setBounds(20, 320, 340, 90);
		panel.add(s1);
		Send.setBounds(375, 350, 95, 30);
		panel.add(Send);
		setTitle("Server");
		Send.addActionListener(this);
		server = new java.net.ServerSocket(2000);
		ChatHistory.setText("Waiting for Client\n");
		conn = server.accept();
		ChatHistory.setText(ChatHistory.getText() + "Client Found\n");
		try {
			for (;;) {
				java.io.DataInputStream dis = new java.io.DataInputStream(conn.getInputStream());
				String string = dis.readUTF();
				ChatHistory.setText(ChatHistory.getText() + "\nClient:" + string);
			}
		} catch (Exception e1) {
			ChatHistory.setText(ChatHistory.getText() + "\nMessage     \t\t\t\t\tsending fail:Network Error\n");
			try {
				Thread.sleep(3000L);
				System.exit(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void actionPerformed(java.awt.event.ActionEvent e) {
		if ((e.getSource() == Send) && (NewMsg.getText() != "")) {
			ChatHistory.setText(ChatHistory.getText() + "\nME:" + NewMsg.getText());
			try {
				java.io.DataOutputStream dos = new java.io.DataOutputStream(conn.getOutputStream());
				dos.writeUTF(NewMsg.getText());
			} catch (Exception e1) {
				try {
					Thread.sleep(3000L);
					System.exit(0);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			}
			NewMsg.setText("");
			NewMsg.requestFocus();
		}
	}

	public static void main(String[] args) throws java.net.UnknownHostException, java.io.IOException {
		FinalServer y = new FinalServer();
	}
}