
public class CarriageBolt extends Bolt{
	// length, thread/(di)ameter,  material, finish, price/unit, unit size

	/**
	 * 
	 */
	private static final long serialVersionUID = -3440558740476702974L;

	public CarriageBolt(double l, String di, String mat, String fin, double up, int us) throws IllegalFastener{
		super(l, di, mat, fin, up, us);
	}
	// string to summarize instance 
	public String toString() {
		return "Carriage Bolt " + this.boltString() + this.threadString() + this.fastenerString();
	}
}
