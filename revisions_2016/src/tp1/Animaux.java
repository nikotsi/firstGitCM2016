package tp1;

public class Animaux {
	private String espece;
	private String nom;
	private int age;
	private float poids;
	private float taille;
	private String couleur;

public String toString(){
		return "Espece "+espece+","+nom+","+age+","+poids+","+taille+","+couleur;
	}
public void jeMange(){
	System.out.println("je Mange");
}
public void jeCours(){
	System.out.println("je cours");
}
public void jeDors(){
	System.out.println("je dors");
}
	public static void main(String[] args) {
		Animaux anim = new Animaux();
		anim.espece="Chien";
		anim.nom="Toto";
		anim.age=12;
		anim.poids=15;
		anim.couleur="Rouge";
		System.out.print(anim);
		anim.jeCours();
	
	}
	
}
