package q1;

public class Exercice {
	private int dificultyLevel;
	private String enoncé;
	private int typeExerice;
	final int TYPE_EXERCICE_QCM = 1;
	final int TYPE_EXERCICE_A_TROU = 2;
	final int TYPE_EXERCICE_VRAI_OU_FAUX = 3;
	final int TYPE_EXERCICE_AUTRE = 4;
	public Exercice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exercice(int dificultyLevel, String enoncé, int typeExerice) {
		super();
		this.dificultyLevel = dificultyLevel;
		this.enoncé = enoncé;
		this.typeExerice = typeExerice;
	}
	
	@Override
	public String toString() {
		return "Enoncé = " + enoncé;
	}
	public int getDificultyLevel() {
		return dificultyLevel;
	}
	public void setDificultyLevel(int dificultyLevel) {
		this.dificultyLevel = dificultyLevel;
	}
	public String getEnoncé() {
		return enoncé;
	}
	public void setEnoncé(String enoncé) {
		this.enoncé = enoncé;
	}
	public int getTypeExerice() {
		return typeExerice;
	}
	public void setTypeExerice(int typeExerice) {
		this.typeExerice = typeExerice;
	}
	public int getTYPE_EXERCICE_QCM() {
		return TYPE_EXERCICE_QCM;
	}
	public int getTYPE_EXERCICE_A_TROU() {
		return TYPE_EXERCICE_A_TROU;
	}
	public int getTYPE_EXERCICE_VRAI_OU_FAUX() {
		return TYPE_EXERCICE_VRAI_OU_FAUX;
	}
	public int getTYPE_EXERCICE_AUTRE() {
		return TYPE_EXERCICE_AUTRE;
	}
}
