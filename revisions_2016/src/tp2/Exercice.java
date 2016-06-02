package tp2;

import javax.swing.JOptionPane;

import tp1.Etudiant;

public class Exercice extends Etudiant{
	public static int nbrDeBonnesReponses =5;
	private static double moy;


	public static double moyenne(){
		moy=(double)(nbrDeBonnesReponses/5)*100;	
		return moy;
	}
	public static void main(String[] args) {
		Etudiant etu1 = new Etudiant();
		etu1.setNom(JOptionPane.showInputDialog("Votre nom : "));
		for (int i = 0; i < 5; i++) {

			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			String reponse = JOptionPane.showInputDialog("Combien font"+a+"+"+b);
			int repInt = Integer.parseInt(reponse);
			if (repInt == (a+b)) {
			} else {
				nbrDeBonnesReponses--;
			}
		}
		JOptionPane.showMessageDialog(null, etu1.nom+" vous avez "+nbrDeBonnesReponses+" sur 5.");
	}
}
