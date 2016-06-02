package tp2Ex5;

public class ExerciceQCM {
	private int level;
	private String ennonce;
	private String propositions[];
	private boolean reponse;
	public ExerciceQCM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExerciceQCM(int level, String ennonce, String[] propositions, boolean reponse) {
		super();
		this.level = level;
		this.ennonce = ennonce;
		this.propositions = propositions;
		this.reponse = reponse;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getEnnonce() {
		return ennonce;
	}
	public void setEnnonce(String ennonce) {
		this.ennonce = ennonce;
	}
	public String[] getPropositions() {
		return propositions;
	}
	public void setPropositions(String[] propositions) {
		this.propositions = propositions;
	}
	public boolean isReponse() {
		return reponse;
	}
	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}

}
