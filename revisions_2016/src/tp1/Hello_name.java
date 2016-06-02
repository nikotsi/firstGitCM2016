package tp1;

import javax.swing.JOptionPane;

public class Hello_name {

	public static void main(String[] args) {

		//JOptionPane.showMessageDialog(null, "message type 0", "title", 0);
		//JOptionPane.showMessageDialog(null, "message type 1", "title", 1);
		//JOptionPane.showMessageDialog(null, "message type 2", "title", 2);
		//JOptionPane.showMessageDialog(null, "message type 0", "title", 3);
		//JOptionPane.showConfirmDialog(null, "message type 0", "title", 0);
		//JOptionPane.showConfirmDialog(null, "message type 1", "title", 1);
		//JOptionPane.showConfirmDialog(null, "message type 2", "title", 2);
		String nom =JOptionPane.showInputDialog("Donnez moi votre nom : ");
		System.out.println("hello "+nom);
		JOptionPane.showMessageDialog(null, "Hello "+nom, "title", 0);
	}

}
