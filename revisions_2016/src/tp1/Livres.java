package tp1;

public class Livres {
	public String auteur;
	public String titre;
	public int page;
	public static void main(String[] args) {
		Livres livre1 =new Livres();
		livre1.auteur="Jean";
		livre1.titre="Salut";
		livre1.page=8;
		System.out.println("Auteur : "+livre1.auteur+"\nTitre : "+livre1.titre+"\nNombre de pages : "+livre1.page);

	}

}
