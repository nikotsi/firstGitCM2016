package q1;

public class ExerciceATrou extends Exercice{
	private String bonneReponse;
	private String finDeLEnonce;
	public ExerciceATrou() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExerciceATrou(int dificultyLevel, String enoncé,String bonneReponse, String finDeLEnonce) {
		super();
		this.setBonneReponse(bonneReponse);
		this.setFinDeLEnonce(finDeLEnonce);
		// TODO Auto-generated constructor stub
	}
	public String getBonneReponse() {
		return bonneReponse;
	}
	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}
	public String getFinDeLEnonce() {
		return finDeLEnonce;
	}
	public void setFinDeLEnonce(String finDeLEnonce) {
		this.finDeLEnonce = finDeLEnonce;
	}

}
