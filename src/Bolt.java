
public class Bolt extends ThreadedFastener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5664807807161708504L;
	private double length;
		
	public Bolt(double l, String di, String mat, String fin, double up, int us) throws IllegalFastener{
		super(di, mat, fin, up, us);
		setLength(l);
	}

	private void setLength(double l) throws IllegalFastener{
		double temp = l;
		if (temp>=.5 && temp<=6) {
			temp *= 100;
			if (temp%25 != 0) 
				throw new IllegalFastener("illegal length  (found between 1/2\" and 6\")");
		}else if (temp>6 && temp<=11) {
			temp *= 10;
			if (temp%5 != 0) 
				throw new IllegalFastener("illegal length (found between 6\" and 11\")");
		}else if (temp>11 && temp <=20) {
			if (temp%1 != 0)
				throw new IllegalFastener("illegal length (found between 11\" and 20\")");
		}else if (temp<.5 || temp>20)
			throw new IllegalFastener("Illegal lenget (outside 1/2\" - 20\")");
		
		this.length=l;			
	}
	//string used for extensions of bolt in toString method
	public String boltString() {
		return this.length + "\" long, ";
	}
	
	
}