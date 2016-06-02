package tp2Ex4;

import javax.swing.JOptionPane;

public class MainEtudiant extends Etudiant{


	public static void main(String[] args) {
		Etudiant etu1=new Etudiant();
		etu1.nom =JOptionPane.showInputDialog("Votre nom : ");
		etu1.prenom= JOptionPane.showInputDialog("Votre prénom : ");
		etu1.numero= JOptionPane.showInputDialog("Votre numero : ");

		
		int cotes1[]={1,2,3,4,5};

		System.out.println(etu1);
		int i = 0;
		while (!(i==4)) {

			i++;
			System.out.println("Cote n°"+i+" : "+cotes1[i]);
		}
	}
}
