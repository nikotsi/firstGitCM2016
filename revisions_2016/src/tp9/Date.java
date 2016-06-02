package tp9;

public class Date implements Comparable<Date>{
	protected int y;
	protected int m;
	protected int d;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return  y + "/" + m + "/" + d;
	}
	@Override
	public int compareTo(Date o) {
		return (int) (this.y*10000+this.m*100+this.d-(0.y*10000+o.m*100+o.d));
		
	}
	

}
